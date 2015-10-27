package br.edu.fasb.leritorcodigopatrimonio.bean;

/**
 * Created by Andre on 25/08/2015.
 */

public class Objeto {
    private String etiqueta;
    private Localizacao localizacao;
    private Estado estado;

    public Objeto(String etiqueta, Localizacao localizacao, Estado estado) {
        this.setEtiqueta(etiqueta);
        this.setLocalizacao(localizacao);
        this.setEstado(estado);
    }

    public String getEtiqueta() {
        return etiqueta;
    }

    public void setEtiqueta(String etiqueta) {
        this.etiqueta = etiqueta;
    }

    public Localizacao getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(Localizacao localizacao) {
        this.localizacao = localizacao;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
}
