import java.util.Scanner;
public class questao12{
	public static void main(String[]args){
		Scanner puxe = new Scanner(System.in);
		System.out.print("Digite o valor da diagonal menor: ");
		double dime = puxe.nextDouble();
		System.out.print("Digite o valor da diagonal maior: ");
		double dima = puxe.nextDouble();
		double area = (dima * dime ) / 2;
		System.out.print("A area do losango vale: ");
		System.out.print(area);
}
} 