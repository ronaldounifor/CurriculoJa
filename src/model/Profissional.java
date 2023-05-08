package model;

import java.util.ArrayList;
import java.util.List;

import strategy.PagamentoStrategy;
import template.Curriculo;

public class Profissional {
    private Curriculo curriculo;
    private double salario;
    
    private List<PagamentoStrategy> estrategias;

    public Profissional(double salario) {
        this.salario = salario;
        estrategias = new ArrayList<>();
    }

    public void adicionarEstrategia(PagamentoStrategy estrategia) {
        estrategias.add(estrategia);
    }

    public double getSalario() {
        return salario;
    }

    public double getSalarioModificado() {
        double salarioModificado = salario;

        for (PagamentoStrategy estrategia : estrategias)
            salarioModificado = estrategia.aplicarModificadores(salarioModificado);

        return salarioModificado;
    }

}
