package Main;
import java.util.Scanner;
public class exercício10 {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String senha = "ADMIN";
		String tentativa = "";
		
		while(!tentativa.equals(senha)) {
			System.out.println("Digite a senha: ");
			tentativa = scan.next();
			
			if(!tentativa.equals(senha)){
				System.out.println("Senha incorreta!!! TENTE NOVAMENTE ");
			}
			
		}
		
		System.out.println("Acesso permitido. Bem-vindo!");
	}
}
