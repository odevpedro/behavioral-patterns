package br.com.odevpedro.loja.desconto;

import br.com.odevpedro.loja.imposto.Orcamento;

import java.math.BigDecimal;

public abstract class Desconto {
    protected Desconto proximo;

    public Desconto(Desconto proximo){
        this.proximo = proximo;
    }

    public abstract BigDecimal calcular(Orcamento orcamento);


}
