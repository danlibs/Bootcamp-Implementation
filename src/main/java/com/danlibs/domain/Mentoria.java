package com.danlibs.domain;

import java.time.LocalDate;

public class Mentoria extends Conteudo {
    private LocalDate data;

    public Mentoria(String nome, String descricao, LocalDate data) {
        this.setTitulo(nome);
        this.setDescricao(descricao);
        this.data = data;
    }

    @Override
    public double calcularXP() {
        return XP_PADRAO + 20d;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo=" + this.getTitulo() +
                ", descricao=" + this.getDescricao() +
                ", data=" + data +
                '}';
    }
}
