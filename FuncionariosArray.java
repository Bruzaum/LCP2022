/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula03;

/**
 *
 * @author aluno
 */
import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class FuncionariosArray{

        private String name;
        private double sal;

        public FuncionariosArray(String name, double sal){
            this.name = name;
            this.sal = sal;
        }

        @Override
        public String toString(){
            return this.name + " tem salario igual a R$" + this.sal;
        }
        
        public static void main(String[] args) {
            FuncionariosArray[] func = new FuncionariosArray[5];

            Scanner scan = new Scanner(System.in);

            for(int i = 0; i < func.length; i++){
                String nome = scan.nextLine();
                double salario = scan.nextDouble();

                func[i] = new FuncionariosArray(nome, salario);
                scan.nextLine();
            }
            
            scan.close();
            
            for(int i = 0; i < func.length; i++){
                System.out.printf("%s\n", func[i].toString());
            }

        }

    }

    
