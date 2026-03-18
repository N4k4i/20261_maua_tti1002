public class Teste {
    public static void main(String [] args) {
        ContaBancaria conta1 = new ContaBancaria();
        ContaBancaria conta2 = new ContaBancaria();
        //da conta1 transfere 500 reais para conta2
        conta1.transferir(conta2, 500)
    }
}