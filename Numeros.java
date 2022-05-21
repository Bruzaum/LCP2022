/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author aluno
 */
public class Numeros {
    
    public static void main (String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        List<Integer> list = new ArrayList<Integer>();
        
        for(int i = 0; i < 5; i++){
            System.out.printf("Digite o " + (i+1) + "° numero: ");
            int number = scan.nextInt();
            list.add(number);
            System.out.println();
        }
        scan.close();
        
        List<Integer> temp_list = new ArrayList<Integer>();
        
        for(int n : list){
            if(!temp_list.contains(n)){
                temp_list.add(n);
            }
        }
        
        Collections.sort(temp_list);
        
        if(temp_list.size() < 3){
            System.out.println("insuficiente");
        }else{
            List<Integer> novaLista = new ArrayList<Integer>();
            for (int i = 0; i < 3; i++){
                novaLista.add(temp_list.get(temp_list.size()-i-1));
                System.out.printf(temp_list.get(temp_list.size()-i-1) + ",");
            }
            if((novaLista.get(novaLista.size()-1)) - (novaLista.get(0)) == -2 ){
                System.out.println();
                System.out.print("Condicao verdadeira");
            }
        }
       
    }
    
}
