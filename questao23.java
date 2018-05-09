import java.util.Scanner;
class questao23{
	public static void main(String[] args){
		Scanner puxe = new Scanner(System.in);
		System.out.print("Primeiro angulo: ");
		double angulo1 = puxe.nextDouble();
		System.out.print("Segundo angulo: ");
		double angulo2 = puxe.nextDouble();
		double angulo3 = 180 - angulo1 - angulo2;
		System.out.println("O terceiro angulo vale " + angulo3);
		puxe.close();		


}
}