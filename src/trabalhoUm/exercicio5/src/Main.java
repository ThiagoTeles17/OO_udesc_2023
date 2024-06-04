import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String nome;
        int idade;

        System.out.print("Digite seu nome: ");
        nome = scanner.nextLine();

        System.out.print("Digite sua idade: ");
        idade = scanner.nextInt();

        if(idade >= 16){
            System.out.println(nome + " apto a votar!");
        }
        else {
            System.out.println(nome + " não pode votar!");
        }

    }
}