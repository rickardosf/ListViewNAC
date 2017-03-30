package br.com.fiap.exercicios.listview.rm77078;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class PizzaActivity extends AppCompatActivity {
    TextView txtNomePizza;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pizza);

        Pizzas pizza = (Pizzas)getIntent().getExtras().get("pizza");

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle( pizza.getPizza() );

        txtNomePizza.setText();
    }
}
