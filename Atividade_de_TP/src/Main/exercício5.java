package Main;
import java.util.Scanner;
public class exercício5 {
	 public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
			
			System.out.println("Verifique se seu número é par");
			System.out.println("Digite um número: ");
			
			int num = scan.nextInt();
			
			if(num % 2 == 0) {
				System.out.println("Seu número é par");
			}
			
			else if(num % 2 != 0) {
				System.out.println("Seu número é ímpar");
			}
	 }

}
