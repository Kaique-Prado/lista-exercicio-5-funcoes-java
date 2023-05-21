import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Escreva o primeiro número: ");
        double numero1 = scanner.nextDouble();
        System.out.println("");

        System.out.print("Escreva o segundo número: ");
        double numero2 = scanner.nextDouble();
        System.out.println("");

        System.out.print("Escreva o terceiro número: ");
        double numero3 = scanner.nextDouble();
        System.out.println("");

        scanner.close();

        System.out.println("Média Aritmética: " + calcularMediaAritmetica(numero1, numero2, numero3));
        System.out.println("Média Harmonica: " + calcularMediaHarmonica(numero1, numero2, numero3));
        System.out.println("Média Geométrica: "+ calcularMediaGeometrica(numero1, numero2, numero3));

    }

    public static double calcularMediaAritmetica(double numero1, double numero2, double numero3) {
        double media = (numero1 + numero2 + numero3) / 3;
        return media;
    }

    public static double calcularMediaHarmonica( double numero1, double numero2, double numero3 ) {
        double media = 3/ (1/numero1) + (1/numero2) + (1/numero3);
        return media;
    }

    public static double calcularMediaGeometrica (double numero1, double numero2, double numero3) {
        double media = Math.cbrt(numero1 * numero2 * numero3);
        return media;
    }
}
