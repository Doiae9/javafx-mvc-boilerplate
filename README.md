# javafx-mvc-boilerplate
"Plantilla base para proyectos JavaFX 21+ con arquitectura MVC y Maven."
# Plantilla Base JavaFX - Arquitectura MVC Moderna

Este proyecto es un esqueleto configurado con Maven, soporte para módulos (Java 9+) y organizado bajo el patrón Modelo-Vista-Controlador.

## Estructura de Carpetas (`src/main/java/.../crudfx`)

* **`application/`**: Contiene la clase principal (`App` o `Main`) que arranca el programa y carga el primer archivo `.fxml`.
* **`controllers/`**: El puente entre la vista y el modelo. Aquí van las clases que reaccionan a los clics de los botones de la interfaz. (Ej. `LoginController`).
* **`models/`**: Entidades de negocio y datos puros. (Ej. `Usuario`, `Producto`).
* **`utils/`**: Clases de utilidad globales y reutilizables. (Ej. `ConexionBD`, `Validadores`).
* **`Launcher.java`**: (Opcional, fuera de application). Una clase Main "falsa" sin herencia de JavaFX. Se usa estrictamente para poder compilar el `.jar` ejecutable final sin que la JVM arroje errores de componentes faltantes.

## Recursos (`src/main/resources`)
* Aquí deben guardarse todos los archivos `.fxml`, imágenes (`.png`, `.jpg`) y hojas de estilo (`.css`).
* **Regla de oro de las rutas:** Al cargar un FXML desde Java, usa siempre rutas absolutas comenzando con `/` para evitar que se rompa al mover archivos. Ejemplo: `getResource("/vistas/login.fxml")`.

## Configuración Importante
Si creas una nueva subcarpeta en el código (ej. `org.example.crudfx.servicios`), recuerda que debes registrarla en el archivo `module-info.java` para que JavaFX tenga permisos de leerla.
