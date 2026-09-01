package fundamentos.estruturascondicionais;

import java.util.Scanner;

class saudacao{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What time is it (from 00 to 23)");
        int hour = scanner.nextInt();

        if( hour<12){
            System.out.println("Good Morning");
        }else if (hour<18){
            System.out.println("Good Afternoon");
        }else if (hour<= 00){
            System.out.println("Good Night");
        }else if(hour > 23){
            System.out.print("Invalid Entry");
        }
    }

}