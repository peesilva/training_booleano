import java.util.Scanner;

public class training_booleano {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Write true or false: ");
        boolean valor = scanner.nextBoolean();

        boolean valorInvertido = !valor;

        System.out.println("original value: " + valor);
        System.out.println("value inverse: " + valorInvertido);

        scanner.close();
    }
}