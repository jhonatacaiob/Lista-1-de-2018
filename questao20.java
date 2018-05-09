import java.util.Scanner;

public class questao20 {
	public static void main(String[] args) {
		Scanner puxe = new Scanner(System.in);
		System.out.println("Digite as dimensoes do comodo: ");
		System.out.print("Base: ");
		double dimensao1 = puxe.nextDouble();
		System.out.print("Altura: ");
		double dimensao2 = puxe.nextDouble();
		double AreaDoComodo = dimensao1 * dimensao2;
		System.out.print("A area do comodo vale: ");
		System.out.print(AreaDoComodo);
		double potencia = 18 * AreaDoComodo;
		System.out.println("A potencia de ilumanação que será usada é: ");
		System.out.print(potencia);
		puxe.close();
	}
}