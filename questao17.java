import java.util.Scanner;
public class questao17 {
	public static void main(String[] args){
		Scanner puxe = new Scanner(System.in);
		System.out.print("Cateto 1: ");
		double cateto1 = puxe.nextDouble();
		System.out.print("Cateto 2: ");
		double cateto2 = puxe.nextDouble();
		double hipotenusa = Math.sqrt(Math.pow(cateto1,2) + Math.pow(cateto2, 2));
		System.out.print("Hipotenusa: ");
		System.out.print(hipotenusa);
		puxe.close();
	}
	
}
