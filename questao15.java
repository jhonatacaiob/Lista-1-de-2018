import java.util.Scanner;

public class questao15 {

	public static void main(String[] args) {
		Scanner puxe = new Scanner(System.in);
		System.out.print("Qual ano voc� nasceu?: ");
		int AnoNas = puxe.nextInt();
		System.out.print("Em que ano estamos?: ");
		int AnoAtual = puxe.nextInt();
		int Idade = AnoAtual - AnoNas;
		int IdadeMes = Idade * 12;
		int IdadeDias = IdadeMes * 30;
		int IdadeSemanas = IdadeDias / 12;
		System.out.println("Voc� tem " + Idade + "Anos!!!!");
		System.out.println("Ou... " + IdadeMes + "Meses!!!");
		System.out.println("Ou... " + IdadeDias + "Dias!!");
		System.out.println("Ou ainda mais... " + IdadeSemanas + "Semanas!");
		puxe.close();
	}

}
