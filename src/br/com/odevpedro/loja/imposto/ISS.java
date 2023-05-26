package br.com.odevpedro.loja.imposto;

import java.math.BigDecimal;

public class ISS implements Imposto{
    @Override
    public BigDecimal calcular(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.06"));
    }
}


/*Sempre que eu tenho uma regra que varia de acordo com um parametro e/ou algum tipo
* de informação*/