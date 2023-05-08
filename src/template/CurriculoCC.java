package template;

public class CurriculoCC extends Curriculo {

    @Override
    protected void preencherNome() {
        System.out.println("Inserir nome completo!");
    }

    @Override
    protected void incluirFoto() {
        System.out.println("Incluir foto profissional!");
    }

    @Override
    protected void preencherDados() {
        System.out.println("Preencher Escolaridade");
        System.out.println("Preencher Experiência profissional");
        System.out.println("Criando espaço para GitHub");
        System.out.println("Preencher GitHub");
        System.out.println("Preencher Idiomas");
        System.out.println("Preencher Telefone");
        System.out.println("Preencher Whatsapp");
    }
    
}
