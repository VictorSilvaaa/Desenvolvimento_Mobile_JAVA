package com.example.ratingbarcomjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView texto;
    private Button botao;
    private RatingBar estrelas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        texto = findViewById(R.id.TextView);
        botao = findViewById(R.id.button);
        estrelas = findViewById(R.id.ratingBar);

        estrelas.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
             texto.setText("" + rating);
            }
        });

        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String estrelasSElecionadas = "" + estrelas.getRating();
                Toast.makeText(MainActivity.this,estrelasSElecionadas, Toast.LENGTH_LONG).show();
            }
        });


    }
}