package schoolenglish;

import java.util.Scanner;

public class SchoolEnglish {

    public static void main(String[] args) {
      //Nombramos las variables que vamos a usar en el programa
        String nombre;
        int edad = 0;
        String volver = "";
        //Creamos un bucle si el usuario desea volver a usarlo sin necesidad de ejecutar de nuevo
        while (!volver.equalsIgnoreCase("No")) {
            //Creamos el Scanner para poder que el usuario responda por consola
            Scanner teclado = new Scanner(System.in);
            System.out.println("Ingrese su nombre");
            nombre = teclado.nextLine();
            //Creamos otro while, mientras la edad no se ingrese numeros seguirá volviendo a pedir la edad
            while (true) {
                //Try y catch es para controlar las excepciones y no de error si se coloca un valo que no sean numeros
                try {
                    System.out.println("Ingrese su edad");
                    edad = teclado.nextInt();
                    teclado.nextLine();
                    //Break para salir del bucle y continuar con el programa
                    break;
                } catch (Exception e) {
                    System.out.println("Solo numeros al ingresar");
                    teclado.nextLine();

                }

            }
            // if- if else si se cumple la condicion de la edad o no
            if (edad >= 4 && edad <= 6) {
                System.out.println("Lunes y Miercoles de 4pm-5pm");

            } else if (edad >= 7 && edad <= 8) {
                System.out.println("Martes y jueves de 4:30pm-5:30pm");

            } else if (edad >= 9 && edad <= 10) {
                System.out.println("Martes y jueves de 5:30pm-7pm");

            } else if (edad >= 11 && edad <= 13) {
                System.out.println("Lunes y Miercoles de 5pm-6:30pm");

            } else if (edad > 14) {
                System.out.println("No contamos con alumnos de 14 años en adelante");
            } else if (edad <= 3) {
                System.out.println("No contamos con alumnos menores de 3 años hacia abajo");

            }
            // volver a decirle al usuario si quiere continuar en el programa
            System.out.println("---------------");
            System.out.println("Necesitas saber otro horario?SI/NO");
            volver = teclado.nextLine();

        }
        //Salir del programa
        System.out.println("Saliendo del programa...");
        System.exit(0);
// By Nicko.
// Ejercicio simple de lógica para cualquier lenguaje de programación
    }

}
