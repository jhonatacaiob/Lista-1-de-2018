import java.util.Scanner;

public class questão6 {
public static void main(String[] args){
	Scanner puxe = new Scanner(System.in);
	System.out.print("Digite o preço do produto: ");
	Double preço = puxe.nextDouble();
	double porcen = preço * 0.1;
	double prin = preço - porcen;
	System.out.print("O produto será vendido a ");
	System.out.println(prin);
	puxe.close();
}
}
