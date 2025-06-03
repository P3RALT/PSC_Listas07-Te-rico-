import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lista07_Atv03 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        List<Double> notas = new ArrayList<>();
        double soma = 0;
        double nota;
        
        
        System.out.println("Digite as notas (digite -1 para encerrar):");
        while (true) {
            System.out.print("Nota: ");
            nota = ler.nextDouble();

            if (nota == -1) {
                break;  }
           
            notas.add(nota);
            soma += nota; }

        if (notas.isEmpty()) {
            System.out.println("Nenhuma nota foi informada. Encerrando o programa.");
            return; }

        // Quantidade de notas
        int quantidade = notas.size();
        System.out.println("\nQuantidade de notas lidas: " + quantidade);

        // Notas na ordem original
        System.out.print("Notas na ordem informada: ");
        for (double Nota : notas) {
            System.out.print(nota + " ");
        }

        // Notas na ordem inversa (uma abaixo da outra)
        System.out.println("\n\nNotas na ordem inversa:");
        for (int i = notas.size() - 1; i >= 0; i--) {
            System.out.println(notas.get(i));
        }

        // Soma e média
        double media = soma / quantidade;
        System.out.println("\nSoma das notas: " + soma);
        System.out.println("Média das notas: " + media);

        // Quantidade acima da média
        int acimaMedia = 0;
        int abaixoDeSete = 0;
        for (double Nota : notas) {
            if (nota > media) {
                acimaMedia++;
            }
            if (nota < 7) {
                abaixoDeSete++;
            }
        }

        System.out.println("Notas acima da média: " + acimaMedia);
        System.out.println("Notas abaixo de sete: " + abaixoDeSete);

        System.out.println("\n--- PROGRAMA ENCERRADO. Obrigado por usar! ---");
    }
}
