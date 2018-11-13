package com.mt.tecinfo.simulandochamada;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    SharedPreferences meusDados;
    public static final String myPreference = "call";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        meusDados = getSharedPreferences(myPreference, Context.MODE_PRIVATE);

        final EditText email = (EditText) findViewById(R.id.edt_email);
        final EditText senha = (EditText) findViewById(R.id.edt_senha);

        final Button login = (Button) findViewById(R.id.btn_login);
        final Button registar = (Button) findViewById(R.id.btn_registrar);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String meuEmail = email.getText().toString();
                String minhaSenha = senha.getText().toString();

                if (meusDados.contains("email") && meusDados.contains("senha")) {
                    if (meuEmail.equals(meusDados.getString("email", "")) && minhaSenha.equals(meusDados.getString("senha", ""))) {
                        Intent intent = new Intent(MainActivity.this, ActivityChamada.class);
                        startActivity(intent);
                        finish();
                    } else {
                        Toast.makeText(getApplicationContext(), "E-mail ou senha inválidos!", Toast.LENGTH_LONG).show();
                    }
                } else {
                    Toast.makeText(getApplicationContext(), "Cadastro inválido!", Toast.LENGTH_LONG).show();
                }
            }
        });

        registar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ActivityRegistro.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
