public class TesteConta {
    public static void main(String[] args) throws InterruptedException {
        ContaBancaria conta1 = new ContaBancaria("Ana", "1001", 1000.00);
        ContaBancaria conta2 = new ContaBancaria("Bruno", "1002", 1000.00);

        Random random = new Random();
        String [] operacoes = {"DEPÓSITO", "SAQUE", "TRANSFERÊNCIA"};

        while (true) {
            ContaBancaria conta ativa;
            ContaBancaria outra conta;
        }
        
        if (random..nextInt(2) == 0) {
            contaAtiva = conta1
            outraConta = conta2
        }
        else {
            contaAtiva = conta2
            outraConta = conta1
        }

        String operacao = Operacoes[random.nextInt(operacoes.length)];
        double valor = random . nextDouble () * 499.00 + 1.00;
        valor = Math . round ( valor * 100.0) / 100.0;
        System . out . println ("\n=== Operacao : " + operacao + " na conta de " + contaAtiva . getTitular () + "===") ;

        switch(operacao) {
            case "DEPÓSITO":
                contaAtiva.depositar(valor);
                break;
            case "SAQUE":
                contaAtiva.sacar(valor)
                break;
            case "TRANSFERÊNCIA":
                contaAtiva.transferir(outraConta, valor);
                break;
        }
        
        System.out.print
        
    }
}