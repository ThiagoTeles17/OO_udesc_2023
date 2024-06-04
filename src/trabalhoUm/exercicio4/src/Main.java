import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String sexo;

        System.out.println("Digite seu sexo (M masculino, F feminino)");
        sexo = scanner.nextLine();

        if(sexo.toUpperCase().equals("M")){
            System.out.println("Seu sexo é masculino");
        }
        else if (sexo.toUpperCase().equals("F")){
            System.out.println("Seu sexo é feminino");
        }

    }
}