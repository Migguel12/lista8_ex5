public class App {
    public static void main(String[] args) throws Exception {
        ContaCorrente conta = new ContaCorrente(11432,"Fabricio", 0);

        System.out.println(conta.mostrarSaldo());
        conta.deposito(1987);
        System.out.println(conta.mostrarSaldo());
        conta.saque(1768);
        System.out.println(conta.mostrarSaldo());
    }
}
