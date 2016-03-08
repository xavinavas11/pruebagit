package aprendizaje;

import java.util.Scanner;

public class excepciones1 {
	// public static void main(String args[]) throws IndexOutOfBoundsException {
	// int i = 0;
	// String vectorS[] = { "Hola mundo 1", "Hola mundo 2", "Hola mundo 3" };
	// while (i < 4) {
	// try {
	// System.out.println(vectorS[i]);
	//
	// } catch (Exception e) {
	// e.printStackTrace();
	//
	// }
	// i++;
	// }
	// System.out.println("Fin");
	// }
	// }
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int num=0;
		boolean esNum=false;
		System.out.println("Introduce numero: ");
		do {
			try {
				num = Integer.parseInt(sc.nextLine());
				esNum=true;
			} catch (Exception e) {
				System.out.println("tontorron introduce un numero");
			}
		}while (!esNum);
		System.out.println("el numero introducido es " +num);
		sc.close();
		}
	}
