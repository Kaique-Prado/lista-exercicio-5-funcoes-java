import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Escreva um número inteiro: ");
        int numero = scanner.nextInt();

        for( int quantidade = 1; quantidade  <= numero; quantidade++) {
            for ( int vezes = 1; vezes <= quantidade; vezes++ ) {
                System.out.print( quantidade + " ");
            }
            System.out.println("");
        }
        
        scanner.close();
    }
}
