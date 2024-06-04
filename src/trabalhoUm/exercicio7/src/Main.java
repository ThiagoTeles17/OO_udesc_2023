import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double valorHora, horasTrabalhadas;

        System.out.println("Digite quanto o funcionario ganha por hora trabalhada: ");
        valorHora = scanner.nextDouble();

        System.out.println("Digite quantas horas o funcionario trabalha por mês: ");
        horasTrabalhadas = scanner.nextDouble();

        System.out.printf("\nO funcionario ganha %.2f por mês", valorHora * horasTrabalhadas);

    }
}