import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o capital: ");
        double capital = sc.nextDouble();
        double juros = 0.05;
        System.out.println("Digite a quantidade de meses: ");
        int periodo = sc.nextInt();
        double montante = capital * Math.pow((1 + juros),periodo);
        montante = Math.ceil(montante);
        System.out.println("O capital de empréstimo é:" + capital + ", por " + periodo + " meses, tendo uma taxa de juros\n de " + montante + " mensais");

    }
}