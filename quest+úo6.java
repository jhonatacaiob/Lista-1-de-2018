import java.util.Scanner;

public class quest�o6 {
public static void main(String[] args){
	Scanner puxe = new Scanner(System.in);
	System.out.print("Digite o pre�o do produto: ");
	Double pre�o = puxe.nextDouble();
	double porcen = pre�o * 0.1;
	double prin = pre�o - porcen;
	System.out.print("O produto ser� vendido a ");
	System.out.println(prin);
	puxe.close();
}
}
