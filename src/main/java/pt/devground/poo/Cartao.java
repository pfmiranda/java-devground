package pt.devground.poo;

import java.math.BigDecimal;


public class Cartao implements MetodoPagamento {
    private static final BigDecimal PERCENTAGEM_TAXA = new BigDecimal("0.015");
    private static final String NOME = "Cartão";

    @Override
    public BigDecimal calcularTaxa(BigDecimal valor) {
        return valor.multiply(PERCENTAGEM_TAXA);
    }

    @Override
    public String nome() {
        return NOME;
    }
}
