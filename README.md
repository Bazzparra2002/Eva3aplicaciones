Evaluacion 3 aplicaciones moviles
Eva2appIoT: es una aplicación móvil desarrollada en Android Studio con Kotlin que sirve como interfaz para la gestión de usuarios, el consumo de datos y la interacción básica con dispositivos IoT a través de la conectividad Bluetooth.
La aplicación incorpora funcionalidades de autenticación robustas mediante Firebase y un sistema de visualización de noticias.

- Características Principales:

Autenticación de Usuarios: Registro, inicio de sesión y recuperación de contraseña (simulada) utilizando Firebase Authentication.
Gestión de Datos/Noticias: Modelo de datos en Kotlin (`data class Noticia`) para el manejo estructurado de la información.
Conectividad Bluetooth (IoT): Declaración de permisos necesarios (`BLUETOOTH`, `BLUETOOTH_CONNECT`, `BLUETOOTH_ADMIN`) para futuras integraciones y comunicación con dispositivos IoT.
Interfaz de Usuario (UI): Diseño limpio y adaptable, haciendo uso de `CardView` y `ConstraintLayout` para una experiencia de usuario consistente.
Splash Screen: Pantalla de bienvenida (`Splash` Activity) declarada como punto de entrada principal (`MAIN` y `LAUNCHER`).

--Tecnologías Utilizadas

Lenguaje: Kotlin
Plataforma:Android (SDK)
Persistencia y Autenticación: Firebase
    -Firebase Authentication
    -(Posiblemente Firestore o Realtime Database para la gestión de `Noticia`)
-Librerías de UI:-
    - `androidx.constraintlayout.widget.ConstraintLayout`
    - `androidx.cardview.widget.CardView`

- Instalación y Ejecución:

Sigue estos pasos para configurar y ejecutar el proyecto en tu entorno de desarrollo.

- Pre-requisitos
Tener instalado Android Studio (Ultima versión).
Tener instalado el SDK de Android (API Level 31+ recomendado).
Tener una cuenta de Firebase y haber configurado el proyecto para Android.

Pasos a seguir:

1.  Clonar el Repositorio:
    bash:
    git clone https://github.com/Bazzparra2002/evaluacion3app.git
    
2.  Abrir en Android Studio:
     Abre Android Studio y selecciona `File` $\rightarrow$ `Open` y navega hasta la carpeta clonada.
3.  Configurar Firebase:
    Asegúrate de que el archivo `google-services.json` esté ubicado en el directorio `app/`.
4.  Ejecutar:
    Selecciona un **Emulador AVD o conecta un dispositivo físico.
    Haz clic en el botón Run.

- Estructura de Actividades

La aplicación está organizada con las siguientes actividades principales, definidas en el `AndroidManifest.xml`:

| Activity | Propósito |
| :--- | :--- |
| `Splash` | Punto de entrada inicial y pantalla de bienvenida. |
| `Login` / `Register` / `Recover` | Módulos de autenticación de usuario. |
| `HomeActivity` | Pantalla principal de la aplicación. |
| `AgregarNoticiaActivity` | Interfaz para añadir nuevo contenido. |
| `VerNoticiaActivity` | Visualización detallada de un contenido específico. |




