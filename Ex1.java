import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Escreva o primeiro número: ");
        double numero1 = scanner.nextDouble();
        System.out.println("");
        
        System.out.println("Escreva o segundo número: ");
        double numero2 = scanner.nextDouble();
        System.out.println("");
        
        scanner.close();

        System.out.println("O resuldado é " + calcularMedia(numero1, numero2));


    }   

    private static double calcularMedia (Double numero1,  Double numero2) {
        double resultado = (numero1 + numero2) /2;
        return resultado;
    }


}
