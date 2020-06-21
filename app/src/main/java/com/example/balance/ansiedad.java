package com.example.balance;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ansiedad extends AppCompatActivity {

    TextView variable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ansiedad);

        recibirdatos();
    }
    public void recibirdatos(){
        Bundle encuesta =getIntent().getExtras();
        int d1= encuesta.getInt("puntaje");

        variable = (TextView) findViewById(R.id.number1);
        variable.setText(d1);

    }
}
