package pt.devground.poo;

import java.math.BigDecimal;

public class Dinheiro implements MetodoPagamento {
    private static final BigDecimal TAXA = BigDecimal.ZERO;
    private static final String NOME = "Dinheiro";

    @Override
    public BigDecimal calcularTaxa(BigDecimal valor) {
        return TAXA;
    }

    @Override
    public String nome() {
        return NOME;
    }
}