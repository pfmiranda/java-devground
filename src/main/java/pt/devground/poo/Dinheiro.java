package pt.devground.poo;

import java.math.BigDecimal;

public class Dinheiro implements MetodoPagamento {
    private static final BigDecimal TAXA = new BigDecimal("0");
    private static final String NOME = "Dinheiro";

    @Override
    public BigDecimal calcularTaxa(BigDecimal valor) {
        return valor.add(TAXA);
    }

    @Override
    public String nome() {
        return NOME;
    }
}