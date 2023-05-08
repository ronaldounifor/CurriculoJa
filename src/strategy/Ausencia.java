package strategy;

public class Ausencia implements PagamentoStrategy {

    @Override
    public double aplicarModificadores(double salario) {
        return salario * 0.9;
    }
    
}
