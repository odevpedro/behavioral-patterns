package br.com.odevpedro.loja.imposto;

import java.math.BigDecimal;

public class TestesImpostos {
    public static void main(String[] args) {
        BigDecimal valOrcamento = new BigDecimal("100");
        Orcamento orcamento = new Orcamento(valOrcamento, 23);
        CalculadoraDeImpostos calc = new CalculadoraDeImpostos();
        System.out.println(calc.calcular(orcamento, new ISS()));

    }
}
