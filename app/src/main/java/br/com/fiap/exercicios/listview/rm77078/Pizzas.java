package br.com.fiap.exercicios.listview.rm77078;

import java.io.Serializable;

/**
 * Created by logonrm on 30/03/2017.
 */

public class Pizzas implements Serializable{
    private String nomePizza;
    private String descPizza;
    private int imgPizza;
    private String valorPizza;

    public Pizzas(String nomePizza, String descPizza, int imgPizza, String valorPizza) {
        this.nomePizza = nomePizza;
        this.descPizza = descPizza;
        this.imgPizza = imgPizza;
        this.valorPizza = valorPizza;
    }

    public String getNomePizza() {
        return nomePizza;
    }

    public void setNomePizza(String nomePizza) {
        this.nomePizza = nomePizza;
    }

    public String getDescPizza() {
        return descPizza;
    }

    public void setDescPizza(String descPizza) {
        this.descPizza = descPizza;
    }

    public int getImgPizza() {
        return imgPizza;
    }

    public void setImgPizza(int imgPizza) {
        this.imgPizza = imgPizza;
    }

    public String getValorPizza() {
        return valorPizza;
    }

    public void setValorPizza(String valorPizza) {
        this.valorPizza = valorPizza;
    }
}
