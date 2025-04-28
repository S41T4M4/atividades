import java.util.Scanner;

public class ForExercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int fatorial = 1;

        System.out.print("Digite um número inteiro positivo: ");
        int numero = scanner.nextInt();

        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }

        System.out.println("Fatorial de " + numero + " é: " + fatorial);

        scanner.close();
    }
}
