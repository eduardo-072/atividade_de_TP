package Main;

import java.util.Scanner;

public class exercício4 {
    public static void main(String[] args) {
        Scanner tabu = new Scanner(System.in);

        System.out.println("Digite um número de 1 a 10 para exibir a tabuada dele: ");
        int num = tabu.nextInt();

        if (num < 1 || num > 10) {
            System.out.println("SELECIONE DE 1 A 10 APENAS!!!");
        } else {
            System.out.println("Tabuada do " + num + ":");
            for (int i = 1; i <= 10; i++) {
                int result = num * i;
                System.out.println(num + " x " + i + " = " + result);
            }
        }

        tabu.close();
    }
}
