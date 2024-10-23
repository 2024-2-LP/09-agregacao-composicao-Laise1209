package school.sptech;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Livro {
    private String titulo;
    private String autor;
    private LocalDate dataPublicacao;
    private List<Livro> livros;
    private List<Avaliacao> avaliacoes;

    public List<Avaliacao> getAvaliacoes() {
        return avaliacoes;
    }

    public void setAvaliacoes(List<Avaliacao> avaliacoes) {
        this.avaliacoes = avaliacoes;
    }

    public Livro(String titulo, String autor, LocalDate dataPublicacao, List<Livro> livros, List<Avaliacao> avaliacoes) {
        this.titulo = titulo;
        this.autor = autor;
        this.dataPublicacao = dataPublicacao;
        this.livros = livros;
        this.avaliacoes = avaliacoes;
    }

    public Livro() {}

    public void adicionarAvaliacao(String descricao, Double qtdEstrelas){
        if(descricao != null || !descricao.equals(" ")){
            if(qtdEstrelas <= 5 && qtdEstrelas >= 0){
                livros.add((Livro) avaliacoes);
            }
        }
    }

    public Double calcularMediaAvaliacoes(){
        Double media = 0.0;
        if(!livros.isEmpty()){
            for (int i = 0; i <= livros.size(); i++){
                media += avaliacoes.get(i).getQtdEstrelas();
            }
        }
        return media;
    }

    public List<Livro> getLivros() {
        return livros;
    }

    public void setLivros(List<Livro> livros) {
        this.livros = livros;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public LocalDate getDataPublicacao() {
        return dataPublicacao;
    }

    public void setDataPublicacao(LocalDate dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }
}
