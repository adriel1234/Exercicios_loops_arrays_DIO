package br.com.dio.exercicios.loops;

import java.util.Scanner;

/*
Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
Ex.: 5!= 120 (5 X 4 X 3 X 2 X 1)
*/
public class Ex6_Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int fatorial,multi;
        System.out.println("Fatorial: ");
        fatorial = scan.nextInt();
        multi=1;
        System.out.print(fatorial + "! = ");
        for(int i = fatorial;i>=1;i--){
            multi = multi*i;
        }
        System.out.println(multi);

    }
    
}
