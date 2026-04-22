import java.util.*;
import javax.swing.JOptionPane;
public class Playlist {
    public static void main(String[] args) {
        //python musicas = []
        List <Musica> = new ArrayList<Musica>();
        String menu = "1-Cadastrar música\n2-Listar música\n3-Avaliar música\0-Sair";
        int op;
        do{
            op = Integer.parseInt(JOptionPane.showInputDialog(menu));
            switch(op) {
                case 1:
                    String titulo = JOptionPane.showInputDialog("Título?");
                    Musica musicaAdicionar = new Musica(titulo);
                    musicas.add(musicaAdicionar);
                    JOptionPane.showMessageDialog(null, "Música cadastrada!")
                    break;
                case 2:
                    //for/each ou enchanced for
                    String textoFinal = "";
                    for(Musica m : musicas) {
                        textoFinal = textoFinal + m.titulo + "";
                    }
                    JOptionPane.showMessageDialog(null, textoFinal);
                    break;
                case 3:
                    //pegar o nome de uma musica
                    //pegar uma nota pra ela
                    //atribuir essa nota à música encontrada na coleçãonoffwoom
            }
        }while(op != 0);
    }
}