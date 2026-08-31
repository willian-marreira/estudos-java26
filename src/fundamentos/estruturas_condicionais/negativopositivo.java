import java.util.Scanner;

public class negativopositivo {
    public static void main(String[] args) { // Adicionado String[] args
        Scanner scanner = new Scanner(System.in);

        // Exibe a mensagem ANTES de solicitar o número
        System.out.print("Digite um número: ");
        int num = scanner.nextInt();

        if (num < 0) {
            // Usando printf para interpretar o %d e adicionando %n para quebrar linha
            System.out.printf("O número %d é negativo%n", num);
        } else if (num > 0) {
            System.out.printf("O número %d é positivo%n", num);
        } else {
            System.out.println("Não negativo");
        }

        scanner.close();
    }
}