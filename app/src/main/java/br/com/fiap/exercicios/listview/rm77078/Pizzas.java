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
    private int pontuacaoPizza;
    private String ingredientesPizza;

    public Pizzas(String nomePizza, String descPizza, int imgPizza, String valorPizza, int pontuacaoPizza, String ingredientesPizza) {
        this.nomePizza = nomePizza;
        this.descPizza = descPizza;
        this.imgPizza = imgPizza;
        this.valorPizza = valorPizza;
        this.pontuacaoPizza = pontuacaoPizza;
        this.ingredientesPizza = ingredientesPizza;
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

    public int getPontuacaoPizza() {
        return pontuacaoPizza;
    }

    public void setPontuacaoPizza(int pontuacaoPizza) {
        this.pontuacaoPizza = pontuacaoPizza;
    }

    public String getIngredientesPizza() {
        return ingredientesPizza;
    }

    public void setIngredientesPizza(String ingredientesPizza) {
        this.ingredientesPizza = ingredientesPizza;
    }
}
