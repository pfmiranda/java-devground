package pt.devground;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.math.BigDecimal;
import java.util.List;

public class Main {

    enum Categoria { CASA, COMIDA, LAZER }

    record Despesa(String descricao, BigDecimal valor, Categoria categoria) {}

    public static void main(String[] args) {
        var despesas = List.of(
                new Despesa("Renda", new BigDecimal("650.00"), Categoria.CASA),
                new Despesa("Supermercado", new BigDecimal("85.40"), Categoria.COMIDA),
                new Despesa("Cinema", new BigDecimal("14.00"), Categoria.LAZER)
        );

        for (var d : despesas) {
            String tipo = switch (d.categoria()) {
                case CASA -> "[Fixa]";
                case COMIDA, LAZER -> "[Variável]";
            };
            System.out.println(tipo + " " + d);
        }

        System.out.println("A correr em Java " + Runtime.version());
    }
}