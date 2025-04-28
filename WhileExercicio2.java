import java.util.Scanner;

public class WhileExercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        int soma = 0;

        System.out.println("Digite números positivos. Um número negativo encerra o programa.");

        System.out.print("Digite um número: ");
        numero = scanner.nextInt();

        while (numero >= 0) {
            soma += numero;
            System.out.print("Digite um número: ");
            numero = scanner.nextInt();
        }

        System.out.println("Soma total: " + soma);

        scanner.close();
    }
}
