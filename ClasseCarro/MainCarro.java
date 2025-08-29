public class MainCarro {
    public static void main(String[] args) {
        Carro carro = new Carro("Fiat Argo", 2022);
        System.out.println("Modelo: " + carro.getModelo());
        System.out.println("Ano: " + carro.getAno());
    }
}