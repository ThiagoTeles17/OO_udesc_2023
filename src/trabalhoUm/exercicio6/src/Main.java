import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int idade;


        System.out.print("Digite sua idade: ");
        idade = scanner.nextInt();

        if(idade >= 18 && idade <= 67){
            System.out.println("Pode doar sangue");
        }
        else {
            System.out.println("Não pode doar sangue");
        }

    }
}