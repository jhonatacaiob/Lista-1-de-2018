import java.util.Scanner;



public class questão4 {
public static void main (String[] args ){
	Scanner puxe = new Scanner(System.in);
	int a = puxe.nextInt();
	int b = puxe.nextInt();
	int c = a;
	a = b ;
	b = c; 
	System.out.println(a);
	System.out.println(b);
}
}
