import java.math.BigDecimal;

public class TestesImpostos {
    public static void main(String[] args) {
        BigDecimal valOrcamento = new BigDecimal("100");


        Orcamento orcamento = new Orcamento(valOrcamento);
        var calc = new CalculadoraDeImpostos();
        System.out.println(calc.calcular(orcamento, TipoImposto.ISS));
    }
}
