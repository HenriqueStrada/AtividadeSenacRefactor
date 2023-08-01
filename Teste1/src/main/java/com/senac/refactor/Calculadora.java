package com.senac.refactor;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("""
        Qual operação deseja realizar?
        1. Soma
        2. Subtração
        3. Multiplicação
        4. Divisão""");

        int operacao = sc.nextInt();

        System.out.println("Digite o primeiro número:");
        Double numero1 = sc.nextDouble();

        System.out.println("Digite o segundo número:");
        Double numero2 = sc.nextDouble();

        switch (operacao) {
            case 1:
                System.out.println("Resultado da soma: " + (numero1 + numero2));
                break;
            case 2:
                System.out.println("Resultado da subtracao: " + (numero1 - numero2));
                break;
            case 3:
                System.out.println("Resultado da multiplicacao: " + (numero1 * numero2));
                break;
            case 4:
                System.out.println("Resultado da subtracao: " + (numero1 / numero2));
                break;
        }
    }
}