public class MainBiblioteca {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        Livro l1 = new Livro("Dom Casmurro", "Machado de Assis");
        Livro l2 = new Livro("O Pequeno Príncipe", "Antoine de Saint-Exupéry");

        biblioteca.adicionarLivro(l1);
        biblioteca.adicionarLivro(l2);

        biblioteca.listarLivros();
    }
}