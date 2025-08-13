package Main;
import java.util.Scanner;
public class exercício7 {
	public static void main(String[] args){
		Scanner idd = new Scanner(System.in);
		
		System.out.println("Digite sua idade");
		int idade = idd.nextInt();
			
		if(idade >= 18 && idade <= 59) {
			System.out.println("Você é maior de idade!");
		}
		else if(idade >= 60 && idade <= 100){
			System.out.println("Você ta velho");	
		}
		
		else if(idade >= 101) {
			System.out.println("Você ta só o pó");	
		}
		
		else if (idade <= 17){
			System.out.println("Você É menor de idade!");
		}
	}
}
