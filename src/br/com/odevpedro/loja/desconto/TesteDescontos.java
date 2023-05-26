package br.com.odevpedro.loja.desconto;

import br.com.odevpedro.loja.imposto.Orcamento;

import java.math.BigDecimal;

public class TesteDescontos {

    public static void main(String[] args) {
        Orcamento primeiro = new Orcamento(new BigDecimal("200"), 6);
        Orcamento segundo = new Orcamento(new BigDecimal("1000"), 1);


        CalculadoraDeDesconto calc = new CalculadoraDeDesconto();
        System.out.println(calc.calcular(primeiro));
        System.out.println(calc.calcular(segundo));

    }

}
