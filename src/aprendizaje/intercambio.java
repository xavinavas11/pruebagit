package aprendizaje;

public class intercambio {

	public static void main(String[] args) {
		int a=5;
		int b=8;
		int intercambio;
		
		System.out.println("El valor de a al principio es: "+a);
		System.out.println("El valor de b al principio es: "+b);
		
		intercambio=a;
		a=b;
		b=intercambio;
		
		System.out.println("El valor final de la a es: "+a);
		System.out.println("El valor final de la b es: "+b);
	}

}
