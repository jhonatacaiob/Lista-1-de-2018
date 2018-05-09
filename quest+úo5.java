import java.util.Scanner;

public class questão5 {
	public static void main(String[] args) {
		Scanner puxe = new Scanner(System.in);
		System.out.print("Digite a nota 1: ");
		double nota1 = puxe.nextDouble();
		System.out.print("Digite a nota 2: ");
		double nota2 = puxe.nextDouble();
		double mediapond = (2*nota1 +3*nota2) / 5;
		System.out.println("A média é " + mediapond);
		puxe.close();
	}
	
}