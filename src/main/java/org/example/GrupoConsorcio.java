package org.example;

public class GrupoConsorcio implements Cloneable {

    private String codigoGrupo;
    private int prazoMeses;

    public GrupoConsorcio(String codigoGrupo, int prazoMeses) {
        this.codigoGrupo = codigoGrupo;
        this.prazoMeses = prazoMeses;
    }

    public String getCodigoGrupo() { return codigoGrupo; }
    public void setCodigoGrupo(String codigoGrupo) { this.codigoGrupo = codigoGrupo; }

    public int getPrazoMeses() { return prazoMeses; }
    public void setPrazoMeses(int prazoMeses) { this.prazoMeses = prazoMeses; }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Grupo{codigo='" + codigoGrupo + "', prazo=" + prazoMeses + "}";
    }
}
