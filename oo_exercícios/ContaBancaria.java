public class ContaBancaria {
    private String titular;
    private String numero;
    private double saldo;

    public ContaBancaria(String titular, String numero, double saldo) {
        this.titular = titular;
        this.numero = numero;
        setSaldo(saldo);
    }

    public void setSaldo(double saldo) {
        if (saldo >= 0) 
            this.saldo = saldo;
    }

    public void getTitular() {
        return titular;
    }

    public ContaBancaria(String titular, String numero, double saldoInicial) {
        this.titular = titular;
        this.numero = numero;
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        if (valor <= 0) {
            System.out.println("Erro: o valor do depósito deve ser positivo.");
            return;
        }
        saldo += valor;
        System.out.println("Depósito de R$ " + String.format("%.2f", valor) + " realizado com sucesso.");
    }

    public void sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Erro: o valor do saque deve ser positivo.");
            return;
        }
        if (valor > saldo) {
            System.out.println("Erro: saldo insuficiente para sacar R$ " + String.format("%.2f", valor));
            return;
        }
        saldo -= valor;
        System.out.println("Saque de R$ " + String.format("%.2f", valor) + " realizado com sucesso.");
    }

    public void transferir(ContaBancaria destino, double valor) {
        System.out.println("Transferência de R$ " + String.format("%.2f", valor)
                + " de " + this.titular + " para " + destino.titular);
        this.sacar(valor);         
        destino.depositar(valor);  
    }

    public void consultarSaldo() {
        System.out.println("Conta: " + numero + " | Titular: " + titular
                + " | Saldo: R$ " + String.format("%.2f", saldo));
    }

    public void exibirExtrato() {
        System.out.println("--- Extrato ---");
        System.out.println("Titular : " + titular);
        System.out.println("Conta   : " + numero);
        System.out.println("Saldo   : R$ " + String.format("%.2f", saldo));
        System.out.println("---------------");
    }
}