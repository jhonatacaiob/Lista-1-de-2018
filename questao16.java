import java.util.Scanner;
public class questao16 {

	public static void main (String[] args){
		Scanner puxe = new Scanner(System.in);
		System.out.print("Quanto é teu salário João?: ");
		double SalarioJoao = puxe.nextDouble();
		System.out.print("Qunbto o valor da conta 1?: ");
		double conta1 = puxe.nextDouble();
		System.out.print("Qual o valor da conta 2?: ");
		double conta2 = puxe.nextDouble();
		double taxa_conta1 = 0.02*conta1;
		double taxa_conta2 = 0.02*conta2;
		double valor_conta1 = taxa_conta1 + conta1;
		double valor_conta2 = taxa_conta2 + conta2;
		double restara = SalarioJoao - valor_conta1 - valor_conta2;
		System.out.println("Sobrará " + restara + " do teu salário Joao, relaxe");
		puxe.close();
	}

}
