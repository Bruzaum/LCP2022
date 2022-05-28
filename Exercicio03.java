
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author aluno
 */
public class Exercicio03 {
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
         String placa = scan.nextLine();
         scan.close();
         
         //string.matches(regex)
         
         boolean validaVelha = placa.matches("[A-Z]{3}-\\d{4}");
         
         boolean validaNova = placa.matches("[A-Z]{3}\\d{1}[A-Z]{1}\\d{2}");
         
         System.out.println(validaVelha);
         System.out.println(validaNova);
     }
}
