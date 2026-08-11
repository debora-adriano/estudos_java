public class Conta {
    public double saldo;

    public Conta() {
    }

    public Conta(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void exibirSaldo(){
        System.out.printf("Saldo atual: R$ %.2f%n", this.saldo);
    }

    public void zerarSaldo(){
        this.saldo = 0.0;
    }
}
