package pt.devground.poo;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

public class AppPagamentos {

    public static void main(String[] args) {
        BigDecimal valor = new BigDecimal("120.00");

        List<MetodoPagamento> metodos = List.of(
                new Cartao(),
                new MBWay(),
                new Dinheiro()
        );

        for (MetodoPagamento m : metodos) {
            BigDecimal taxa = m.calcularTaxa(valor).setScale(2, RoundingMode.HALF_UP);
            System.out.println(m.nome() + ": " + taxa + " €");
        }
    }

}
