package Main;
import java.util.Scanner;

public class Atividade_TP {
	public static void main(String[] args) {
	
	/* Exercício 1-
	
	int num;
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Digite o primero número: ");
	num = scan.nextInt();
	
	if(num >= 0) {
		System.out.println("Seu número é positivo");
	}
	else {
		System.out.println("Seu número é negativo ");
	} */
	
	 /*Exercício 2-*/
	
	        /*int num1, num2;

	        Scanner scan = new Scanner(System.in);

	        System.out.println("Digite o primeiro número: ");
	        num1 = scan.nextInt();

	        System.out.println("Digite o segundo número: ");
	        num2 = scan.nextInt();

	        if (num1 <= 0 && num2 <= 0) {
	            System.out.println("Digite um número INTEIRO");
	        } else {
	            System.out.println("Um número é negativo");
	        }
	        
	        if (num1 == num2) {
	            System.out.println("Os números são iguais");
	        } 
	        
	        else if (num1 != num2) {
	            System.out.println("Os números são diferentes");
	        }
	     
	        else if (num1 > num2) {
	            System.out.println("O primeiro é maior que o segundo");
	        }
	        
	        else {
	            System.out.println("O segundo é maior que o primeiro");
	        }

	        scan.close();
	    }*/
		
		
		/*Exercicio 3-
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
		System.exit(0);*/
		
		/*Exercício 4-*/
		/*Scanner tabu = new Scanner(System.in);
		System.out.println("Digite um número de 1 a 10 para exibir a tabuada dele:  ");
		
		int num = tabu.nextInt();
		
		if(num >= 11 || num <= 0 ) {
			System.out.printf("SELECIONE DE 1 A 10 APENAS!!!");
		}
		
		else {
		
			for(int i = 1; i <= 11; i++) {
				int result = num  * i;
				
				System.out.println(num + "x" + i + " = " + result);
				
			}
		}*/
		
		/*Exercício 5-
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Verifique se seu número é par");
		System.out.println("Digite um número: ");
		
		int num = scan.nextInt();
		
		if(num % 2 == 0) {
			System.out.println("Seu número é par");
		}
		
		else if(num % 2 != 0) {
			System.out.println("Seu número é ímpar");
		}*/
		
		/*Exercício -6*/
		
		 /*Scanner fatorial = new Scanner(System.in);
	        System.out.printf("Digite um número: ");
	        int num = fatorial.nextInt();
	        
	        long resultado = 1;
	        for (int i = 2; i <= num; i++) {
	            resultado *= i;
	        }
	        
	        System.out.println("O fatorial de " + num + " é: " + resultado);
	        fatorial.close(); */
		
		/*Ecercício 7-
		
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
		}*/
		
		/*Exercício 8-
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite um número: ");
		int n = scan.nextInt();
		
		int soma = 0;
		int impar = 1;
		
		for(int i = 0; i < n; i++){
			soma += 2;
		}
		
		System.out.println("A soma do número " + n + " e números ímpares é: " + soma);*/
		
		/*Exercício 9- 
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
        }*/
		
		/*Exercicio 10-*/
		
		Scanner scan = new Scanner(System.in);
			String senha = "Java123";
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
