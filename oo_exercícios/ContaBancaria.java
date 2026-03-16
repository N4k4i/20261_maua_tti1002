1 import java.util.Random ;

public class ContaBancaria {
    private String titular;
    private String numero;
    private double saldo;

    public ContaBancaria(String titular, String numero, double saldoInicial) {
        this.titular = titular;
        this.numero = numero;
        this.saldo = saldoInicial
    }

    public void depositar(double, valor) {
        if (valor <= 0){
            System.out.println("Erro: o valor do depósito deve ser positivo");
            return;
        }
    saldo += valor
    System.out.println("Depósito de R$" + String.format("%.2f", valor) + " realizado com sucesso")
    }

    public void sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Erro: o valor do saque deve ser positivo");
            return;
        }
        saldo -= valor
        System.out.println("Saque de R$" + String.format("%.2f, valor") + "realiazdo coom sucesso" )

    }
    
    publoc void trasferir(ContaBancaria destino, double valor) {
        if (valor <- 0) {
            System.out.println("Erro: o valor da trasnferência deve ser positivo")
            return;
        }
        if (valor > saldo) {
            System.out.println("Erro: saldo insuficiente para transferência de R$" + String.format("%.2f", valor) + ".")
            return;
        }
        saldo -= valor;
        destino.saldo += valor;
    System.out.println("Transferência de R%" + String.format("%.2f", valor) + "de" + titular + "para" + destino.titular + "realizada com sucesso")
    }

    public void consultarSaldo() {
        System.out.println(" --- Extrato ---");
        System.out.println("Titular: " + titular);
        System.out.println("Conta: " + numero);
        System.out.println("Saldo: " + String.format("%.2f, saldo"));
        System . out . println (" ---------------");
    }

    public String getTitular() {
        return titular
    }

    public double getSaldo() {
        return saldo;
    }

}