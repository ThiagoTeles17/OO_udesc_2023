import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int anosFuma, qtdCigarros;
        double valorCarteira, valorGasto;

        System.out.println("A quantos anos o fumante fuma? ");
        anosFuma = scanner.nextInt();

        System.out.println("Quantos cigarros consome por dia? ");
        qtdCigarros = scanner.nextInt();

        System.out.println("Qual o valor da carteira de cigarros? ");
        valorCarteira = scanner.nextDouble();

        int diasFumados = anosFuma * 365;

        valorGasto = ((qtdCigarros / 20.00) * valorCarteira) * diasFumados;

        System.out.printf("Em %d anos, o fumante gastou R$ %.2f", anosFuma, valorGasto);

    }
}