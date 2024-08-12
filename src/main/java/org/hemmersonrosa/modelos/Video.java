package org.hemmersonrosa.modelos;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSeeAlso;

import java.time.LocalDate;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlSeeAlso({ Filme.class, Serie.class })
public class Video {

    private String titulo;
    private String genero;
    private Integer anoDeLancamento;
    private String diretor;
    private final LocalDate dataDeCriacao = LocalDate.now();

    public Video() {
    }

    public Video(String titulo, String genero, Integer anoDeLancamento, String diretor) {
        this.titulo = titulo;
        this.genero = genero;
        this.anoDeLancamento = anoDeLancamento;
        this.diretor = diretor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Integer getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public void setAnoDeLancamento(Integer anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public LocalDate getDataDeCriacao() {
        return dataDeCriacao;
    }
}
