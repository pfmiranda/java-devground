package pt.devground.poo;

import java.math.BigDecimal;

public class MBWay implements MetodoPagamento {
    private static final BigDecimal TAXA = new BigDecimal("0.10");
    private static final String NOME = "MBWay";

    @Override
    public BigDecimal calcularTaxa(BigDecimal valor) {
        return valor.add(TAXA);
    }

    @Override
    public String nome() {
        return NOME;
    }
}
