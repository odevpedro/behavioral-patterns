package br.com.odevpedro.loja.desconto;

import br.com.odevpedro.loja.imposto.Orcamento;

import java.math.BigDecimal;

public class DescOrcamentoMaiorQuientos {
    public BigDecimal calcular(Orcamento orcamento) {
        if (orcamento.getValor().compareTo(new BigDecimal("500"))> 0) {
            return orcamento.getValor().multiply(new BigDecimal("0.05"));
        }
        return BigDecimal.ZERO;
    }
}
