package br.com.letscod.exercicio1;

/*Escreva um programa que informa a tabuada de multiplicação de um número informado pelo
usuário (entre 1-10). Exemplo:*/

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        int num;

        System.out.println("Entre com o numero q deseja a tabuada:");
        num = leia.nextInt();

        for (int i=1; i<=10; i++){
            System.out.println(num + "*" + i + "=" + num*i);
        }
    }
}
