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
    git clone https://github.com/Bazzparra2002/Eva3aplicaciones.git
    
2.  Abrir en Android Studio:
     Abre Android Studio y selecciona `File` $\rightarrow$ `Open` y navega hasta la carpeta clonada.
3.  Configurar Firebase:
    Asegúrate de que el archivo `google-services.json` esté ubicado en el directorio `app/`.
4.  Ejecutar:
    Selecciona un Emulador AVD o conecta un dispositivo físico.
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

<img width="409" height="895" alt="image" src="https://github.com/user-attachments/assets/bb360d71-77bf-451f-8743-794eed94c5aa" />
<img width="396" height="820" alt="image" src="https://github.com/user-attachments/assets/5a0e80d5-6aac-4d98-a702-cca81f3a8e43" />
<img width="395" height="826" alt="image" src="https://github.com/user-attachments/assets/1f461f38-65a3-44b1-87ac-c4e2cfd861cf" />
<img width="395" height="887" alt="image" src="https://github.com/user-attachments/assets/fea3677c-f32b-4dad-bb6a-5e510f7351b6" />
<img width="392" height="883" alt="image" src="https://github.com/user-attachments/assets/aae967f5-6a25-4959-8701-a8d36c4ef257" />
<img width="403" height="889" alt="image" src="https://github.com/user-attachments/assets/e7045309-d932-4c37-8b1e-4e3df4f1829c" />
<img width="399" height="888" alt="image" src="https://github.com/user-attachments/assets/dfbbc49a-4184-4a1f-9772-8f4fd06c15f7" />
<img width="399" height="891" alt="image" src="https://github.com/user-attachments/assets/90ee762f-8f82-42d9-b340-58ef28a79d51" />
<img width="401" height="888" alt="image" src="https://github.com/user-attachments/assets/deb33bbb-59cb-4d5b-bae7-c2b935ae698b" />
<img width="400" height="79" alt="image" src="https://github.com/user-attachments/assets/5a7bff2a-ea31-440f-8f0d-1f34211956ac" />






