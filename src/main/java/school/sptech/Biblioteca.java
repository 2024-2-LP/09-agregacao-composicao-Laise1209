package school.sptech;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private String nome;
    private List<Livro> livros = new ArrayList<>();

    public Biblioteca(String nome) {
        this.nome = nome;
        this.livros = new ArrayList<>();
    }

    public Biblioteca() {}

    public void adicionarLivro(Livro livro){
        if(livro != null){
            if (livro.getTitulo() != null && !livro.getTitulo().isBlank()){
                if (livro.getAutor() != null && !livro.getAutor().isBlank()){
                    if(livro.getDataPublicacao() != null){
                        livros.add(livro);
                    }
                }
            }
        }
    }

    public void removerLivroPorTitulo(String titulo){
        for(int i = 0; i < livros.size(); i++){
            if(livros.get(i).getTitulo().equalsIgnoreCase(titulo)) {
                livros.remove(i);
            }
        }
    }

    public Livro buscarLivroPorTitulo(String titulo){
        if(titulo != null && !titulo.isBlank()){
            for(Livro livroDaVez : livros){
                if(livroDaVez.getTitulo().equalsIgnoreCase(titulo)){
                    return livroDaVez;
                }
            }
        }
        return null;
    }

    public Integer contarLivros(){
        return livros.size();
    }

    public List<Livro> obterLivrosAteAno(Integer ano){
        List<Livro> livrosPublicados = new ArrayList<>();
        for(Livro livroDaVez : livros){
            if(livroDaVez.getDataPublicacao().getYear() <= ano){
                livrosPublicados.add(livroDaVez);
            }
        }
        return livrosPublicados;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Biblioteca{" +
                "nome='" + nome + '\'' +
                ", livros=" + livros +
                '}';
    }
}


