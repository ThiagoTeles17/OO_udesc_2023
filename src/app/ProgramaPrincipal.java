package app;

import domain.Pessoa;

import java.math.BigDecimal;
import java.time.LocalDate;

public class ProgramaPrincipal  {

    public static void main(String[] args){
        Pessoa fulano = new Pessoa();

        fulano.setNome("Fulano da Silva");
        fulano.setEndereco("Rua Andorinha, 89");
        fulano.setNascimento(LocalDate.of(1950, 12, 20));
        fulano.setSalario(new BigDecimal("3200.50"));
        fulano.apresentase();
        System.out.println();

        Pessoa beltrano = new Pessoa(
                "Beltrano",
                "Rua das Pedras, 33",
                LocalDate.of(2005, 01, 13),
                new BigDecimal("500.00")
        );
        beltrano.apresentase();
        System.out.println();

        System.out.println(fulano.toString());
        System.out.println(beltrano.toString());



    }


}
