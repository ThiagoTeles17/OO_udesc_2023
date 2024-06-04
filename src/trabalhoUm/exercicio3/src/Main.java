import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num1, num2;

        System.out.print("Digite um numero: ");
        num1 = scanner.nextInt();

        System.out.print("Digite outro numero: ");
        num2 = scanner.nextInt();

        if(num1 > num2){
            System.out.println("Numero um é maior que numero 2");
        }
        else if(num2 > num1){
            System.out.println("Numero dois é maior que numero 1");
        }
        else{
            System.out.println("Os numeros sao iguais");
        }


    }
}