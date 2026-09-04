package fundamentos.estruturascondicionais;
import java.util.Scanner;
import java.util.Scanner;
public class intervalo {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");

        int num = scanner.nextInt();
        if(num<0 && num>100){
            System.out.printf("Out of Range");
        }else if(num<=25){
            System.out.printf("Interval (0, 25)");
        }else if(num<=50){
            System.out.printf("Interval (25, 50)");
        }else if(num<=75){
            System.out.printf(" Interval (50, 75)");
        }else if(num<=100){
            System.out.printf(" Interval (75, 100)");
        }else if(num<=25){
            System.out.printf("Interval (0, 25)");
        }
    }
}
