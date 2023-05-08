package template;

public class CurriculoSurfista extends Curriculo {
    @Override
    protected void preencherNome() {
        System.out.println("Inserir: PrimeiroNome \"apelido\"");
    }

    @Override
    protected void incluirFoto() {
        System.out.println("Inserir foto na praia!");
    }

    @Override
    protected void preencherDados() {
        System.out.println("Preencher Experiência profissional");
        System.out.println("Criar espaço para Pratrocínios");
        System.out.println("Preencher Pratrocínios");
        System.out.println("Preencher Idiomas");
        System.out.println("Preencher Telefone");
        System.out.println("Preencher Whatsapp");
    }
}
