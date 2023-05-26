package br.com.odevpedro.loja.imposto;

import java.math.BigDecimal;

public class CalculadoraDeImpostos {

    //Caso surja novos impostos não precisaremos mais modificar essa classe
    public BigDecimal calcular(Orcamento  orcamento, Imposto imposto){
        return imposto.calcular(orcamento);

    }

}
