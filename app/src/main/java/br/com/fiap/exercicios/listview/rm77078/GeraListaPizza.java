package br.com.fiap.exercicios.listview.rm77078;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by logonrm on 30/03/2017.
 */

public class GeraListaPizza {
    public static List<Pizzas> geraPizzas(){
        List<Pizzas> pizzas = new ArrayList<>();

        pizzas.add(new Pizzas("Pizza de Mussarela","Ingredientes", R.drawable.mussarela, "R$ 22,50", "9"));
        pizzas.add(new Pizzas("Pizza de Calabresa", "Ingredientes", R.drawable.calabresa, "R$ 21,50", "8"));
        pizzas.add(new Pizzas("Pizza de Catupiry", "Ingredientes", R.drawable.catupiry, "R$ 42,50", "9"));
        pizzas.add(new Pizzas("Pizza Portuguesa", "Ingredientes", R.drawable.portuguesa, "R$ 33,50", "7"));
        pizzas.add(new Pizzas("Pizza de Milho", "Ingredientes", R.drawable.milho, "R$ 25,50", "6"));
        pizzas.add(new Pizzas("Pizza de Bacon", "Ingredientes", R.drawable.bacon, "R$ 35,50", "7"));

        return pizzas;
    }
}
