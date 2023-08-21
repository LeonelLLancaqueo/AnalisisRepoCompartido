/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp0;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Leo
 */
public class Ejercicio9 {
    public static void main(String[]args){
        Heap a = new Heap(160);
        int[]b = new int[60];
        rellenarArreglo(b);
        cargarHeap(a);
        quickSort(b,0,b.length-1);
        System.out.println("Vemos a continuacion el conjunto C como heap");
        System.out.println(a.toString());
    }
    
    public static void mergeArreglos(Heap a, int[]b){
        for (int i = 0; i < 60; i++){ //Cargamos los 60 espacios restantes del heap con elementos del arreglo
            a.insertar(b[i]);
        }
    }
    
    public static int particion(int[]a, int inicio, int fin){
        int pivote, i;
        int temp;
        pivote = a[fin];
        i = inicio-1; 
        for (int j = inicio; j < fin; j++) {
            if (a[j]<= pivote) {
                i++;
                temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
        temp = a[i+1];
        a[i+1] = a[fin];
        a[fin] = temp;
        return i+1;
    }

    public static void quickSort(int[]a, int inicio, int fin){
        int indice;
        if (inicio < fin){
            indice = particion (a,inicio,fin);
            quickSort(a,inicio,indice-1);
            quickSort(a,indice+1,fin);
        }
    }
    
    public static void cargarHeap(Heap a){
        Random r = new Random();
        for (int i = 0; i < 100; i++){
            a.insertar(r.nextInt(100));
        }
    }
    
    public static void rellenarArreglo(int[] a){
        int n = a.length;
        Random r = new Random();
        for (int i = 0; i < n; i++){
            a[i] = r.nextInt(100);
        }
    }
    
}
