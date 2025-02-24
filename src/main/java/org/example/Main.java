package org.example;
public class Main {
    public static void main(String[] args) {
     //Antes en Java7, el switch solo funcionaba con datos int, char, byte y String
        // Ademas requeria un case con break para evitar ejecuciones no deseadas.

        //Se necesitaba escribir break en cada case, de lo contrario, se ejecutan los siguientes bloques
        //Se necesita escribir break en cada case, de lo contrario, se ejecutan los siguientes bloques.

        int dia = 3;

        String nombreDia;
        switch (dia) {
            case 1:
                nombreDia = "Lunes";
                break;
            case 2:
                nombreDia = "Martes";
                break;
            case 3:
                nombreDia = "Miércoles";
                break;
            default:
                nombreDia = "Día inválido";
        }

        System.out.println("Hoy es " + nombreDia);
    }

    }
