package lista07_atv02;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Lista07_Atv02 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        List<String> perguntas = List.of(
            "Você telefonou para a vítima?",
            "Esteve no local do crime?",
            "Mora perto da vítima?",
            "Devia para a vítima?",
            "Já trabalhou com a vítima?"
        );

        List<String> respostas = new ArrayList<>();
        int pistas;
        boolean validar;

        do {
            respostas.clear();
            pistas = 0;
            validar = true;

            System.out.println("\n--- Olá, eu sou o Detetive Sherlock Holmes ---");
            System.out.println("Responda às perguntas com 'Sim' ou 'Não'.");

            for (String pergunta : perguntas) {
                System.out.println("-> " + pergunta);
                String resposta = ler.nextLine().trim();

                if (!resposta.equalsIgnoreCase("Sim") && !resposta.equalsIgnoreCase("Nao")) {
                    System.out.println("## RESPOSTA INVÁLIDA! Digite apenas 'Sim' ou 'Não'.");
                    validar = false;
                    break;
                }

                respostas.add(resposta);

                if (resposta.equalsIgnoreCase("Sim")) {
                    pistas++;
                }
            }

        } while (!validar); // Repete se tiver erro de entrada

        System.out.println("\n--- HMMM... TENHO A RESPOSTA! ---");
        if (pistas == 2) {
            System.out.println("Você é SUSPEITO...");
        } else if (pistas >= 3 && pistas <= 4) {
            System.out.println("Você é CÚMPLICE do crime!");
        } else if (pistas == 5) {
            System.out.println("VOCÊ É O ASSASSINO!");
        } else {
            System.out.println("Inocente demais... pode ir.");
        }
    }
}
