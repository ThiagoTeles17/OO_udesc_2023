import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double quilometros, litros;

        System.out.print("Digite a quantidade de quilometros percorrida: ");
        quilometros = scanner.nextDouble();

        System.out.print("Digite a quantidade de combustivel gasto (em litros): ");
        litros = scanner.nextDouble();

        System.out.printf("A média de combustível gasto foi de %f KM/L", quilometros/litros);

    }
}