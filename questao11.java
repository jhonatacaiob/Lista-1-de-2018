import java.util.Scanner;
public class questao11{
	public static void main (String[]args){
		Scanner puxe = new Scanner(System.in);
		System.out.print("Digite o valor de um lado do quadrado: ");
		double lado = puxe.nextDouble();
		double area = lado * lado;
		System.out.print("A area do quadrado vale: ");
		System.out.print(area);
		puxe.close();
}
}