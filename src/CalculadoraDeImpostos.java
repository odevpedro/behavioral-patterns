import java.math.BigDecimal;

public class CalculadoraDeImpostos {
    //Flexibilizar o código para calcular o valor do imposto independente do valor do mesmo
    public BigDecimal calcular(Orcamento orcamento, TipoImposto tipoImposto){
        if (tipoImposto.equals(TipoImposto.ICMS)){
            var o  = orcamento.getValor().multiply(new BigDecimal("0.1"));
            System.out.println(o);

        } else if (tipoImposto.equals(TipoImposto.ISS)){
            var o =  orcamento.getValor().multiply(new BigDecimal("0.06"));
            System.out.println(o);
        }
        return BigDecimal.ZERO;
    }
}
