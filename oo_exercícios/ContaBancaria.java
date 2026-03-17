public class ContaBancaria {

    // Os "dados" de cada conta — como etiquetas coladas na caixinha
    String titular;
    String numero;
    double saldo;

    // Construtor: é o momento de CRIAR a caixinha com os dados iniciais
    public ContaBancaria(String titular, String numero, double saldoInicial) {
        this.titular = titular;
        this.numero = numero;
        this.saldo = saldoInicial;
    }

    // DEPOSITAR: coloca dinheiro na caixinha
    public void depositar(double valor) {
        if (valor <= 0) {
            System.out.println("Erro: o valor do depósito deve ser positivo.");
            return;
        }
        saldo += valor;
        System.out.println("Depósito de R$ " + String.format("%.2f", valor) + " realizado com sucesso.");
    }

    // SACAR: tira dinheiro da caixinha
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

    // TRANSFERIR: tira da sua caixinha e coloca na caixinha do outro
    public void transferir(ContaBancaria destino, double valor) {
        System.out.println("Transferência de R$ " + String.format("%.2f", valor)
                + " de " + this.titular + " para " + destino.titular);
        this.sacar(valor);         // tira daqui...
        destino.depositar(valor);  // ...coloca lá
    }

    // CONSULTAR SALDO: mostra as infos básicas
    public void consultarSaldo() {
        System.out.println("Conta: " + numero + " | Titular: " + titular
                + " | Saldo: R$ " + String.format("%.2f", saldo));
    }

    // EXTRATO: mostra um resuminho bonitinho
    public void exibirExtrato() {
        System.out.println("--- Extrato ---");
        System.out.println("Titular : " + titular);
        System.out.println("Conta   : " + numero);
        System.out.println("Saldo   : R$ " + String.format("%.2f", saldo));
        System.out.println("---------------");
    }
}