package Main;
import java.util.Scanner;
public class exercício3 {
	 public static void main(String[] args) {
		 System.out.println("Selecione uma das opções: ");
			Scanner opc = new Scanner(System.in);
			
			System.out.println("1- Cálculo da área do quadrado ");
			System.out.println("2- Cálculo da área do círculo ");
			
			int num = opc.nextInt();
			
			switch(num){
			case 1:
				System.out.println("Digite um número para L1: ");
				int L1 = opc.nextInt();
				
				System.out.println("Digite um número para L2: ");
				int L2 = opc.nextInt();
				
				int A = L1 * L2;
							
				System.out.println("A área do quadrado é de: " + A);
				
				break;
				
			case 2:
				System.out.println("Digite o raio do círculo: ");
				double raio = opc.nextDouble();
				double area = Math.PI * Math.pow(raio, 2);
				
				System.out.printf("A área do círculo com raio %.2f é: %.2f%n", raio, area);
				
				break;
	 }
			System.exit(0);
	}
	
}
