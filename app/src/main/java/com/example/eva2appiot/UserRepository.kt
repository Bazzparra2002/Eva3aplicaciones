package com.example.eva2appiot

import com.google.firebase.Timestamp
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.SetOptions
class UserRepository {
    private val db = FirebaseFirestore.getInstance()
    private val usersCollection = db.collection("usuarios")


    fun saveUser(uid: String, email: String, name: String) {
        val userMap = hashMapOf(
            "email" to email,
            "nombre" to name,
            "fechaRegistro" to Timestamp.now()
        )

        usersCollection.document(uid).set(userMap)
            .addOnSuccessListener {
                println("Usuario $uid guardado en Firestore exitosamente.")
            }
            .addOnFailureListener { e ->
                System.err.println("ERROR: Falló al guardar usuario $uid en Firestore: ${e.message}")
            }
    }
}