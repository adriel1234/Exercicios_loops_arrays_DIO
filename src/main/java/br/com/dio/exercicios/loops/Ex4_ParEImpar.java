package br.com.dio.exercicios.loops;

import java.util.Scanner;

/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares.
*/
public class Ex4_ParEImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int qtde,numero,par,impar;
        
        impar=par= 0;
        System.out.println("Informe a qunatidade de numero para digitar: ");
        qtde = scan.nextInt();

        for(int i = 0; i<qtde;i++){
            System.out.println("Digite um numero: ");
            numero = scan.nextInt();
            if((numero % 2)==0){
                par+=1;
            }else{
                impar+=1;
            }
        }

        System.out.println("Quantidade par: "+par);
        System.out.println("Quantidade Impar: "+impar);
    }
    
}
