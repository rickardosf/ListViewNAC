package br.com.fiap.exercicios.listview.rm77078;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by logonrm on 30/03/2017.
 */

public class GeraListaPizza {
    public static List<Pizzas> geraPizzas(){
        List<Pizzas> pizzas = new ArrayList<>();

        Pizzas pizzas1 = new Pizzas("Pizza de Mussarela","descrição",R.drawable.pizza,"R$20,00");
        Pizzas pizzas2 = new Pizzas("Pizza de Calabresa","descrição",R.drawable.pizza,"R$20,00");
        Pizzas pizzas3 = new Pizzas("Pizza de Frango","descrição",R.drawable.pizza,"R$20,00");
        Pizzas pizzas4 = new Pizzas("Pizza de Milho","descrição",R.drawable.pizza,"R$20,00");
        Pizzas pizzas5 = new Pizzas("Pizza de Bacon","descrição",R.drawable.pizza,"R$20,00");
        Pizzas pizzas6 = new Pizzas("Pizza de portuguesa","descrição",R.drawable.pizza,"R$20,00");

        pizzas.add(pizzas1);
        pizzas.add(pizzas2);
        pizzas.add(pizzas3);
        pizzas.add(pizzas4);
        pizzas.add(pizzas5);
        pizzas.add(pizzas6);

        return pizzas;
    }
}
