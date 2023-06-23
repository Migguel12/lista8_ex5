public class ContaCorrente {
    int numeroConta;
    String nomeCorrentista;
    double saldo = 0.0;

    public ContaCorrente(int numeroConta, String nomeCorrentista, double saldo){
        this.nomeCorrentista = nomeCorrentista;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public void alterarNome(String novoNome){
        nomeCorrentista = novoNome;
    }

    public void deposito(double valorDeposito){
        saldo = saldo + valorDeposito;
    }

    public void saque(double valorSaque){
        saldo = saldo - valorSaque;
    }

    public double mostrarSaldo(){
        return saldo;
    }
}
