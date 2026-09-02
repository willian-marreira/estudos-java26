package fundamentos.estruturascondicionais;

import java.util.Scanner;
public class contagemdehoras {
    public static void main( String[] args ){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number:");

        int StartTime = scanner.nextInt();
        int EndTime = scanner.nextInt();

        int duration;
        if(StartTime > EndTime){
            duration = EndTime - StartTime ;
        }else{
            duration = 24 - StartTime + EndTime;
        }
        System.out.printf("The game lasted " + duration + "hours");
    }
}
