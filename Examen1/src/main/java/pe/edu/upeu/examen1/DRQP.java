/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.examen1;

import java.util.Scanner;

/**
 *
 * @author Laboratorio
 */
public class DRQP {

    public int[][] transformada1DRQP(int ab, int num){
        System.out.println("Ejercicio 8:");
        int matriz[][] = new int [ab][ab];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if(j>=i){
                    matriz[i][j] = num++;
                }else{
                    matriz[i][j] = -1;
                }
            }
        }
        return matriz;
    }
   
  public int [][] transformada2DRQP(int ab, int num){
      System.out.println("Ejercicio 24:");
        int matriz[][] = new int [ab][ab];
        int a=0;
        for (int b = matriz.length-1; b >=0; b--) {
            if(a!=-1){
                for (a = matriz.length-1; a >= 0; a--) {
                    matriz[a][b] = num++;
                }
            }else{
                for (a = 0; a < matriz.length; a++) {

                    matriz[a][b] = num++;
                }
            }
        }
        return matriz;
    }
    
    
    
    public int[][] transformada3DRQP(int ab, int num){
        System.out.println("Ejercicio 25:");
        int matriz[][] = new int[ab][ab];
        int b=0;
        for (int a = 0; a < matriz.length; a++) {
            if(b!=matriz[0].length){
                for (b = 0; b < matriz[0].length; b++) {
                    matriz[a][b] = num++;
                }
            }else{
                for (b = matriz[0].length-1; b >= 0; b--) {
                    matriz[a][b] = num++;
                }
            }
        }
        return matriz;
    }
    public int [][] transformada4DRQP(int ab, int num){
        System.out.println("Ejercicio 27:");
        int matriz[][] = new int [ab][ab];
        int b=0;
        for (int a = matriz.length-1; a >= 0; a--) {
            if(b>=0){
                for (b = matriz[0].length-1; b >= 0; b--) {
                    matriz[a][b] = num++;
                }
            }else{
                for (b = 0; b < matriz[0].length; b++) {
                    matriz[a][b] = num++;
                }
            }
        }
        return matriz;
    }
    public int [][] transformada5DRQP(int ab, int num){
        System.out.println("Ejercicio 35:");
        int matriz[][] = new int [ab][ab];
        int a,a1,a2,b,b1,b2;
        for (a = matriz.length-1; a >= matriz.length/2; a--) {
            for (b = (ab-1)-a; b <= a; b++) {
                matriz[a][b] = num++;
            }
            for (a1 = b-2; a1 >= (ab-1)-a; a1--) {
                matriz[a1][a] = num++;
            }
            for (b1 = b-2; b1 >= (ab-1)-a; b1--) {
                matriz[a1+1][b1] = num++;
            }
            for (a2 = b1+2; a2 < b-1; a2++) {
                matriz[a2][b1+1] = num++;
            }
        }
        return matriz;
    }
 public void imprimirMatriz(int[][] matriz){
     
     for (int[] matriz1 : matriz) {
         for (int j = 0; j < matriz[0].length; j++) {
             if (matriz1[j] != -1) {
                 System.out.print(matriz1[j] + "\t");
             } else {
                 System.out.print(" \t");
             }
         }
         System.out.println();
     }
    }

public static void main(String[] args) {
        DRQP or = new DRQP();
        System.out.println("INGRESE LA OPCIÓN DEL ALGORITMO QUE DESEA PROBAR");
        Scanner leer=new Scanner(System.in);
        int opcion =leer.nextInt();
        System.out.println("Ingrese la dimencion de la matriz: ");
        int ab=leer.nextInt();
        System.out.println("Ingrese el numero de inicio: ");
        int n=leer.nextInt();
        while (opcion!=0) {            
            switch(opcion){
            case 1: or.imprimirMatriz(or.transformada1DRQP(ab, n)); break;
            case 2: or.imprimirMatriz(or.transformada2DRQP(ab, n)); break;
            case 3: or.imprimirMatriz(or.transformada3DRQP(ab, n)); break;
            case 4: or.imprimirMatriz(or.transformada4DRQP(ab, n)); break;
            case 5: or.imprimirMatriz(or.transformada5DRQP(ab, n)); break;
           
         
            
            default: System.out.println("Opción Inválida!!");break;
            }  
            System.out.println("INGRESE LA OPCIÓN DEL ALGORITMO QUE DESEA PROBAR");            
            opcion =leer.nextInt();
            System.out.println("Ingrese la dimencion de la matriz: ");
            ab=leer.nextInt();
            System.out.println("Ingrese el numero de inicio: ");
            n=leer.nextInt();
        }
    }
    
}
