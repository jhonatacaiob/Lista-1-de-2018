import java.util.Scanner;
class quest�o3 {
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
		System.out.println("A divis�o inteira de " + n1 + " por " + n2 + " � igual a " + di);
		System.out.println("O resto � igual a " + re);
		System.out.println("A divisao real � igual a " + dr);
		puxe.close();
  }
}