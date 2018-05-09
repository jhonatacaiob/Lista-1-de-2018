import java.util.Scanner;

public class questao13 {

	public static void main(String[] args) {
		Scanner puxe = new Scanner(System.in);
		System.out.print("Quanto é o salário minimo?: ");
		double salmin = puxe.nextDouble();
		System.out.print("Quanto é o seu salário?: ");
		double saluser = puxe.nextDouble();
		double  tot = saluser / salmin;
		tot = (int) tot;
		System.out.print("Você recebe ");
		System.out.print(tot);
		System.out.print(" Salários minimos!!");
		puxe.close();
	}
}
