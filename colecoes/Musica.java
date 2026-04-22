public class Musica {
    private String titulo;
    private int avaliacao;

    public Musica(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    @Override  //pra que serve? não sei! É uma boa prática!
    public String toString() {
        return titulo;
    }
}