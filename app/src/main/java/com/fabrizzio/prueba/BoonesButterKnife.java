package com.fabrizzio.prueba;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class BoonesButterKnife extends AppCompatActivity {

    @BindView(R.id.correo)
    EditText correo;
    @BindView(R.id.contrasena)
    EditText contrasena;
    @BindView(R.id.btnfb)
    Button btnfb;
    @BindView(R.id.btning)
    Button btning;
    @BindView(R.id.texto1)
    TextView texto1;
    @BindView(R.id.registro)
    Button registro;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

    }

    @OnClick({R.id.btnfb, R.id.btning, R.id.registro})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btnfb:
                break;
            case R.id.btning:
                break;
            case R.id.registro:
                break;
        }
    }
}
