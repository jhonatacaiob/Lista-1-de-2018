import java.util.Scanner;
public class questão7 {
public static void main(String[] args){
	Scanner puxe = new Scanner(System.in);
	System.out.println("Digite tudo que é pedido!");
	System.out.println("Salário:");
	double salario = puxe.nextDouble();
	System.out.println("Total de vendas:");
	double vendas = puxe.nextDouble();
	double comissao = vendas*0.04;
	double recebe = salario + comissao;
	System.out.println("O valor da comissão: " + comissao);
	System.out.print("Salário final: ");
	System.out.print(recebe);
	puxe.close();
}
}
