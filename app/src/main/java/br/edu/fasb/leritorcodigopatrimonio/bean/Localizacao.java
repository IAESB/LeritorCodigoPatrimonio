package br.edu.fasb.leritorcodigopatrimonio.bean;

import java.io.Serializable;
import java.util.Vector;

/**
 * Created by Andre on 25/08/2015.
 */
public class Localizacao implements Serializable {
    int id;
    int pai;
    String nome;
    Vector<Localizacao> filhos;
    Vector<Objeto> objetos;

    public Localizacao(int id, int pai, String nome, Vector<Localizacao> filhos) {
        this.id = id;
        this.pai = pai;
        this.nome = nome;
        this.filhos = filhos;
        this.objetos = new Vector<>();
    }

    public Vector<Objeto> getObjetos() {
        return objetos;
    }

    public void setObjetos(Vector<Objeto> objetos) {
        this.objetos = objetos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPai() {
        return pai;
    }

    public void setPai(int pai) {
        this.pai = pai;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Vector<Localizacao> getFilhos() {
        return filhos;
    }

    public void setFilhos(Vector<Localizacao> filhos) {
        this.filhos = filhos;
    }
}
