public class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public double calcularDesconto(double percentual) {
        return preco - (preco * percentual / 100);
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }
}