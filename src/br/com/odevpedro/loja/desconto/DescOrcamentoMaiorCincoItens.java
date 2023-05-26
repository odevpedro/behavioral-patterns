package br.com.odevpedro.loja.desconto;

import br.com.odevpedro.loja.imposto.Orcamento;

import java.math.BigDecimal;

public class DescOrcamentoMaiorCincoItens {
    public BigDecimal calcular(Orcamento orcamento) {
        if (orcamento.getItens() > 5 ) {
            return orcamento.getValor().multiply(new BigDecimal("0.1"));
        }
        return BigDecimal.ZERO;
    }
}
