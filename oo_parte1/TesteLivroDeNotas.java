public class TesteLivroDeNotas{
    public static void main(String args []) {
        //x = 1
        //print(x) 
        LivroDeNotas livro1 = new LivroDeNotas();
        livro1.nomeDaDisciplina = "POO";
        livro1.exibirMensagem();
        LivroDeNotas livro2 = new LivroDeNotas ();
        livro2.nomeDaDisciplina = "Lógica";
        livro2.exibirMensagem();
        //fazer um livro para modelagem
    }
}

//para executar java TesteLivroDeNotas
//para criar as pastas azuis javac *.java
//new é um operador de construção de objeto
//compilador, para acionar o compilador javac, entao usamos javac *.java
//java aciona o compilador
//mexeu no codigo eh necessario ativar o compilador de novo!!!