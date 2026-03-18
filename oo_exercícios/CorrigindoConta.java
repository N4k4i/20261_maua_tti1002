public classs ContaBancaria {
    String nome;
    private String titular:
    private String numero;
    private int saldo;

    public void depositar(double valor) {
        if (valor <= 0) {
            System.out.println("Erro: Valor de depósito deve ser positivo");
        }
        else {
            //saldo = saldo + valor
            saldo += valor;
            System.out.println("Depósito de RS%.2f realizado com sucesso\n", valor);
        }
    }

    public void sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Erro: Valor de saque deve ser positivo");
        }
        else if (valor > saldo) {
            System.out.println("Erro: saldo insuficiente para sacar R$" + String.format("%.2f, valor"));
        }
        else {
            saldo -= valor;
            System.out.println("Saque de R$%.2f realizado com sucesso.\n", valor)
        }
    }

    //Consultar o arquivo de CorrigindoTeste.java
    //ContaBancaria destino = conta1 e double valor = 500
    public void transferir(ContaBancaria destino, double valor) {
        if(valor <= 0) {
            System.out.println("Erro: Valor de transferência deve ser positivo");
        }
        else if(valor > saldo) {
            System.out.println("Saldo insuficiente para transferrir R$%.2f\n", valor);
        }
        else {
            saldo -= valor;
            destino.saldo += valor;
            System.out.println("Valor de R$%.2f transferido de %s para %s", valor, titular, destino.titular);
        }
    }

    public void consultarSaldo() {
        System.out.println("Conta %s | Titular: %s | Saldo: %.2f \n", numero, titular, saldo);
    }


}