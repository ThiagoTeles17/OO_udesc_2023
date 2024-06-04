import javax.xml.transform.Source;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double[] notas = new double[4];
        double soma = 0, media = 0;
        String nome;

        System.out.print("Digite o nome do aluno: ");
        nome = scanner.nextLine();

        for(int i = 1; i <= 3; i++){
            System.out.printf("Digite a nota %d do aluno: ", i);
            notas[i] = scanner.nextDouble();

            soma += notas[i];

        }
        media = soma / 3;
        if(media >= 7){
            System.out.printf("Aluno %s Aprovado", nome);
        }
        else if(media < 7 && media >= 5){
            System.out.printf("Aluno %s em exame", nome);
        }
        else{
            System.out.printf("Aluno %s reprovado", nome);
        }


    }
}