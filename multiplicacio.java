import java.util.Scanner;

public class multiplicacio {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Introduce el primer numero:");
		int num1 = in.nextInt();
		System.out.println("Introduce el segundo numero:");
		int num2 = in.nextInt();

		System.out.println("Resultado:" num1 * num2);
	}
}
