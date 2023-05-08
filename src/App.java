import model.Profissional;
import strategy.AcionalNoturno;
import strategy.Ausencia;
import strategy.BaixaProdutividade;
import strategy.HoraExtra;

public class App {
    public static void main(String[] args) throws Exception {
        Profissional trabalhador = new Profissional(5000);

        trabalhador.adicionarEstrategia(new BaixaProdutividade());
        // trabalhador.adicionarEstrategia(new Ausencia());
        trabalhador.adicionarEstrategia(new AcionalNoturno());
        trabalhador.adicionarEstrategia(new HoraExtra());

        System.out.println("Salário base: "+trabalhador.getSalario());
        System.out.println("Salário atual: "+trabalhador.getSalarioModificado());
    }
}
