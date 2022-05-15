import java.util.Scanner;

public class Exercicio08 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int a = scan.nextInt();
        scan.close();

        int temp = a;
        int number[] = new int[100];
        int i = 0;
        int ind = 0;

        for(i = 0; temp > 0; i++){
            number[i] = temp % 10;
            temp = (temp/10);
            ind++;
        }

        int resultado = 0;
        for(int x = 0; x <= i; x++){
            resultado = (int) (resultado + Math.pow(number[(int)x], ind));
        }

        if(resultado == a){
            System.out.println("Premissa verdadeira");
        }else{
            System.out.println("Premissa Falsa");
        }
	}

}
