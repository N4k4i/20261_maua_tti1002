import java.util.Random;

public class TesteConta {

    public static void main(String[] args) throws InterruptedException {

        // Criando as duas contas com saldo inicial de 1000
        ContaBancaria conta1 = new ContaBancaria("Ana", "1001", 1000.00);
        ContaBancaria conta2 = new ContaBancaria("Bruno", "1002", 1000.00);

        Random random = new Random(); // nosso "dado" para sortear as coisas

        // Loop infinito — fica rodando para sempre até fechar o programa
        while (true) {

            // Sorteia qual conta vai ser usada (0 = Ana, 1 = Bruno)
            int qualConta = random.nextInt(2);
            ContaBancaria contaAtiva  = (qualConta == 0) ? conta1 : conta2;
            ContaBancaria contaOutra  = (qualConta == 0) ? conta2 : conta1;

            // Sorteia a operação (0 = depósito, 1 = saque, 2 = transferência)
            int operacao = random.nextInt(3);

            // Sorteia um valor entre 1.00 e 500.00
            double valor = random.nextDouble() * (500.00 - 1.00) + 1.00;

            // Descobre o nome da operação para mostrar na tela
            String nomeOperacao = "";
            if (operacao == 0) nomeOperacao = "DEPÓSITO";
            else if (operacao == 1) nomeOperacao = "SAQUE";
            else nomeOperacao = "TRANSFERÊNCIA";

            System.out.println("\n=== Operação: " + nomeOperacao + " na conta de " + contaAtiva.titular + " ===");

            // Executa a operação sorteada
            if (operacao == 0) {
                contaAtiva.depositar(valor);
            } else if (operacao == 1) {
                contaAtiva.sacar(valor);
            } else {
                contaAtiva.transferir(contaOutra, valor);
            }

            // Mostra o extrato das duas contas
            conta1.exibirExtrato();
            conta2.exibirExtrato();

            // Pausa de 1 segundo antes da próxima rodada
            Thread.sleep(1000);
        }
    }
}