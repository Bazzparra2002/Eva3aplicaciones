package com.example.eva2appiot

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore
import androidx.appcompat.widget.Toolbar
import com.google.firebase.firestore.Query


class HomeActivity : AppCompatActivity() {

    private lateinit var auth: FirebaseAuth
    private lateinit var db: FirebaseFirestore
    private lateinit var recyclerView: RecyclerView

    private lateinit var noticiasAdapter: Noticias
    private val listaNoticias = mutableListOf<Noticia>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        auth = FirebaseAuth.getInstance()
        db = FirebaseFirestore.getInstance()
        recyclerView = findViewById(R.id.recyclerViewNoticias)
        val fabAgregarNoticia = findViewById<FloatingActionButton>(R.id.fabAgregarNoticia)
        val toolbar = findViewById<Toolbar>(R.id.toolbarHome)

        toolbar.inflateMenu(R.menu.menu_home)
        toolbar.setOnMenuItemClickListener { menuItem ->
            if (menuItem.itemId == R.id.action_logout) {
                cerrarSesion()
                true
            } else {
                false
            }
        }

        fabAgregarNoticia.setOnClickListener {
            startActivity(Intent(this, AgregarNoticiaActivity::class.java))
        }

        recyclerView.layoutManager = LinearLayoutManager(this)

        noticiasAdapter = Noticias(this, listaNoticias) { noticia ->
            val intent = Intent(this, VerNoticiaActivity::class.java)
            intent.putExtra("NOTICIA_ID", noticia.id)
            startActivity(intent)
        }
        recyclerView.adapter = noticiasAdapter

        cargarNoticiasDesdeFirestore()
    }

    private fun cargarNoticiasDesdeFirestore() {
        db.collection("noticias")
            .orderBy("fecha", Query.Direction.DESCENDING)
            .addSnapshotListener { snapshots, e ->
                if (e != null) {
                    Toast.makeText(this, "Error al cargar las noticias: ${e.message}", Toast.LENGTH_LONG).show()
                    return@addSnapshotListener
                }

                if (snapshots != null) {
                    val nuevasNoticias = mutableListOf<Noticia>()
                    for (doc in snapshots.documents) {
                        val noticia = doc.toObject(Noticia::class.java)
                        noticia?.let {
                            it.id = doc.id
                            nuevasNoticias.add(it)
                        }
                    }
                    noticiasAdapter.updateData(nuevasNoticias)
                }
            }
    }

    private fun cerrarSesion() {
        auth.signOut()
        Toast.makeText(this, "Sesión cerrada.", Toast.LENGTH_SHORT).show()
        val intent = Intent(this, Login::class.java)
        intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
        startActivity(intent)
    }
}