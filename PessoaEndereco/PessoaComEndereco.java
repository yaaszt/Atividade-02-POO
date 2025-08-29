public class PessoaComEndereco {
    private String nome;
    private Endereco endereco;

    public PessoaComEndereco(String nome, Endereco endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Endereço: " + endereco.getRua() + ", " + endereco.getCidade());
    }
}