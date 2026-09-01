package fundamentos.estruturascondicionais;
import java.util.Scanner;

public class negativopositivo {
    public static void main(String[] args) { // Adicionado String[] args
        Scanner scanner = new Scanner(System.in);

        // Exibe a mensagem ANTES de solicitar o número
        System.out.print("Enter a number ");
        int num = scanner.nextInt();

        if (num < 0) {
            // Usando printf para interpretar o %d e adicionando %n para quebrar linha
            System.out.printf("The number %d is negative%n", num);
        } else if (num > 0) {
            System.out.printf("The number %d is positive%n", num);
        } else {
            System.out.println("Not negative");
        }

        scanner.close();
    }
}