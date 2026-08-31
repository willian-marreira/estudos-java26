import java.util.Scanner;

class saudacao{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Que horas são ( de 00 às 23)");
        int hora = scanner.nextInt();

        if( hora<12){
            System.out.println("Bom dia");
        }else if (hora<18){
            System.out.println("Boa tarde");
        }else if (hora<= 00){
            System.out.println("Boa noite");
        }else if(hora > 23){
            System.out.print("Digito Inváldio");
        }
    }

}