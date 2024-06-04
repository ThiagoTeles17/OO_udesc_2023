
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] num = new int[5];
        int maior = Integer.MIN_VALUE, menor = Integer.MAX_VALUE;


        for(int i = 1; i <= 4; i++){
            System.out.printf("Digite o numero %d: ", i);
            num[i] = scanner.nextInt();

            if(num[i] > maior){
                maior = num[i];
            }
            if(num[i] < menor){
                menor = num[i];
            }

        }

        System.out.printf("O maior número é %d e o menor é %d", maior, menor);


    }
}