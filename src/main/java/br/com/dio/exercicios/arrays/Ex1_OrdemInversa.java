package br.com.dio.exercicios.arrays;

/*
Crie um vetor de 6 números inteiros
e mostre-os na ordem inversa.
*/
public class Ex1_OrdemInversa {
    public static void main(String[] args) {
        int[] vetor = {1,2,3,4,5,6};

        for(int i=0;i<vetor.length;i++){
            System.out.print(vetor[i]+" ");
        }

        System.out.println("\nvetor inverso: ");
        for(int j=(vetor.length - 1);j>=0;j--){
            System.out.print(vetor[j]+" ");
        }
    }
    
}
