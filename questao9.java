import java.util.Scanner;
public class questao9{
	public static void main (String[]args){
		Scanner puxe = new Scanner(System.in);
		System.out.print("Quantos quilos voc� pesa? ");
		double kg = puxe.nextDouble();
		double gram = kg * 1000;
		System.out.print("Ou seja, voc� pesa ");
		System.out.print(gram + " gramas!");
}
}