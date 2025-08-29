public class AppContaDigital {
    public static void main(String[] args) {
        ContaDigital minhaConta = new ContaDigital(800.0);

        minhaConta.depositar(200.0);
        minhaConta.sacar(150.0);
        minhaConta.sacar(1000.0); // teste de erro

        System.out.println("Saldo atual: R$" + minhaConta.consultarSaldo());
    }
}