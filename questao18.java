import java.util.Scanner;
public class questao18 {
	public static void main (String[] args){
		Scanner puxe = new Scanner(System.in);
		System.out.print("Digite o valor do raio de circunferencia: ");
		double raio = puxe.nextDouble();
		double comprimento = 2 * Math.PI * raio;
		System.out.println("O comprimento da circunferencia vale: " + comprimento);
		double area = Math.PI * Math.pow(raio, 2);
		System.out.println("A area da circunferencia vale: " + area);
		double volume = (4 * Math.PI * Math.pow(raio, 3) / 3 );
		System.out.println("O volume da circunferencia vale: " + volume);
		
		puxe.close();
	}
}
