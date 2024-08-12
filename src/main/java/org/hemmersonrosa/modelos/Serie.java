package org.hemmersonrosa.modelos;

import java.util.List;

public class Serie extends Video{

    private Integer numeroDeTemporadas;
    private Integer numeroDeEpisodios;
    private List<String> elenco;

    public Serie() {
    }

    public Serie(String titulo, String genero, Integer anoDeLancamento, String diretor, Integer numeroDeTemporadas, Integer numeroDeEpisodios, List<String> elenco) {
        super(titulo, genero, anoDeLancamento, diretor);
        this.numeroDeTemporadas = numeroDeTemporadas;
        this.numeroDeEpisodios = numeroDeEpisodios;
        this.elenco = elenco;
    }

    public Integer getNumeroDeTemporadas() {
        return numeroDeTemporadas;
    }

    public void setNumeroDeTemporadas(Integer numeroDeTemporadas) {
        this.numeroDeTemporadas = numeroDeTemporadas;
    }

    public Integer getNumeroDeEpisodios() {
        return numeroDeEpisodios;
    }

    public void setNumeroDeEpisodios(Integer numeroDeEpisodios) {
        this.numeroDeEpisodios = numeroDeEpisodios;
    }

    public List<String> getElenco() {
        return elenco;
    }

    public void setElenco(List<String> elenco) {
        this.elenco = elenco;
    }
}
