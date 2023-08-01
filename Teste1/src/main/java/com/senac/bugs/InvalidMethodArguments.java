package com.senac.bugs;

public class InvalidMethodArguments {

    public static void main(String[] args) {
        String mensagemTerminal = "Hello, world!";
        mensagemTerminal.charAt(10);
        System.out.println(mensagemTerminal.charAt(8));
    }
}
