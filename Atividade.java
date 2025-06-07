
package atividade4;

import java.util.Scanner;

public class Atividade {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Array para armazenar o número de vendedores em cada faixa salarial
        int[] contadores = new int[9]; // 9 faixas no total

        System.out.println("Digite as vendas brutas dos vendedores (digite um valor negativo para encerrar):");

        while (true) {
            System.out.print("Vendas brutas: ");
            double vendasBrutas = scanner.nextDouble();

            // Condição de saída: valor negativo
            if (vendasBrutas < 0) {
                break;
            }

            // Calcula o salário semanal
            double salario = 200 + 0.09 * vendasBrutas;

            // Determina qual faixa salarial o vendedor pertence
            if (salario >= 200 && salario <= 299) {
                contadores[0]++;
            } else if (salario >= 300 && salario <= 399) {
                contadores[1]++;
            } else if (salario >= 400 && salario <= 499) {
                contadores[2]++;
            } else if (salario >= 500 && salario <= 599) {
                contadores[3]++;
            } else if (salario >= 600 && salario <= 699) {
                contadores[4]++;
            } else if (salario >= 700 && salario <= 799) {
                contadores[5]++;
            } else if (salario >= 800 && salario <= 899) {
                contadores[6]++;
            } else if (salario >= 900 && salario <= 999) {
                contadores[7]++;
            } else if (salario >= 1000) {
                contadores[8]++;
            }
        }

        // Exibe os resultados
        System.out.println("\nQuantidade de vendedores por faixa salarial:");
        System.out.println("$200 - $299: " + contadores[0]);
        System.out.println("$300 - $399: " + contadores[1]);
        System.out.println("$400 - $499: " + contadores[2]);
        System.out.println("$500 - $599: " + contadores[3]);
        System.out.println("$600 - $699: " + contadores[4]);
        System.out.println("$700 - $799: " + contadores[5]);
        System.out.println("$800 - $899: " + contadores[6]);
        System.out.println("$900 - $999: " + contadores[7]);
        System.out.println("$1000 em diante: " + contadores[8]);

        scanner.close();
    }
}
