package org.example.javafxmvc.utils;


import javafx.scene.control.Alert;


    /**
     * ======================================================================
     * CARPETA: UTILS (La Caja de Herramientas)
     * ======================================================================
     * ¿Qué va aquí?: Clases estáticas y de soporte que ayudan a que el resto
     * del código sea más corto y limpio.
     * Ejemplos: DatabaseConnection.java, Validador.java, DateFormatter.java.
     */
    public class DialogUtils {

        /**
         * Muestra una ventana emergente de error estándar.
         * Puedes llamarla desde cualquier controlador usando:
         * DialogUtils.mostrarError("Ups", "Contraseña incorrecta");
         */
        public static void mostrarError(String titulo, String mensaje) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle(titulo);
            alert.setHeaderText(null); // Null para que no se vea feo el encabezado
            alert.setContentText(mensaje);
            alert.showAndWait();
        }

        /**
         * Muestra una ventana emergente de información/éxito.
         */
        public static void mostrarInfo(String titulo, String mensaje) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle(titulo);
            alert.setHeaderText(null);
            alert.setContentText(mensaje);
            alert.showAndWait();
        }
    }

