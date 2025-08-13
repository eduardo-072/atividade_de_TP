package Main;
import java.util.Scanner;
public class exercício1 {
	public static void main(String[] args){
		int num;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o primero número: ");
		num = scan.nextInt();
		
		if(num >= 0) {
			System.out.println("Seu número é positivo");
		}
		else {
			System.out.println("Seu número é negativo ");
		} 
	}
	
}
