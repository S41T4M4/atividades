import java.util.Scanner;

public class DoWhileExercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Digite um número entre 1 e 100: ");
            numero = scanner.nextInt();
        } while (numero < 1 || numero > 100);

        System.out.println("Número validado: " + numero);

        scanner.close();
    }
}
