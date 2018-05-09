import java.util.Scanner;

public class questao14 {

	public static void main(String[] args) {
		
		System.out.print("Digite um numero inteiro: ");
		Scanner puxe = new Scanner(System.in);
		int tabu = puxe.nextInt();
		int i;
		System.out.println("TABUADA DE SOMA");
		for (i = 1; i < 11; i++) {
			int soma = i + tabu;
			System.out.println(tabu + " + " + i + " = " + soma);
		}
		i = 0;
		System.out.println("TABUADA DE MULTIPLICAÇÃO");
		for (i = 1; i < 11; i++) {
			int soma = i * tabu;
			System.out.println(tabu + " * " + i + " = " + soma);
		}
		puxe.close();

	}
}
