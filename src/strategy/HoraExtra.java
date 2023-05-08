package strategy;

public class HoraExtra implements PagamentoStrategy {

    @Override
    public double aplicarModificadores(double salario) {
        return salario + 50;
    }
    
}
