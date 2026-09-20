package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParametrosLojaTest {

    @Test
    public void deveRetornarNomeLoja(){
        ParametrosLoja.getInstance().setNomeLoja("Loja 1");
        assertEquals("Loja 1", ParametrosLoja.getInstance().getNomeLoja());
    }

    @Test
    public void deveRetornarMoedaPadrao(){
        ParametrosLoja.getInstance().setMoedaPadrao("Real");
        assertEquals("Real", ParametrosLoja.getInstance().getMoedaPadrao());
    }


}