package com.fabrizzio.prueba;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import butterknife.ButterKnife;

public class Ingreso extends AppCompatActivity {
    String nombre;
    TextView texto1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ingreso);
        ButterKnife.bind(this);
        nombre = getIntent().getExtras().getString("correo");

    }
}
