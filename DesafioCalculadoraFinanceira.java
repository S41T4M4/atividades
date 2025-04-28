import java.util.Scanner;

public class DesafioCalculadoraFinanceira {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char continuar;

        do {
            System.out.print("Digite o valor inicial do investimento (P): ");
            double p = scanner.nextDouble();

            System.out.print("Digite a taxa de juros anual (r em %): ");
            double r = scanner.nextDouble();

            System.out.print("Digite o período de investimento (t em anos): ");
            int t = scanner.nextInt();

            System.out.print("Escolha o tipo de capitalização (simples ou composta): ");
            String tipo = scanner.next();

            double m;

            if (tipo.equalsIgnoreCase("simples")) {
                m = p * (1 + (r / 100) * t);
            } else if (tipo.equalsIgnoreCase("composta")) {
                m = p * Math.pow((1 + (r / 100)), t);
            } else {
                System.out.println("Tipo de capitalização inválido. Assumindo simples.");
                m = p * (1 + (r / 100) * t);
            }

            System.out.printf("Montante final: R$ %.2f%n", m);

            System.out.print("Deseja realizar outro cálculo? (s/n): ");
            continuar = scanner.next().charAt(0);

        } while (continuar == 's' || continuar == 'S');

        scanner.close();
    }
}
