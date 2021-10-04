package javaapplication15;

import dominio.*;
import java.util.Scanner;

public class proyectoArrays {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        //array de objetos de tipo Persona
        //Persona personas[] = new Persona[3];
        //instancio en una sola línea
        Persona personas[] = {new Persona("María"), new Persona("Iker"), new Persona("Lorena")};
        //sobreescribo en las posiciones
        personas[0].setNombre("Lorenzo"); //OJO ESTO VA PORQUE SOBREESCRIBE LO QUE YA ESTÁ CON NEW
        personas[1].setNombre("Santiago");
        personas[2].setNombre("Coral");

        /* for (int i = 0; i < personas.length; i++) {
            System.out.println("Personas [" + i + "] ->" + personas[i].getNombre());
        }*/
        for (int i = 0; i < personas.length; i++) {
            System.out.println("Intricuce un nombre: ");
            personas[i].setNombre(read.nextLine());
            System.out.println("Personas [" + i + "] ->" + personas[i].getNombre());
        }

    }

}
