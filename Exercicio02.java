
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author aluno
 */
public class Exercicio02 {
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
         String palavra = scan.nextLine();
         scan.close();
         
         String palavrafinal = "";
         char letra = palavra.charAt(0);
         int i = 0;
         int j = 0;
         
         for(j = 0; j < palavra.length()  ; j++){
             if(i == 0 ){
                 palavrafinal += Character.toLowerCase(palavra.charAt(j));
                 //letra = palavra.charAt(j);
                 i = 1;
             }else {
                 palavrafinal += Character.toUpperCase(palavra.charAt(j));
                // letra = palavra.charAt(j);
                 i = 0;
             }
         }
         
         //System.out.printf("Quantidade: %d\n", lista.length);
         System.out.printf("Maior palavra: %s\n", palavrafinal);
     }
}
