package aprendizaje;

public class jasp {

	public static void main(String[] args) {
		int edad = 25;
		int nivel_de_estudios = 5;
		int ingresos = 30000;
		boolean jasp;

		jasp = false;
		jasp = ((edad <= 28) && (nivel_de_estudios > 3) && (ingresos > 28000));
		System.out.println(jasp);
	}

}
