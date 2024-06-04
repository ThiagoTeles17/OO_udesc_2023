import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numero;

        System.out.print("Insira um numero inteiro: ");
        numero = scanner.nextInt();

        System.out.println("O antecessor do numero é: " + (numero - 1));
        System.out.println("O sucessor do numero é: " + (numero + 1));


    }
}