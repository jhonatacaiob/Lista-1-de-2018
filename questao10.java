import java.util.Scanner;
public class questao10{
	public static void main (String[] args){
		Scanner puxe = new Scanner(System.in);
		System.out.print("Digite o valor da base maior: ");
		double bama = puxe.nextDouble();
		System.out.print("Digite o valor da base menor: ");
		double bame = puxe.nextDouble();
		System.out.print("Digite o valor da altura: ");
		double alt = puxe.nextDouble();
		double area = ((bame + bama ) * alt) / 2;
		System.out.print("A área do trapézio vale: ");
		System.out.print(area);
		puxe.close();
}
}