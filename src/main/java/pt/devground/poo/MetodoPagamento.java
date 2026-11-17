package pt.devground.poo;

import java.math.BigDecimal;

public interface MetodoPagamento {
    BigDecimal calcularTaxa(BigDecimal valor);

    String nome();
}
