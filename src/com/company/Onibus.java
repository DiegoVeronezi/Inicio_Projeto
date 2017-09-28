package com.company;

public class Onibus {

    private String linha;
    private String[] horarios;

    public Onibus(String linha) {
        this.linha = linha;

    }

    public String getLinha() {
        return linha;
    }

    public void setLinha(String linha) {
        this.linha = linha;
    }

    public String[] getHorarios() {
        return horarios;
    }

    public void setHorarios(String[] horarios) {
        this.horarios = horarios;
    }
}

