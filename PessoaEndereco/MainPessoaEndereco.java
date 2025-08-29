public class MainPessoaEndereco {
    public static void main(String[] args) {
        Endereco end = new Endereco("Rua das Flores", "Belém");
        PessoaComEndereco pessoa = new PessoaComEndereco("Yasmim", end);
        pessoa.exibirDados();
    }
}