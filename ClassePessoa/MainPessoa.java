public class MainPessoa {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Yasmim", 22);
        Pessoa p2 = new Pessoa("Lucas", 25);

        System.out.println("Pessoa 1: " + p1.nome + ", " + p1.idade + " anos");
        System.out.println("Pessoa 2: " + p2.nome + ", " + p2.idade + " anos");
    }
}