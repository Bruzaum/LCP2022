import java.util.Scanner;

public class Exercicio07 {

    public static void main(String[] args) {

        double numbers[] = new double[4];
        System.out.println("Digite no maximo 4 numeros, caso digite queira digitar menos que 4, inserir zero ");
        Scanner scan = new Scanner(System.in);
        for(int i=0;i<4;i++){
            System.out.println("Digite um numero: ");
		    numbers[i] = scan.nextInt();

            double resultado = 0;
            for(int x = 0; x < 4; x++){
                resultado = resultado + Math.pow(numbers[x], x+1);
            }

            System.out.printf("O resultado eh: %f\n\n", resultado);
        }
        scan.close();
	}
    
}
