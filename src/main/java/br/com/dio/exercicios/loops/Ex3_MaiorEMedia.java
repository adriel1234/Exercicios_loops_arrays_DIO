package br.com.dio.exercicios.loops;

import java.util.Scanner;

/*
Faça um programa que leia 5 números
e informe o maior número
e a média desses números.
*/
public class Ex3_MaiorEMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double media,n,maior;
        media = 0;
        maior = 0;
        for(int i = 0; i<5;i++){
            System.out.println("Informe um numero: ");
            n = scan.nextDouble();

            if(n>maior){
                maior = n;
            }
            media+=n;
        }
        media = media/5;
        System.out.println("A media é: "+media);
        System.out.println("o maior numero é "+maior);
    }
    
}
