import java.util.Scanner;

public class questao19 {
	public static void main(String[] args) {
		Scanner puxe = new Scanner(System.in);
		System.out.println("Digite uma temperatura em Celsius");
		double c = puxe.nextDouble();
		double f = (c * 9 / 5) + 32;
		System.out.print(c);
		System.out.print(" graus celsius, equivalem a ");
		System.out.print(f);
		System.out.print(" graus em Farenheint!");
		puxe.close();
	}

}
