package strategy;

public class BaixaProdutividade implements PagamentoStrategy {

    @Override
    public double aplicarModificadores(double salario) {
        return salario - 1;
    }
    
}
