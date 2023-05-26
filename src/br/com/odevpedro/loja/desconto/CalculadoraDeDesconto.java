package br.com.odevpedro.loja.desconto;

import br.com.odevpedro.loja.imposto.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeDesconto {
    //Caso a primeira regra não seja satisfátoria, chame a próxima
    public BigDecimal calcular(Orcamento orcamento){

        BigDecimal desconto = new DescOrcamentoMaiorCincoItens().calcular(orcamento);
        if (desconto.equals(BigDecimal.ZERO)) {
            desconto = new DescOrcamentoMaiorQuientos().calcular(orcamento);
        }
        return BigDecimal.ZERO;
    }
}
