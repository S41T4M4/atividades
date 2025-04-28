import java.util.Scanner;
import java.util.Random;

public class DoWhileExercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numeroSorteado = random.nextInt(20) + 1;
        int tentativa;
        int tentativas = 0;

        do {
            System.out.print("Tente adivinhar o número (1 a 20): ");
            tentativa = scanner.nextInt();
            tentativas++;

            if (tentativa < numeroSorteado) {
                System.out.println("O número é maior.");
            } else if (tentativa > numeroSorteado) {
                System.out.println("O número é menor.");
            }
        } while (tentativa != numeroSorteado);

        System.out.println("Parabéns! Você acertou em " + tentativas + " tentativas.");

        scanner.close();
    }
}
