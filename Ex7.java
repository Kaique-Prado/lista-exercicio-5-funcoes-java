import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Escreva um número: ");
        double numero1 = scanner.nextDouble();
        System.out.println("");

        scanner.close();

        System.out.println("O número "+ numero1 +" é:"+ validarNumero(numero1));
    }
    private static String validarNumero (double numero1) {
        String valida;
        if(numero1 > 0 ) { 
            valida = "P";
        } else {
            valida = "N";
        }
        return valida; 
    }
}
