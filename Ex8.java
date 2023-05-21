import java.util.Scanner; 

public class Ex8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Coloque o custo do item: ");
        double custoItem = scanner.nextDouble();
        System.out.println("");

        System.out.print("Coloque a taxa em cima do item: ");
        double taxaImposto = scanner.nextDouble();
        System.out.println("");

        scanner.close();

        System.out.println("Soma imposto é:"+ somaImposto(custoItem, taxaImposto));

    }

    public static double somaImposto (double custoItem, double taxaImposto ) {
        taxaImposto = taxaImposto / 100;
        double somaImposto = custoItem + (taxaImposto * custoItem); 
        return somaImposto;
    }
}
