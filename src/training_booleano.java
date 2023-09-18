import java.util.Scanner;

public class training_booleano {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite true ou false: ");
        boolean valor = scanner.nextBoolean();

        boolean valorInvertido = !valor;

        System.out.println("Valor original: " + valor);
        System.out.println("Valor invertido: " + valorInvertido);

        // Não se esqueça de fechar o scanner quando não for mais necessário
        scanner.close();
    }
}