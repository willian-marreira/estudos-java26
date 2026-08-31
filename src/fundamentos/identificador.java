
package fundamentos;
import java.util.Scanner;

public class identificador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");

        int num = scanner.nextInt();

        if(num%2 == 0){
            System.out.printf("The number %d is even", num);
        }else {
            System.out.printf("The number %d is odd", num);
        }
    }
}
//..//ss
