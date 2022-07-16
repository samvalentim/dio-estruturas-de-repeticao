package exercicios.loops;

import java.util.Scanner;

/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares.
*/
public class parEImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quantNumeros;
        int numero;
        int count = 0;
        int quantPares = 0, quantImpares = 0;
        System.out.print("Quantidade de números: ");
        quantNumeros = scan.nextInt();

        do {
            System.out.println("Digite um número: ");
            numero = scan.nextInt();
            if (numero % 2 == 0 ) quantPares++;
            else quantImpares++;

            count = count + 1;
        } while(count < quantNumeros);

        System.out.println("Quantidade Par: " + quantPares);
        System.out.println("Quantidade Ímpar: " + quantImpares);
    }
}