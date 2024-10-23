package school.sptech;

import java.util.List;

public class Avaliacao {
    private String descricao;
    private Double qtdEstrelas;

    public Avaliacao(String descricao, Double qtdEstrelas) {
        this.descricao = descricao;
        this.qtdEstrelas = qtdEstrelas;
    }

    public Avaliacao() {}

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getQtdEstrelas() {
        return qtdEstrelas;
    }

    public void setQtdEstrelas(Double qtdEstrelas) {
        this.qtdEstrelas = qtdEstrelas;
    }
}
