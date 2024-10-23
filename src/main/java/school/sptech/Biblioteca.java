package school.sptech;

import java.util.List;

public class Biblioteca {
    private String nome;
    private List<Livro> livros;
    private List<Biblioteca> bibliotecas;

    public Biblioteca(String nome, List<Livro> livros, List<Biblioteca> bibliotecas) {
        this.nome = nome;
        this.livros = livros;
        this.bibliotecas = bibliotecas;
    }

    public Biblioteca() {}

    public void adicionarLivro(Livro livro){
        if(livros != null){
            for(int i = 0; i <= livros.size(); i++) {

            }
        }
    }

    public void removerLivroPorTitulo(String titulo){

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


}
