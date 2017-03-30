package br.com.fiap.exercicios.listview.rm77078;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Pizzas> pizzas;
    ListView lstPizzas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pizzas = GeraListaPizza.geraPizzas();
        final PizzasAdapter pizzasAdapter = new PizzasAdapter(this, pizzas);
        lstPizzas = (ListView)findViewById(R.id.lstPizzas);
        lstPizzas.setAdapter(pizzasAdapter);

        lstPizzas.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Pizzas pizza = pizzas.get(position);

                Intent it = new Intent(MainActivity.this, PizzaActivity.class);
                it.putExtra("pizza", pizza);
                startActivity(it);
            }
        });



    }
}