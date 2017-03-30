package br.com.fiap.exercicios.listview.rm77078;

import android.support.v7.app.ActionBar;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.widget.ImageView;
        import android.widget.TextView;

public class PizzaActivity extends AppCompatActivity {
    ImageView imgPizza;
    TextView txtNome;
    TextView txtDescricao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pizza);

        Pizzas pizza = (Pizzas) getIntent().getExtras().get("pizza");

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle(pizza.getDescricao());


        imgPizza = (ImageView)findViewById(R.id.imgPizza);
        txtNome = (TextView)findViewById(R.id.txtNomePizza);
        txtDescricao = (TextView)findViewById(R.id.txtDescricao);

        imgPizza.setImageResource(pizza.getImagem());
        txtNome.setText(pizza.getNome());
        txtDescricao.setText(pizza.getDescricao());
    }
}
