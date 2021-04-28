package com.example.Prova.model;

public class Sessao {
    private int numSala;
    private String horario;
    private String filme;
    private Filme idFilme;

    public Sessao(){}

    public Sessao(int numSala, String horario, String filme, Filme idFilme) {
        this.numSala = numSala;
        this.horario = horario;
        this.filme = filme;
        this.idFilme = idFilme;
    }

    public int getNumSala() {
        return numSala;
    }

    public void setNumSala(int numSala) {
        this.numSala = numSala;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getFilme() {
        return filme;
    }

    public void setFilme(String filme) {
        this.filme = filme;
    }

    public Filme getIdFilme() {
        return idFilme;
    }

    public void setIdFilme(Filme idFilme) {
        this.idFilme = idFilme;
    }

    @Override
    public String toString() {
        return "Sessao{" +
                "numSala=" + numSala +
                ", horario='" + horario + '\'' +
                ", filme='" + filme + '\'' +
                ", idFilme=" + idFilme +
                '}';
    }
}

