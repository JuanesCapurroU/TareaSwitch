package org.example;
public class Main {
    public static void main(String[] args) {
        //Apartir de la version de Java 12 en adelante hubieronn cambios y mejoras en el  switch
        // Se remplaza los dos puntos ":" a flechas ->, tambien estas flechas evitan colocar
        // Los Switch con break en cada sentencia
        // Tambien se pueden asignar valores a una variable sin necesidad de crearla antes

        int dia = 3;

        String nombreDia = switch (dia) {
            case 1 -> "Lunes";
            case 2 -> "Martes";
            case 3 -> "Miércoles";
            default -> "Día inválido";
        };

        System.out.println("Hoy es " + nombreDia);

        //Tambien permite multiples casos en una sola linea, ejemplo:

        char letra = 'a';

        String tipo = switch (letra) {
            case 'a', 'e', 'i', 'o', 'u' -> "Vocal";
            default -> "Consonante";
        };

        System.out.println("La letra '" + letra + "' es una " + tipo);

    }
}