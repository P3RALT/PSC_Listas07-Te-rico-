/*
Faça um programa que receba a temperatura media de cad
mes do ano e armazene-as em uma lista. Apos isto, calcule 
a media anual das temperatuas mostre todas as temperaturas acima da media
anual, e em que mês elas ocorreram (mostrar o mês por extenso 
1 - Janeiro, 2 Fevereiro, .... ); 
 */
package lista07;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*----- CLASSE PRINCIPAL ------*/
public class Lista07 {
    public static void main(String[] args) {
        Scanner Ler = new Scanner(System.in); 
        /* VARIAVEIS --- */
        String[] meses = {"Janeiro",  "Fevereiro", "Março", "Abril", "Maio", "Junho",
                           "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro" };
       
        List<AnoTemperatura> dados = new ArrayList<>();
        double somaTemperaturas = 0;
        
        for (int i = 0; i < 12; i++) {
            System.out.println("Digite a Temperatura media de " + meses[i]);
            double temp = Ler.nextDouble();
            dados.add(new AnoTemperatura(meses[i], temp));
            somaTemperaturas += temp; }
        
        /* O SIZE VERIFICA O TAMANHO DA LISTA PRA FAZER AMERDIA */
        double mediaAnual = somaTemperaturas / dados.size();
        
        System.out.println("\nMedia Anual das Temperaturas: " +String.format("%.2f", mediaAnual) );
        System.out.println("Meses com temperatura acima da média: ");
        

          for (AnoTemperatura item : dados) {
            if (item.gettemperatura() > mediaAnual) {
                System.out.println(item.getmes() + " - " + item.gettemperatura() + "°C");
            }
            
        }
        
    } 
} 
