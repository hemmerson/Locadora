package org.hemmersonrosa.modelos;

import jakarta.xml.bind.annotation.*;

import java.util.List;

public class Filme extends Video{

    private Integer duracao;

    @XmlElementWrapper(name = "elenco")
    @XmlElement(name = "pessoa")
    private List<Pessoa> elenco;

    public Filme() {
    }

    public Filme(String titulo, String genero, Integer anoDeLancamento, String diretor, Integer duracao, List<Pessoa> elenco) {
        super(titulo, genero, anoDeLancamento, diretor);
        this.duracao = duracao;
        this.elenco = elenco;
    }

    public Integer getDuracao() {
        return duracao;
    }

    public void setDuracao(Integer duracao) {
        this.duracao = duracao;
    }

    public List<Pessoa> getElenco() {
        return elenco;
    }

    public void setElenco(List<Pessoa> elenco) {
        this.elenco = elenco;
    }
}
