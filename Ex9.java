import java.util.Scanner;


public class Ex9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Escreva um número inteiro: ");
        Integer numero = scanner.nextInt();
        System.out.println("");

        scanner.close();
        
        System.out.println("Número invertido: "+ retornarInverso(numero));
    }

    public static String retornarInverso (Integer numero) {
       String caractereNumero = numero.toString();
       String inverterNumero = "";

       for (int comprimento =caractereNumero.length() ; comprimento > 0; comprimento-- ) {
        inverterNumero += caractereNumero.substring(comprimento-1, comprimento);
       }
       return inverterNumero;
    }
}
