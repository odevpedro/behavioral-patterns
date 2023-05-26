package br.com.odevpedro.loja.desconto;

import br.com.odevpedro.loja.imposto.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeDesconto {
    //Caso a primeira regra não seja satisfátoria, chame a próxima em cadeia
    public BigDecimal calcular(Orcamento orcamento) {
        Desconto desconto = new DescOrcamentoMaiorCincoItens(
                new DescOrcamentoMaiorQuientos(
                        new SemDesconto()));
        return desconto.calcular(orcamento);

    }
}
