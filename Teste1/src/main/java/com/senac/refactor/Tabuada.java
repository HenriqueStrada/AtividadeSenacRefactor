package com.senac.refactor;

public class Tabuada {

    public static void main(String[] args) {
        int numero = 3;
        System.out.println("A tabuada do numero "+ numero + " eh:");
        System.out.println("--------------------------------------");
        for (int i = 1; i <= 10; i++) {
            System.out.println("| " + numero + " x " + i + " = " + numero * i + " |");
        }
    }
}
