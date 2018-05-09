import java.util.Scanner;
class questão3 {
  public static void main(String[] args) {
	  Scanner puxe = new Scanner(System.in);
		System.out.print("Digite um numero inteiro: ");
		int n1 = puxe.nextInt();
		System.out.print("Digite outro: ");
		int n2 = puxe.nextInt();
		int di = n1/n2;
		int re = n1%n2;
		double dn1 = (double) n1;
		double dr = dn1 / n2;
		System.out.println("A divisão inteira de " + n1 + " por " + n2 + " é igual a " + di);
		System.out.println("O resto é igual a " + re);
		System.out.println("A divisao real é igual a " + dr);
		puxe.close();
  }
}