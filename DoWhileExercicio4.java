import java.util.Scanner;

public class DoWhileExercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double nota, soma = 0;
        int quantidade = 0;
        char continuar;

        do {
            System.out.print("Digite a nota (0 a 10): ");
            nota = scanner.nextDouble();

            if (nota >= 0 && nota <= 10) {
                soma += nota;
                quantidade++;
            } else {
                System.out.println("Nota inválida.");
            }

            System.out.print("Deseja inserir outra nota? (s/n): ");
            continuar = scanner.next().charAt(0);

        } while (continuar == 's' || continuar == 'S');

        if (quantidade > 0) {
            double media = soma / quantidade;
            System.out.println("Média das notas: " + media);
        } else {
            System.out.println("Nenhuma nota válida inserida.");
        }

        scanner.close();
    }
}
