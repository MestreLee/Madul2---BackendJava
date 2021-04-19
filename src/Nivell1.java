
import java.util.ArrayList;
import java.util.HashMap;

public class Nivell1 {

	public static void main(String[] args) {
		/* Fase 1
		Crea una taula (char[]) amb el teu nom on cada posició correspongui a una lletra. 
		Fes un bucle que recorri aquesta taula i mostri per consola cadascuna de les lletres. */
		
		char[] nomTaula = {'B','E','R','N','A','T'};
		for (char i : nomTaula) {
			System.out.println(i);
		}
		
		/*Fase 2
		Canvia la taula per una llista (List<Character>) 
		Al bucle, si la lletra és una vocal imprimeix a la consola: ‘VOCAL’. Sinó, imprimeix: ‘CONSONANT’. 
		Si trobes un numero, mostra per pantalla: ‘Els noms de persones no contenen números!’. */
		
		ArrayList<Character> nomLlista = new ArrayList<Character>();
	      for(char i:nomTaula) {
	         nomLlista.add(i);
	      }
	          
	      for(char i:nomLlista) {
	    	  Boolean chara = Character.isDigit(i);
	    	  if(chara == true) {
		  		System.out.println("Els noms de persones no contenen números!");
	    	  }else if (i =='A' || i =='E'|| i =='I'|| i =='O'|| i =='U') {
	  			System.out.println(i + " " + "VOCAL");
	    	  }else{
		  		System.out.println(i + " " + "CONSONANT");
	    	  }   
		   }
	      /*Fase 3
			Emmagatzemar en un Map tant les lletres de la llista com el nombre de vegades que apareixen.*/
	      
	      	HashMap<Character, Integer> nomMapa = new HashMap<Character, Integer>();
	      	
	      	for (int i = 0; i < nomLlista.size(); i++) {
	      		int count = 0;
	      		char lletra = nomLlista.get(i);
	      		for (int j = 0; j < nomLlista.size(); j++) {
	      			if(lletra == nomLlista.get(j)) {
	      				count++;
	      			}
	      		}
	      		nomMapa.put(lletra, count);
	      	}
	      	
	  		System.out.println(nomMapa);  
	  		/*Fase 4
			Crea una altra llista amb el teu cognom on cada posició correspongui a una lletra. 
			Fusiona les dues llistes en una sola. A més, afegeix una posició amb un espai buit entre la primera i la segona. 
			És a dir, partim de la llista name i surname i al acabar l’execució només tindrem una que es dirà fullName. */
	  		
			ArrayList<Character> cognomLlista = new ArrayList<Character>();
			cognomLlista.add('C');
			cognomLlista.add('O');
			cognomLlista.add('C');
			cognomLlista.add('E');
			cognomLlista.add('R');
			cognomLlista.add('A');
			
			System.out.println(cognomLlista);
			
			ArrayList<Character> nomComplet = new ArrayList<Character>();
			
			for(int i = 0; i <= nomLlista.size() + cognomLlista.size(); i++) {
				if(i == nomLlista.size()) {
					nomComplet.add(' ');
				}else if(i < nomLlista.size()){
					nomComplet.add(nomLlista.get(i));
				}else {
					nomComplet.add(cognomLlista.get(i - 1 - nomLlista.size()));
				}
			}
			System.out.println(nomComplet);

	}

}
