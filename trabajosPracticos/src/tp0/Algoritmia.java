package tp0;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Random;

public class Algoritmia {
    
    //EJERCICIO1 
    	private static boolean esPrimo(int i){
		boolean esPrimo= true;
		int k=2, mitadDeN= i/2;
		
		while(k<= mitadDeN && esPrimo){

		    if(i%k == 0){
		        esPrimo= false;
		    }
		    k++;
		    
		}
		
		return true;
	    }
	    private static int cuantosNPrimos(int n){
		int resp=0;
		for(int i=1; i< n; i++){
		    if(esPrimo(i)){
			resp++;
		    }
		}
		return resp;
	    }
	public static void main(String[] args) {
        //juegoAdivinar();

        int n;
        Scanner s= new Scanner(System.in); 
        System.out.print("ingrese un numero entero: ");
        n= s.nextInt();
        System.out.println(cuantosNPrimos(n));
    }
    //EJERCICIO2 

    //EJERCICIO3
	
    //EJERCICIO4

    //EJERCICIO5

    //EJERCICIO6 

    //EJERCICIO7 

    //EJERCICIO8

    //EJERCICIO9

    
}
