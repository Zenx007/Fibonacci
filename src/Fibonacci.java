import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos termos da sequência de Fibonacci você deseja? ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Por favor, insira um número positivo maior que zero.");
        } else {
            System.out.println("Sequência de Fibonacci com " + n + " termos (versão iterativa):");
            calculoFibonacci(n);
        }

        scanner.close();
    }

    public static void calculoFibonacci(int n) {
        int a = 0;
        int b = 1;

        if (n >= 1) {
            System.out.print(a + " ");
        }
        if (n >= 2) {
            System.out.print(b + " ");
        }

        for (int i = 3; i <= n; i++) {
            int proximo = a + b;
            System.out.print(proximo + " ");
            a = b;
            b = proximo;
        }
    }
}