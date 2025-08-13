package Main;
import java.util.Scanner;
public class exercício9 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String[] nomes = new String[5];
		for (int i = 0; i < nomes.length; i++){
			System.out.println("Digite o " + (i + 1) + "- nome: ");
		nomes[i] = scan.next();
		}
		
		System.out.print("Digite um novo nome: ");
        String verificar = scan.next();
        
        boolean encontrar = false;

        for (int i = 0; i < nomes.length; i++) {
            if (nomes[i].equalsIgnoreCase(verificar)) {
                encontrar = true;
                break;
            }
        }
		
        if (encontrar) {
            System.out.println("O nome \"" + verificar + "\" está na lista.");
        } else {
            System.out.println("O nome \"" + verificar + "\" NÃO está na lista.");
        }
	}
}
