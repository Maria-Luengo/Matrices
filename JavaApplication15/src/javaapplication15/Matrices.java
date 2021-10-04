/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication15;

/**
 *
 * @author Alumno Mañana
 */
public class Matrices {
    
    public static void main(String[] args) {
        int edades[][]= new int[3][2];
        edades[0][0]=5;
        edades[0][1]=15;
        edades[1][0]=25;
        edades[1][1]=35;
        edades[2][0]=45;
        edades[2][1]=55;
        imprimir(edades);
    }
    
    //este mñetodo se puede reutilizar para imprimir matrices de enteros
    public static void imprimir(int matriz[][]){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("edades["+i+"]["+j+"] "+matriz[i][j]);
            }
        }
    }
}
