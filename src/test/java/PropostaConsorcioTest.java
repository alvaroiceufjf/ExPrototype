package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PropostaConsorcioTest {

    @Test
    void deveClonarPropostaComCopiaProfunda() throws CloneNotSupportedException {
        PropostaConsorcio propostaOriginal = new PropostaConsorcio(
                "Modelo Padrão", 50000.0, new GrupoConsorcio("AUTO-01", 60));

        PropostaConsorcio propostaClone = propostaOriginal.clone();
        propostaClone.setNomeAssociado("Carlos Silva");
        propostaClone.setValorCarta(60000.0);
        propostaClone.getGrupo().setCodigoGrupo("AUTO-02");

        assertEquals("Proposta{associado='Modelo Padrão', valor=50000.0, grupo=Grupo{codigo='AUTO-01', prazo=60}}",
                propostaOriginal.toString());
        assertEquals("Proposta{associado='Carlos Silva', valor=60000.0, grupo=Grupo{codigo='AUTO-02', prazo=60}}",
                propostaClone.toString());
    }
}