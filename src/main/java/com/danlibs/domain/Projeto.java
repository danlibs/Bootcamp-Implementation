package com.danlibs.domain;

public class Projeto extends Conteudo {
    private enum niveisDeDificuldade {BASICO, INTERMEDIARIO, AVANCADO}
    private final niveisDeDificuldade complexidade;

    public Projeto(String titulo, String descricao, String complexidade) {
        this.setTitulo(titulo);
        this.setDescricao(descricao);
        this.complexidade = niveisDeDificuldade.valueOf(complexidade);
    }

    @Override
    public double calcularXP() {
        return switch (complexidade) {
            case BASICO -> XP_PADRAO * 3;
            case INTERMEDIARIO -> XP_PADRAO * 5;
            case AVANCADO -> XP_PADRAO * 6;
        };
    }

    @Override
    public String toString() {
        return "Projeto{" +
                "titulo='" + this.getTitulo() + '\'' +
                ", descricao='" + this.getDescricao() + '\'' +
                ", complexidade=" + complexidade +
                '}';
    }
}
