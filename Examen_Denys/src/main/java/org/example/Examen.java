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

        Scanner entrada = new Scanner(System.in); //Definimos Scanner como entrada
        System.out.println("Introduce tu nombre: "); //Mostramos introducir nombre
        String nombre = entrada.next(); //guardamos nombre como variable de tipo string
        System.out.println("La obra de " + nombre); //Mostramos "La obra de [nombre]

        System.out.println("Introduce el ancho de la pared: "); //Pedimos el ancho de la pared
        int anchoPared = entrada.nextInt(); //Guardamos el ancho de la pared
        System.out.println("Introduce el largo de la pared: "); //Pedimos el largo de la pared
        int largoPared = entrada.nextInt(); //Guardamos el largo de la pared
        System.out.println("Introduce el ancho del azulejo: "); //Pedimos el ancho del azulejo
        int anchoAzulejo = entrada.nextInt(); //Guardamos el ancho del azulejo
        System.out.println("Introduce el largo del azulejo: "); //Pedimos el largo del azulejo
        int largoAzulejo = entrada.nextInt(); //Guardamos el largo del azulejo

        if (largoAzulejo == anchoAzulejo) {
            System.out.println("ERROR, los azulejos no pueden ser cuadrados");
        }else{
            int areaPared = anchoPared * largoPared; //Calculamos area de la pared
            int areaAzulejo = anchoAzulejo * largoAzulejo; //Calculamos area del azulejo

            float numeroAzulejos = areaPared / areaAzulejo; //El número de azulejos que pueden entrar es el resultado de dividir el area de la pared entre el area del azulejo

            System.out.println("Se necesitan " + numeroAzulejos + " Azulejos"); //Muestra el numero de azulejos que e
        }



    }
}
