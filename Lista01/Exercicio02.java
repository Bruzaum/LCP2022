import java.util.Scanner;

public class Exercicio02 {

    static int soma(int a, int b, int c){
        return (a + b + c);
    }

    static int produto(int a, int b, int c){
        return (a * b * c);
    }

    static int media(int a, int b, int c){
        return (a + b + c) /(3);
    }

    static int[] ordem(int a, int b, int c){

        int[] order = new int[3];

        if((a<=b)&&(b<=c)){

            order[0] = a;
            order[1] = b;
            order[2] = c;

            return order;
        }else if((c<=b)&&(b<=a)){
            
            order[0] = c;
            order[1] = b;
            order[2] = a;

            return order;
        }else if((b<=a)&&(a<=c)){
            
            order[0] = b;
            order[1] = a;
            order[2] = c;

            return order;
        }else if((a<=c)&&(c<=b)){
            
            order[0] = a;
            order[1] = c;
            order[2] = b;

            return order;
        }else if((c<=a)&&(a<=b)){
            
            order[0] = c;
            order[1] = a;
            order[2] = b;

            return order;
        }else if((b<=c)&&(c<=a)){
            
            order[0] = b;
            order[1] = c;
            order[2] = a;

            return order;
        }else
            return null;
    }

    public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        System.out.printf("soma: %d\n", soma(a,b,c));
        System.out.printf("produto: %d\n", produto(a,b,c));
        System.out.printf("media: %d\n", media(a,b,c));

        int[] cresc_numbers = ordem(a, b, c);

        System.out.printf("Os números digitados na ordem crescente são: %d %d %d \n\n", cresc_numbers[0], cresc_numbers[1], cresc_numbers[2]);

        scan.close();
    }
    
}
