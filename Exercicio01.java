
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author aluno
 */
public class Exercicio01 {
    
     public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
         String frase = scan.nextLine();
         scan.close();
         
         String[] lista = frase.split(" ");
         
         String palavramaior = lista[0];
         
         for(String palavra : lista){
             if(palavramaior.length() <= palavra.length()){
                 palavramaior = palavra;
             }
         }
         
         System.out.printf("Quantidade: %d\n", lista.length);
         System.out.printf("Maior palavra: %s\n", palavramaior);
     }
    
}
