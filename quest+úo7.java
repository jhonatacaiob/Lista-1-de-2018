import java.util.Scanner;
public class quest�o7 {
public static void main(String[] args){
	Scanner puxe = new Scanner(System.in);
	System.out.println("Digite tudo que � pedido!");
	System.out.println("Sal�rio:");
	double salario = puxe.nextDouble();
	System.out.println("Total de vendas:");
	double vendas = puxe.nextDouble();
	double comissao = vendas*0.04;
	double recebe = salario + comissao;
	System.out.println("O valor da comiss�o: " + comissao);
	System.out.print("Sal�rio final: ");
	System.out.print(recebe);
	puxe.close();
}
}
