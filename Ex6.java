import java.util.Scanner;
public class Ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("função que necessite de três argumentos");

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

        System.out.println("A soma dos números "+ numero1 +", " + numero2 +", "+ numero3 +" são: "+ somarNumeros(numero1, numero2, numero3));

    }

    private static double somarNumeros (double numero1, double numero2, double numero3) {
        double somar = numero1 + numero2 + numero3;
        return somar;
    }
}
