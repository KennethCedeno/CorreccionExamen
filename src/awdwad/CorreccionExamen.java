/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package awdwad;

import java.util.Scanner;

/**
 *
 * @author Kenneth Cedeno
 */
public class CorreccionExamen {

    //no se para que usarlo aun 
    public static double probabEnfermar(int age) {

        double resultado;

        resultado = age * 0.1;

        return resultado;

    }

//preguntar la mayoria de las cosas  
    public static void main(String[] args) {

//recibira todo 
        Scanner berenjena = new Scanner(System.in);

        String aiuda = "nadaa";
        double miau = 0;

//pedir que quiere 
        int queQuiere = 0;

        String informacion = "nada";

//datos basicos 
        

        String nombre = "nada";

        String apellido1 = "nada";

        String apellido2 = "nada";

        int edad = 0;

        String sexo = "nada";

//datos medicos  
//nombre mas largo de la historia 
        String historialFumadoEnfermedadesGraves = "nada";

        String tipoDeSangre = "nada";

        String covid = "nada";

//menu (esto se va a joder) 
        while ("nadaa".equals(aiuda)) {

System.out.println("Buenas, Favor inserte el numero correspondiente a lo que quiere realizar: ");
System.out.println("1- Registrarme");
System.out.println("2- Pedir mi información");
System.out.println("3- Probabilidad de no enfermar de forma grave");
System.out.println("4- Borrar datos ");

        queQuiere = berenjena.nextInt();

        if (queQuiere == 1) {

//pido los datos basicos y los guardo en sus respectivas "cajas" 
            System.out.println("Favor ingresar el nombre del paciente: ");

            nombre = berenjena.next();

            System.out.println("Favor ingresar el primer apellido del cliente: ");

            apellido1 = berenjena.next();

            System.out.println("Favor ingresar el segundo apellido del cliente: ");

            apellido2 = berenjena.next();

            System.out.println("Favor ingresar la edad del cliente: ");

            edad = berenjena.nextInt();

            System.out.println("Favor indique su sexo (Masculino, Femenino): ");

            sexo = berenjena.next();
            
//word se vuelve loco lol 
// pido los datos medicos y los guardo en sus respectivas "cajas" 
// sigo sin saber para que usar el otro metodo 
            System.out.println("Favor indique si tiene historial de fumado o de alguna otra enfermedad grave: ");

            historialFumadoEnfermedadesGraves = berenjena.next();

            System.out.println("Favor indicar su tipo de sangre (letra y el + o - en caso de ser necesario): ");

            tipoDeSangre = berenjena.next();

            System.out.println("Favor indique si tiene o no COVID-19 (Si o No): ");

            covid = berenjena.next();

        } else if (queQuiere  == 2) {

            if (nombre.equals("nada")) {

                System.out.println("Debe registrarse primero.");

            } else {

                System.out.println("¿Desea su informacion básica o médica?");

                informacion = berenjena.next();

                if (informacion.equals("Basica")) {

                    System.out.println("Su nombre es:" + nombre);

                    System.out.println("Su primer apellido es: " + apellido1);

                    System.out.println("Su segundo apellido es: " + apellido2);

                    System.out.println("Su edad es: " + edad);

                    if (edad >= 50) {

                        System.out.println("Alerta: El paciente posee mas de 50 años.");

                    }

                    System.out.println("Su sexo es: " + sexo);

                } else {

                    if (nombre.equals("nada")) {

                        System.out.println("Debe ingresar sus datos basicos primero.");

                    } else {

                        System.out.println("Posee historial de fumado o de enfermedades graves: " + historialFumadoEnfermedadesGraves);

                        if (historialFumadoEnfermedadesGraves.equals("Si")) {

                            System.out.println("Alerta: El paciente posee historial de fumado o de enfermedades graves.");

                        }

                        System.out.println("Su tipo de sangre es: " + tipoDeSangre);

                        if (tipoDeSangre.equals("o-")) {

                            System.out.println("Precaucion, tipo de sangre o-");

                        }

                        System.out.println("Tiene COVID-19: " + covid);

                    }

                }
            }
            } else if (queQuiere == 3) {

                        miau = probabEnfermar(edad);

                        if (nombre.equals("nada")) {

                            System.out.println("Debe registrarse primero.");

                        } else {

                            System.out.println("Su probabilidad de no enfermar de forma grave es de:  " + miau) ;

                        }

                    }

        }
        
        

        }

}
