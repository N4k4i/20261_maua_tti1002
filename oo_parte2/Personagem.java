public class Personagem {
    String nome;
    int energia;
    int fome;
    int sono;
    //variaveis de estado 
    //métodos tem 4 partes, tipos de retorno(void), nomes(cacar), lista de parametros() e corpo{}
    void cacar() {
        System.out.println(nome + "caçando...");
    }
    void comer() {
        //John comendo
        System.out.printf("%s comendo\n", nome);
    }
    void dormir() {
        System.out.print("nome + dormindo\n");
    }
}

//somente classes publicas podem ter o metodo main