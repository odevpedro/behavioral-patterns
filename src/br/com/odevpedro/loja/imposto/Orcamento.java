package br.com.odevpedro.loja.imposto;

import java.math.BigDecimal;

public class Orcamento {
    private BigDecimal valor;
    private int itens;


    public Orcamento(BigDecimal valor, int itens){
        this.valor = valor;
        this.itens = itens;
    }
    public BigDecimal getValor(){
        return valor;
    }
    public int getItens(){
        return itens;
    }
}
