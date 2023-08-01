package com.senac.refactor;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("""
        Qual operação deseja realizar?
        1. Calcular area circulo
        2. Calcular perimetro
        3. Calcular volume esfera
        4. calcular area superficie esfera""");


        int operacoes = sc.nextInt();
        sc.nextLine();

        if (operacoes == 1){
        }
    }
    public double calculaAreaDoCirculo(double raio) {
        double area = Math.PI * raio * raio;
        return area;
    }

        public double calculaPerimetroDoCirculo ( double raio){
            double perimetro = 2 * Math.PI * raio;
            return perimetro;
        }

        public double calculaVolumeDaEsfera ( double raio){
            double volume = (4 * Math.PI * raio * raio * raio) / 3;
            return volume;
        }

        public double calculaAreaDaSuperficieDaEsfera ( double raio){
            double area = 4 * Math.PI * raio * raio;
            return area;
        }
    }
