public class WhileExercicio4 {
    public static void main(String[] args) {
        int n1 = 0;
        int n2 = 1;
        int contador = 0;

        while (contador < 10) {
            System.out.println(n1);
            int n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            contador++;
        }
    }
}
