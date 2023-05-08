package strategy;

public class AcionalNoturno implements PagamentoStrategy {

    @Override
    public double aplicarModificadores(double salario) {
        return salario + 2000;
    }
    
}
