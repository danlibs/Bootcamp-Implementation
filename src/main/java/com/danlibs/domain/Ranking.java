package com.danlibs.domain;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Function;

public class Ranking {
    private Set<Dev> rankingDevs = new TreeSet<>(Comparator.comparing(Dev::calcularTotalXP).reversed());

    public void verRanking(Set<Dev> devs) {
        rankingDevs.addAll(devs);
        rankingDevs.forEach(nome -> System.out.println(nome.getNome() + " - " + nome.calcularTotalXP()));
    }
}
