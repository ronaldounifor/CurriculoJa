package template;

public abstract class Curriculo {

    public void gerar() {
        criarCabecalho();
        preencherNome();
        incluirFoto();
        criarCorpo();
        criarRodape();
        preencherDados();
    }

    private void criarCabecalho() {
        System.out.println("Criando espaço para Nome");
        System.out.println("Criando espaço para Sobrenome");
        System.out.println("Criando espaço para Foto");
    }

    private void criarCorpo() {
        System.out.println("Criando espaço para Escolaridade");
        System.out.println("Criando espaço para Experiência profissional");
        System.out.println("Criando espaço para Idiomas");
    }

    private void criarRodape() {
        System.out.println("Criando espaço para Telefone");
        System.out.println("Criando espaço para Whatsapp");
    }

    protected abstract void preencherNome();
    protected abstract void incluirFoto();
    protected abstract void preencherDados();
}