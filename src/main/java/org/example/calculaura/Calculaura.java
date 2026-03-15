package org.example.calculaura;

import java.util.Scanner;

public class Calculaura {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        double x = sc.nextDouble();

        System.out.println("Digite o segundo número: ");
        double y = sc.nextDouble();

        System.out.println("\n1-soma" +
                "\n2- subtração" +
                "\n3- multiplicação" +
                "\n4- divisão");
        System.out.println("Digite sua operação: ");

        int opcao = sc.nextInt();

        double resultado = 0;

        switch (opcao) {
            case 1:
                resultado = x + y;
                break;
            case 2:
                resultado = x - y;
                break;
            case 3:
                resultado = x * y;
                break;
            case 4:
                if (y != 0) {
                    resultado = x / y;
                    break;
                } else {
                    System.out.println("Faz direito porra");
                    break;
                }

        }
        sc.close();
        System.out.println("O resultado é: " + resultado);
    }
}





