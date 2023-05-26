package br.com.odevpedro.loja.imposto;

import java.math.BigDecimal;

public interface Desconto {
    public BigDecimal regraDesconto(Orcamento orcamento);
}
