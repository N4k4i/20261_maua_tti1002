09.03

import java.util.Random;
public class JogoV2 {
    public static void main(String[] args) throws Exception{

        // Adicionar um segundo personagem
        // Dar um nome para ele 
        // Sortear separadamente oque ele tem que fazer
        // Exibir o seu estado ao final tbm
        // Desafio extra: fazer o personagem guloso, ou seja, ele tem maior probabilidade de comer 
        // 60% de chance de comer, 30% de caçar e 10% de dormir

        Random gerador = new Random();
        Personagem cacador = new Personagem();
        Personagem guloso = new Personagem();
        guloso.nome = "Guloso";
        guloso.fome = 8;
        guloso.energia = 6;
        cacador.nome = "Gabriel";
        //1: cacar
        //2: comer
        //3: dormir
        while(true){
            int oQueFazer = gerador.nextInt(1,4);
            switch(oQueFazer){
                case 1:
                    cacador.cacar();
                    break;
                case 2:
                    cacador.comer();
                    break;
                case 3:
                    cacador.dormir();
                    break;
            }
            int oQueFazer1 = gerador.nextInt(1,11);
            switch(oQueFazer1){
                case 1, 2, 3, 4, 5, 6:
                    guloso.comer();
                    break;
                case 7, 8, 9:
                    guloso.cacar();
                    break;
                default:
                    guloso.dormir();
            }
            System.out.println("=============================");
            cacador.exibirEstado();
            System.out.println("=============================");
            guloso.exibirEstado();
            System.out.println("=============================");
            Thread.sleep(5000);
        }
    }
}
