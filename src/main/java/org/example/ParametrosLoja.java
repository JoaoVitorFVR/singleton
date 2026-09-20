package org.example;

public class ParametrosLoja {

    private ParametrosLoja() {};
    private static ParametrosLoja instance = new ParametrosLoja();
    public static ParametrosLoja getInstance() {
        return instance;
    }

    private String nomeLoja;
    private String moedaPadrao;

    public String getNomeLoja() {
        return nomeLoja;
    }

    public void setNomeLoja(String nomeLoja) {
        this.nomeLoja = nomeLoja;
    }

    public String getMoedaPadrao() {
        return moedaPadrao;
    }

    public void setMoedaPadrao(String moedaPadrao) {
        this.moedaPadrao = moedaPadrao;
    }
}
