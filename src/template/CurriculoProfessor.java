package template;

public class CurriculoProfessor extends Curriculo {
    @Override
    protected void preencherNome() {
        System.out.println("Inserir nome completo!");
    }

    @Override
    protected void incluirFoto() {
        System.out.println("Não tem foto!");
    }

    @Override
    protected void preencherDados() {
        System.out.println("Preencher Escolaridade");
        System.out.println("Preencher Experiência profissional");
        System.out.println("Preencher Idiomas");
        System.out.println("Criando espaço para Lattes");
        System.out.println("Preencher Lattes");
        System.out.println("Preencher Telefone");
        System.out.println("Preencher Whatsapp");
    }
}
