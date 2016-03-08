package aprendizaje;

import java.util.Scanner;

public class palindromo {

		
		String chain;
		boolean acabado = false;
		boolean palindrome(){
			StringBuilder reverso= new StringBuilder(chain);
			reverso.reverse();
			if (chain.equals(reverso.toString())){ 
				System.out.println("palindromo");
				return acabado = true;
			}
			else{
				System.out.println("NO PALID");
				return acabado=false;
			}
			
		}
		palindromo(){
			Scanner sc = new Scanner(System.in);
			System.out.println("introduce cadena de texto: ");
			chain=sc.nextLine();
			palindrome();
			
		}

	}


