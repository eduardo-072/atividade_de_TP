package Main;
import java.util.Scanner;

public class exercício2 {
    public static void main(String[] args) {
        int num1, num2;

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        num1 = scan.nextInt();

        System.out.println("Digite o segundo número: ");
        num2 = scan.nextInt();

        if (num1 <= 0 && num2 <= 0) {
            System.out.println("Ambos os números são menores ou iguais a zero");
        } 

        else if (num1 <= 0 || num2 <= 0) {
            System.out.println("Um dos números é menor ou igual a zero");
        }

        if (num1 == num2) {
            System.out.println("Os números são iguais");
        } else {
            System.out.println("Os números são diferentes");

            if (num1 > num2) {
                System.out.println("O primeiro número é maior que o segundo");
            } else {
                System.out.println("O segundo número é maior que o primeiro");
            }
        }

        scan.close();
    }
}
