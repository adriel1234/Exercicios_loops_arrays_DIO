package br.com.dio.exercicios.loops;

import java.time.format.TextStyle;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class Ex1_NomeIdade{
    public static void main( String[] args ){
        Scanner scan =new Scanner(System.in);

        String nome;
        int idade;

        while(true){
            System.out.println("Nome: ");
            nome = scan.next();
            if(nome.equals("0")) break;
            System.out.println("Idade: ");
            idade = scan.nextInt();

        }

    }
}
