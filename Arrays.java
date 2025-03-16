package jetaKrasniqi;
import java.util.Scanner;
public class Arrays {
 /** Klase ne lidhje me vargjet */
	public static void main(String[] args) {
	    int [] varguIm = CreatingArrays.krijimiivargut();
		// shfaqja e vargut ne konzole
		for (int num : varguIm) {
            System.out.print(num + " ");
        }
        System.out.println(); 
	  
		int [] reversed = ArraysOperations.varguIkthyer(varguIm);
		// shfaq rezultatet e llogaritjeve
		System.out.println("Mesatarja: " + ArraysOperations.mesatarja(varguIm));
		System.out.println("Maksimalja: " + ArraysOperations.max(varguIm));
		System.out.println("Minimalja: " + ArraysOperations.min(varguIm));
		System.out.println("Vargu i kthyer: ");
		for (int num : reversed) {
            System.out.print(num + " ");
        }
        System.out.println(); 
        }
	}

	
	
      

