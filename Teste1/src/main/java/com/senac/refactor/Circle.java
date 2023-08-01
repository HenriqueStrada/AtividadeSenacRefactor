package com.senac.refactor;

import java.util.Scanner;
public class Circle {
    public static void main(String[] args) {
        int operacoes = 0;
        String refazer = "s";
        Scanner sc = new Scanner(System.in);
        while (refazer.equals("s")) {
        System.out.println("""
        Qual operação deseja realizar?
        1. Calcular area circulo
        2. Calcular perimetro
        3. Calcular volume esfera
        4. calcular area superficie esfera""");


            operacoes = sc.nextInt();
            sc.nextLine();

            if (operacoes == 1) {
                System.out.println("Escreva o raio do circulo: ");
                Double num = sc.nextDouble();
                sc.nextLine();
                Circle.calculaAreaDoCirculo(num);
                System.out.println("Gostaria de refazer? Sim (s) / Não (n) ");
                refazer = sc.nextLine();
            } else if (operacoes == 2) {
                System.out.println("Escreva o raio de seu circulo: ");
                Double num = sc.nextDouble();
                sc.nextLine();
                Circle.calculaPerimetroDoCirculo(num);
                System.out.println("Gostaria de refazer? Sim (s) / Não (n) ");
                refazer = sc.nextLine();
            } else if (operacoes == 3) {
                System.out.println("Escreva o raio de sua esfera: ");
                Double num = sc.nextDouble();
                sc.nextLine();
                Circle.calculaVolumeDaEsfera(num);
                System.out.println("Gostaria de refazer? Sim (s) / Não (n) ");
                refazer = sc.nextLine();
            } else if (operacoes == 4) {
                System.out.println("Escreva o raio de sua esfera: ");
                Double num = sc.nextDouble();
                sc.nextLine();
                Circle.calculaAreaDaSuperficieDaEsfera(num);
                System.out.println("Gostaria de refazer? Sim (s) / Não (n) ");
                refazer = sc.nextLine();
            } else {
                System.out.println("Escolha uma opção valida!");
                refazer = "s";
            }
        }
    }
    public static double calculaAreaDoCirculo(double raio) {
        double area = Math.PI * raio * raio;
        System.out.println("O resultado da area eh: " + area);
        return area;
    }

        public static double calculaPerimetroDoCirculo(double raio){
            double perimetro = 2 * Math.PI * raio;
            System.out.println("O resultado do perimetro eh: " + perimetro);
            return perimetro;

        }

        public static double calculaVolumeDaEsfera(double raio){
            double volume = (4 * Math.PI * raio * raio * raio) / 3;
            System.out.println("O resultado do volume eh: " + volume);
            return volume;
        }

        public static double calculaAreaDaSuperficieDaEsfera(double raio){
            double area = 4 * Math.PI * raio * raio;
            System.out.println("O resultado da area eh: " + area);
            return area;
        }
    }
