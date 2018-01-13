package com.fabrizzio.prueba;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends Activity {
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
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.btnfb, R.id.btning, R.id.texto1, R.id.registro})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btnfb:
                texto1.setText("Ingreso con Facebook");
                break;
            case R.id.btning:
                Intent intent = new Intent(MainActivity.this, Ingreso.class);
                startActivity(intent);
                Toast.makeText(MainActivity.this, "Bienvenido hijo mío " + correo.getText(), Toast.LENGTH_SHORT).show();
                intent.putExtra("correo",correo.getText());
                break;
            case R.id.texto1:
                Intent intent1 = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(intent1);
                Toast.makeText(MainActivity.this, "Nah, mentira", Toast.LENGTH_SHORT).show();
                break;
            case R.id.registro:
                texto1.setText("Registro");
                break;
        }
    }
}
