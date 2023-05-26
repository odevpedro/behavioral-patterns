package br.com.odevpedro.loja.desconto;

import br.com.odevpedro.loja.imposto.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeDesconto {
    public BigDecimal calcular(Orcamento orcamento){
        if (orcamento.getItens() > 5) {
            return orcamento.getValor().multiply(new BigDecimal("0.1"));
        }
        if (orcamento.getValor().compareTo(new BigDecimal("500")) > 0 ){
            return orcamento.getValor().multiply(new BigDecimal("0.1"));
        }
        
        return BigDecimal.ZERO;
    }
}
