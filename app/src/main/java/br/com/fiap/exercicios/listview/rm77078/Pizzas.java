package br.com.fiap.exercicios.listview.rm77078;

import java.io.Serializable;

/**
 * Created by logonrm on 30/03/2017.
 */

public class Pizzas implements Serializable{
    private String nome;
    private String descricao;
    private int imagem;
    private String valor;

    public Pizzas(String nome, String descricao, int imagem, String valor) {
        this.nome = nome;
        this.descricao = descricao;
        this.imagem = imagem;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getImagem() {
        return imagem;
    }

    public void setImagem(int imagem) {
        this.imagem = imagem;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
}
