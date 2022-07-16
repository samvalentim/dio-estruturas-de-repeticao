package exercicios.loops;

/*
Faça um programa que peça uma nota, entre zero e dez.
Mostre uma mensagem caso o valor seja inválido
e continue pedindo
até que o usuário informe um valor válido.
*/

import java.util.Scanner;

public class nota {
    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);
        int nota;

        System.out.println("Digite o valor da nota: ");
        nota = scan.nextInt();

        while (nota<0 | nota>10) {
        System.out.println("Nota inválida! Digite uma nota entre zero e dez.");
        nota = scan.nextInt();
        }
    }
}
