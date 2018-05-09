import java.util.Scanner;
class questao24{
	public static void main(String[] args){
		Scanner puxe = new Scanner(System.in);
		System.out.print("Que horas são? ");
		int hora = puxe.nextInt();
		int minutos = puxe.nextInt();
		int HoraPraMinutos = hora * 60;
		int TotalMinutos = minutos + HoraPraMinutos;
		int MinutosPraSegundos = TotalMinutos * 60;
		System.out.println("a) " + HoraPraMinutos);
		System.out.println("b) " + TotalMinutos);
		System.out.println("c) " + MinutosPraSegundos);
		puxe.close();

 
}	
}