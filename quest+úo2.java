import java.util.Scanner;
public class questão2 {
	public static void main(String[] args){
	Scanner puxe = new Scanner(System.in);
	System.out.print("Insira a: ");
	double  a = puxe.nextDouble();
	System.out.print("Insira b: ");
	double b = puxe.nextDouble();
	System.out.print("Insira c: ");
	double c = puxe.nextDouble();
	double pa = a-b-c;
	double pb = a+b+c;
	double pc = a*b*c;
	System.out.println("a - b - c = " + pa);
	System.out.println("a + b + c = " + pb);
	System.out.println("a * b * c = " + pc);
	
	puxe.close();
	}
}
