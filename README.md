# Proyecto: CRUD de Matrículas de Estudiantes - UNSA

## Descripción
Este es un sistema de gestión de matrículas para estudiantes de la UNSA, desarrollado en Java con una arquitectura basada en MVC (Modelo-Vista-Controlador). Incluye una interfaz gráfica creada con Swing y una conexión a base de datos mediante JDBC.

## Estructura del Proyecto
```
MATR_UNS/
|-- build.xml                 # Archivo de construcción de NetBeans
|-- manifest.mf               # Archivo de manifiesto
|-- Escudo_UNSA.png           # Logo de la universidad
|-- Drivers/
|   |-- ojdbc17.jar           # Driver JDBC para conexión a Oracle
|-- src/
|   |-- giu/                 # Interfaces gráficas
|   |   |-- LoginD.java
|   |   |-- Registr.java
|   |   |-- vista.java
|   |-- matr_uns/            # Clases del modelo de datos
|   |   |-- Carrera.java
|   |   |-- Estudiante.java
|   |   |-- Matriculass.java
|   |   |-- Users.java
|   |-- persistencia/        # Capa de acceso a datos
|   |   |-- DB_connection.java
|-- nbproject/                # Archivos de configuración de NetBeans
|-- build/                    # Carpeta con clases compiladas
```

## Tecnologías Utilizadas
- **Java SE** - Lenguaje de programación principal
- **Swing** - Para la interfaz de usuario
- **JDBC** - Conexión con la base de datos
- **Oracle Database** - Base de datos utilizada
- **NetBeans** - Entorno de desarrollo recomendado

## Instalación y Configuración
1. **Clonar el repositorio:**
   ```sh
   git clone https://github.com/DarwinTQ/CRUD---JAVA
   ```
2. **Abrir el proyecto en NetBeans o Visual Studio Code.**
3. **Configurar la base de datos:**
   - Crear una base de datos en Oracle.
   - Importar las tablas necesarias.
   - Configurar `DB_connection.java` con las credenciales correctas.
4. **Agregar el driver JDBC a las librerías del proyecto.**
5. **Compilar y ejecutar el proyecto.**

## Funcionalidades
- **Inicio de sesión** con validación de usuario.
- **Registro de estudiantes, matrículas y cursos.**
- **Edición y eliminación** de datos.
- **Visualización de registros** en la interfaz gráfica.

## Contribución
Si deseas contribuir a este proyecto, realiza un fork del repositorio, realiza tus cambios y envía un pull request.

## Autor
[Darwin TQ](https://github.com/DarwinTQ) - [Repositorio del Proyecto](https://github.com/DarwinTQ/CRUD---JAVA)



