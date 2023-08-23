package br.com.alura.screenmatch.model;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;

public class Episodio {
    private Integer temporada;
    private String titulo;
    private Integer numeroEpisodio;
    private Double avalicao;
    private LocalDate dataLancamento;

    public Episodio(Integer numeroTemporada, DadosEpisodios dadosEpisodios){
        this.temporada = numeroTemporada;
        this.titulo = dadosEpisodios.titulo();
        this.numeroEpisodio = dadosEpisodios.numero();
        try {
            this.avalicao = Double.valueOf(dadosEpisodios.avaliacao());
        }catch (NumberFormatException ex){
            this.avalicao = 0.0;
        }
        try{
            this.dataLancamento = LocalDate.parse(dadosEpisodios.dataLancamento());
        }catch (DateTimeParseException ex){
            this.dataLancamento = null;
        }

    }

    public Integer getTemporada() {
        return temporada;
    }

    public void setTemporada(Integer temporada) {
        this.temporada = temporada;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getNumeroEpisodio() {
        return numeroEpisodio;
    }

    public void setNumeroEpisodio(Integer numeroEpisodio) {
        this.numeroEpisodio = numeroEpisodio;
    }

    public Double getAvalicao() {
        return avalicao;
    }

    public void setAvalicao(Double avalicao) {
        this.avalicao = avalicao;
    }

    public LocalDate getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(LocalDate dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    @Override
    public String toString() {
        return  "temporada=" + temporada +
                ", titulo='" + titulo + '\'' +
                ", numeroEpisodio=" + numeroEpisodio +
                ", avalicao=" + avalicao +
                ", dataLancamento=" + dataLancamento;
    }
}
