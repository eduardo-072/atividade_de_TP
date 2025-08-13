package Main;
import java.util.Scanner;
public class exercício6 {
	public static void main(String[] args) {
		Scanner fatorial = new Scanner(System.in);
        System.out.printf("Digite um número: ");
        int num = fatorial.nextInt();
        
        long resultado = 1;
        for (int i = 2; i <= num; i++) {
            resultado *= i;
        }
        
        System.out.println("O fatorial de " + num + " é: " + resultado);
        fatorial.close(); 
	}
}
