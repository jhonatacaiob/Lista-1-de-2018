import java.util.Scanner;

public class questao13 {

	public static void main(String[] args) {
		Scanner puxe = new Scanner(System.in);
		System.out.print("Quanto � o sal�rio minimo?: ");
		double salmin = puxe.nextDouble();
		System.out.print("Quanto � o seu sal�rio?: ");
		double saluser = puxe.nextDouble();
		double  tot = saluser / salmin;
		tot = (int) tot;
		System.out.print("Voc� recebe ");
		System.out.print(tot);
		System.out.print(" Sal�rios minimos!!");
		puxe.close();
	}
}
