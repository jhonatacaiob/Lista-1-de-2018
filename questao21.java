import java.util.Scanner;
class questao21{
	public static void main(String[] args){
		Scanner puxe = new Scanner(System.in);
		System.out.print("Digite o numero de horas trabalhadas: ");
		int HorasTrabalhadas = puxe.nextInt();
		System.out.print("Digite o valor do salário minimo: ");
		int SalarioMinimo = puxe.nextInt();
		System.out.print("Digite o numero de horas extras trabalhadas: ");
		int HorasExtras = puxe.nextInt();
		double ValorHoraTrabalhada = (SalarioMinimo / 8 ) * HorasTrabalhadas;
		double ValorHoraExtra = (SalarioMinimo / 4 ) * HorasExtras;
		double SalarioBase = HorasTrabalhadas * ValorHoraTrabalhada;
		double Adicional = HorasExtras * ValorHoraExtra;
		double AReceber = SalarioBase + Adicional;
		System.out.print("Você tem a receber " + AReceber);
		puxe.close();

	}
}