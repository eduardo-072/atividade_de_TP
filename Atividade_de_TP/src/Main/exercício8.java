package Main;
import java.util.Scanner;
public class exercício8 {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite um número: ");
		int n = scan.nextInt();
		
		int soma = 0;
		int impar = 1;
		
		
		
		for(int i = 0; i < n; i++){
			soma += impar;
				
			if(i < n -1) {
				System.out.print(impar + " + ");
			}
			else {
				System.out.println(impar + ": ");
			}
			impar += 2;
		}
		System.out.println("A soma do número " + n + " com os números ímpares é: " + soma);
		scan.close();
	}
}
