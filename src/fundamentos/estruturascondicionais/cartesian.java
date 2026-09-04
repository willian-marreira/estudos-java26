package fundamentos.estruturascondicionais;
import java.util.Scanner;
import java.util.Locale;
public class cartesian {
    public static void main(String []args){
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        double x = scanner.nextDouble();
        double y= scanner.nextDouble();

        if(x == 0.0 && y == 0.0){
            System.out.println("Origin");
        }else if(x>0.0 && y>0.0){
            System.out.println("Q1");
        }else if(x<0.0 && y<0.0){
            System.out.println("Q3");
        }else if(x<0.0 && y>0.0){
            System.out.println("Q2");
        }else{
            System.out.println("Q4");
        }
    }
}
