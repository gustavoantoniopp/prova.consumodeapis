package com.example.Prova.model;

public class Filme {
    private int sala;
    private String titulo;
    private String genero;
    private String duracao;
    private String linguagem;
    private Boolean legenda;

    public Filme(){};

    public Filme(int sala, String titulo, String genero, String duracao, String linguagem, Boolean legenda) {
        this.sala = sala;
        this.titulo = titulo;
        this.genero = genero;
        this.genero = duracao;
        this.linguagem = linguagem;
        this.legenda = legenda;
    }

    public int getSala() {
        return sala;
    }

    public void setSala(int sala) {
        this.sala = sala;
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

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public String getLinguagem() {
        return linguagem;
    }

    public void setLinguagem(String linguagem) {
        this.linguagem = linguagem;
    }

    public Boolean getLegenda() {
        return legenda;
    }

    public void setLegenda(Boolean legenda) {
        this.legenda = legenda;
    }

    @Override
    public String toString() {
        return "Filme{" +
                "sala=" + sala +
                ", titulo='" + titulo + '\'' +
                ", genero='" + genero + '\'' +
                ", duracao='" + duracao + '\'' +
                ", linguagem='" + linguagem + '\'' +
                ", legenda=" + legenda +
                '}';
    }
}
