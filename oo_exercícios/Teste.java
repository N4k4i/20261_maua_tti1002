import java.util.random.*;


public class Teste {
    public static void main(String [] args) {
        Random gerador = new Random;
        ContaBancaria conta1 = new ContaBancaria("Ana", "123456", 1000);
        ContaBancaria conta2 = new ContaBancaria("João", "555555", 1000);
        //da conta1 transfere 500 reais para conta2
        conta1.transferir(conta2, 500);
        int qualConta = gerador.nextInt(1, 3);
        int qualOPeracao = gerador.nextInt(1, 4);
        double qualValor = gerador.nextDouble(1, 500);
        while(true) {
            switch(qualConta) {
                case 1:
                    if(qualOperacao == 1) {
                        System.out.printf("=== Operação: DEPÓSITO na conta de %s ===\n", conta1.getTitular());
                        conta1.depositar(qualValor);
                    }
                    else if(qualOPeracao == 2) {
                        System.out.printf("=== Operação: SAQUE na conta de %s ===\n", conta1.getTitular());
                        conta1.sacar(queValor);
                    }
                    else{
                        System.out.printf("=== Operação: TRANSFERÊNCIA fe %s para %s ===\n", conta1.getTitular(), conta2.getTitular());
                    }
                    break;
                case 2:
                    break;
                case 3:
                    break;
            

            }
        
        }
}