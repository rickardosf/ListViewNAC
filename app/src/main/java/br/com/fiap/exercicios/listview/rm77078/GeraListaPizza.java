package br.com.fiap.exercicios.listview.rm77078;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by logonrm on 30/03/2017.
 */

public class GeraListaPizza {
    public static List<Pizzas> geraPizzas(){
        List<Pizzas> pizzas = new ArrayList<>();

        pizzas.add(new Pizzas("PizzApp de Mussarela",
                "Ingredientes " +
                "\n 250 gramas de farinha de trigo;\n" +
                "1 e 1/2 copo de água ou leite;\n" +
                "1 tablete ou 3 colheres de fermento;\n" +
                "3 colheres (sopa) de azeite de oliva;\n" +
                "3 tomates;\n" +
                "Pimenta, sal e orégano a gosto e azeitonas.",
                R.drawable.mussarela,
                "R$ 22,50",
                "CUIDADO !!! A pizza pode conter produtos alergicos.",
                "RANK DA PIZZA: 9"));

        pizzas.add(new Pizzas("PizzApp de Calabresa",
                "Ingredientes " +
                "\n 1 disco de massa de pizza preassado \n" +
                "2 linguiça calabresa defumada cortadas em rodelas \n" +
                "4 tomate em rodelas \n" +
                "150 gramas de queijo mussarela \n " +
                "3 colheres (sopa) de molho de tomate \n" +
                "cebola fatiada a gosto \n" +
                "azeitona a gosto \n" +
                "orégano a gosto",
                R.drawable.calabresa,
                "R$ 21,50",
                "CUIDADO !!! A pizza pode conter produtos alergicos.",
                "RANK DA PIZZA: 9"));

        pizzas.add(new Pizzas("PizzApp de Frango Catupiry",
                "Ingredientes \n " +
                "2 xícaras de água\n" +
                "1 massa de pizza\n" +
                "1 colher de orégano\n" +
                "400g de peito de frango\n" +
                "400g de queijo catupiry\n" +
                "1 pitada de sal\n" +
                "1 colher de salsa\n" +
                "4 tomates",
                R.drawable.catupiry,
                "R$ 42,50",
                "CUIDADO !!! A pizza pode conter produtos alergicos.",
                "RANK DA PIZZA: 9"));

        pizzas.add(new Pizzas("PizzApp Portuguesa",
                "Ingredientes \n" +
                "150 g de queijo mussarela.\n" +
                "50 g de presunto.\n" +
                "1 tomate em rodelas.\n" +
                "1 ovo cozido.\n" +
                "1 cebola picada.\n" +
                "Molho de tomate.\n" +
                "Azeitonas para decorar, orégano e tempero verde a gosto.",
                R.drawable.portuguesa,
                "R$ 33,50",
                "CUIDADO !!! A pizza pode conter produtos alergicos.", "RANK DA PIZZA: 9"));

        pizzas.add(new Pizzas("PizzApp de Milho",
                "Ingredientes \n " +
                "3 xicaras de chá de farinha de milho\n" +
                "3 colheres de sopa de margarina\n" +
                "Sal a gosto\n" +
                "Recheio\n" +
                "2 dentes de alho\n" +
                "2 colheres de sopa de cebola\n" +
                "2 colheres de sopa de azeite\n" +
                "2 espigas de milho\n" +
                "1 xicara de chá de leite\n" +
                "1\\2 colher de sopa de amido de milho\n" +
                "1 colher de sopa de salsa\n" +
                "Sal a gosto\n" +
                "Cobertura\n" +
                "3 rodelas de tomate\n" +
                "3 fatias de queijo mussarela\n" +
                "Orégano a gosto",
                R.drawable.milho,
                "R$ 25,50",
                "CUIDADO !!! A pizza pode conter produtos alergicos.", "RANK DA PIZZA: 9"));

        pizzas.add(new Pizzas("PizzApp de Bacon",
                "Ingredientes \n" +
                "2 xícaras (chá) de molho de tomate\n" +
                "410g de catupiry\n" +
                "1/2 xícaras (chá) de bacon picado e frito\n" +
                "Azeitonas e orégano a gosto\n" +
                "Massa\n" +
                "50g de fermento biológico fresco\n" +
                "1/2 colher (sopa) de açúcar\n" +
                "1/2 colher (sopa) de sal\n" +
                "1 ovo\n" +
                "1 xícara (chá) de água morna\n" +
                "2 colheres (sopa) de óleo\n" +
                "3 xícaras (chá) de farinha de trigo",
                R.drawable.bacon,
                "R$ 35,50",
                "CUIDADO !!! A pizza pode conter produtos alergicos.",
                "RANK DA PIZZA: 9"));

        return pizzas;
    }
}
