import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Coloque o preço do produto: ");
        double preco = scanner.nextDouble();
        System.out.println("");

        scanner.close();

        System.out.println("Novo preço é: " + calcularAcrescimo(preco));
    }

    public static double calcularAcrescimo (double preco) {
        double acrescimo = preco * 0.1;
        double novopreco = preco + acrescimo;
        return novopreco;
    }

}
