public class Personagem {
    String habilidade;
    String nome;
    int energia = 10;
    int fome = 0;
    int sono = 0;
    //variaveis de estado 
    //métodos tem 4 partes, tipos de retorno(void), nomes(cacar), lista de parametros() e corpo{}
    
    void cacar() {
        // if energia >=2 :
        if (energia >= 2) {
            System.out.println(nome + " caçando...");
            energia = energia - 2;
        }
        else{
            System.out.printf("%s sem energia para caçar\n",  nome);
        }
        if (fome < 10)
            fome = fome + 1;
            sono = Math.min(sono + 1, 10);
    }


    void comer() {
        //John comendo
        System.out.printf("%s comendo\n", nome);
    }
    void dormir() {
        System.out.print(nome + " dormindo\n");
    }
}

//somente classes publicas podem ter o metodo main