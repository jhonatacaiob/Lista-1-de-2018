import java.util.Scanner;

public class questão8 {
	public static void main(String[] args) {
		Scanner puxe = new Scanner(System.in);
		System.out.println("Quanto você pesa?");
		double peso = puxe.nextDouble();
		double pesoA = (peso*0.15) + peso;
		double pesoB = (peso*0.20) + peso;
		System.out.println("Peso A: " + pesoA);
		System.out.println("Peso B: "+ pesoB);
		puxe.close();
	}
}