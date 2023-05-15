import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Coloque a temperatura em Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();
        System.out.println("");

        scanner.close();

        System.out.printf("A temperatura em Celsius é: " + "%.2f" ,converterCelsius(fahrenheit));
    }

    private static double converterCelsius(Double fahrenheit) {
        double celsius = (fahrenheit - 32) /1.8;
        return celsius;
    }
}
