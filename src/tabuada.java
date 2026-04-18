import java.util.Scanner;

public class tabuada {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número para ver a tabuada:");
        int numero = scanner.nextInt();

        if (numero <= 0) {
            System.out.println("Digite um número positivo!");
        } else {

            System.out.println("Tabuada do " + numero + ":");

            for (int i = 1; i <= 10; i++) {
                System.out.println(numero + " x " + i + " = " + (numero * i));
            }
        }

        scanner.close();
    }
}
