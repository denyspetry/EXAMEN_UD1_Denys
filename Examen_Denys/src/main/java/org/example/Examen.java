package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Examen {

    public void ejercicio1(){
    //INICIO
        Scanner entrada = new Scanner(System.in); //Definimos objeto Scanner con el nombre entrada

        boolean comprobador = true; //creamos una variable de tipo buleano true que nos sirve como comprobador para el bucle while

        while(comprobador) { //INICIO BUCLE
            try { //Ejecuta lo que hay entre los corchetes si no hay erores
                System.out.println("Introduce una temperatura en ºC: "); //Muestra al usuario el mesaje "Introduce una temperatura en ºC: "
                int temperatura = entrada.nextInt(); //Lo que introduzca el usuario lo guardará como variable numérica entera con el nombre [temperatura]

                comprobador = false; //Si nos introducen un valor numérico entero válido, sale del bucle

                int temperaturaKelvin = temperatura + 273; //La variable de la temperatura en kelvin sale de sumarle 273 a la temperatura en ºC

                //INICIO SI
                if (temperatura > 0) { //Si la temperatura es mayor que 0, nos muestra el mensaje "La temperatura en grados kelvin es: [temperatura en kelvin] "
                    System.out.println("La temperatura en grados kelvin es: " + temperaturaKelvin);
                } else { //Si no se cumple la primera condición (temperatura < 0), se cumple esta
                    temperatura = temperatura * -1; //actualiza la variable temperatura negativa a positiva
                    System.out.println("Hay " + temperatura + " grados bajo 0"); //Muestra el mensaje "Hay [temperatura positiva] grados bajo 0"
                    System.out.println("La temperatura en grados kelvin es: " + temperaturaKelvin); //Nos muestra "La temperatura en grados kelvin es [temperatura en kelvin]"
                }//FIN SI
            } catch ( //Ejecuta lo siguiente si hay algún error por introducir un caracter
                    InputMismatchException error) { //Si nos detecta el error que le hemos definido por introducir un valor de caracter hará lo siguiente
                    System.out.println("ERROR, introduce un valor numérico válido"); //Nos mostrará el siguiente mensaje en pantalla "ERROR, introduce un valor numérico válido"
                    entrada.nextLine(); //Pasa a la siguiente linea de código
            }
        }//FIN BUCLE, si no se cambia el comprobador a false se sigue ejecutando
    }//FIN

    public void ejercicio2(){

    }
}
