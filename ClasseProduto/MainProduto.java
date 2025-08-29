public class MainProduto {
    public static void main(String[] args) {
        Produto produto = new Produto("Perfume", 120.0);
        double precoComDesconto = produto.calcularDesconto(15);

        System.out.println("Produto: " + produto.getNome());
        System.out.println("Preço original: R$" + produto.getPreco());
        System.out.println("Preço com desconto: R$" + precoComDesconto);
    }
}