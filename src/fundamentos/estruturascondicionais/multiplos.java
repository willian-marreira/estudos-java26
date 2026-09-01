package fundamentos.estruturascondicionais;

import java.util.Scanner;
public class multiplos {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if( a%2 == 0 || b%2==0){
            System.out.printf("Os números %d e %d são múltiplos", a, b);
        }else {
            System.out.println("Não são múltiplos");
        }
    }
}
