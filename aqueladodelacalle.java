import java.util.Scanner;

public class aqueladodelacalle {
	public static void main(String[] args) {
		int casos;
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("introduce os numeros a revisar");
		casos = sc.nextInt();
		for (int i = 0; i < casos; i++) {
			System.out.println("introduce un numero");
			num = sc.nextInt();
			if (num == 0)
				i = casos;
			else if (num % 2 == 0) {
				System.out.println("izquierda");
			} else {
				System.out.println();
			}
		}
	}

}
