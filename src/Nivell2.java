
import java.util.ArrayList;
import java.util.Scanner;

public class Nivell2 {

	public static void main(String[] args) {
		//Crea una aplicaci� que dibuixi una escala de nombres, 
		//sent cada l�nia nombres comen�ant en un i acabant en el nombre de la l�nia.  
		
	    Scanner myObj = new Scanner(System.in);
	    System.out.println("Quants nombres tindr� l'escala?");
	    int nombres = myObj.nextInt();
	    ArrayList<String> nums = new ArrayList<String>();
	    	    
	    for (int i = 1; i <= nombres; i++) {
	    	for(int j = 1; j <= i; j++) {
	    		String s = String.valueOf(j);
	    		nums.add(s);
	    	}
    	    System.out.println(nums);
    	    nums.clear();
	    }
	    
	    //Crea una aplicaci� que dibuixi una pir�mide invertida de asteriscs. 
	    
	    ArrayList<Character> piramidAsterisc = new ArrayList<Character>();

	    for (int i = 0; i < nombres; i++) {
	    	for(int j = nombres; j > i; j--) {
	    		piramidAsterisc.add('*');
	    	}
    	    System.out.println(piramidAsterisc);
    	    piramidAsterisc.clear();
	    }

	}

}
