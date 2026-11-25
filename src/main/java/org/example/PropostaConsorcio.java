package org.example;

public class PropostaConsorcio implements Cloneable {

    private String nomeAssociado;
    private double valorCarta;
    private GrupoConsorcio grupo;

    public PropostaConsorcio(String nomeAssociado, double valorCarta, GrupoConsorcio grupo) {
        this.nomeAssociado = nomeAssociado;
        this.valorCarta = valorCarta;
        this.grupo = grupo;
    }

    public String getNomeAssociado() { return nomeAssociado; }
    public void setNomeAssociado(String nomeAssociado) { this.nomeAssociado = nomeAssociado; }

    public double getValorCarta() { return valorCarta; }
    public void setValorCarta(double valorCarta) { this.valorCarta = valorCarta; }

    public GrupoConsorcio getGrupo() { return grupo; }
    public void setGrupo(GrupoConsorcio grupo) { this.grupo = grupo; }

    @Override
    public PropostaConsorcio clone() throws CloneNotSupportedException {
        PropostaConsorcio propostaClone = (PropostaConsorcio) super.clone();
        propostaClone.grupo = (GrupoConsorcio) propostaClone.grupo.clone();
        return propostaClone;
    }

    @Override
    public String toString() {
        return "Proposta{associado='" + nomeAssociado + "', valor=" + valorCarta + ", grupo=" + grupo + "}";
    }
}
