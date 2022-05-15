

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int i = scan.nextInt();
        String saida = "* ";

        if (i <= 20 && i > 0 ){
            for(int x = 1; x < i; x ++){
                saida = saida + "* ";
            }
            System.out.printf("%s\n", saida);
        }else{
            System.out.print("Numero invalido\n");
        }
		scan.close();
	}

}