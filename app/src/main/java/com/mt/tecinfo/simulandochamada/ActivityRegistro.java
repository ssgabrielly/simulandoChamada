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

public class ActivityRegistro extends AppCompatActivity {

    SharedPreferences meusDados;
    public static final String myPreference = "call";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        meusDados = getSharedPreferences(myPreference, Context.MODE_PRIVATE);

        final EditText edt_email = (EditText) findViewById(R.id.registrar_email);
        final EditText edt_senha = (EditText) findViewById(R.id.registrar_senha);
        final EditText edt_conf = (EditText) findViewById(R.id.confirmar_senha);

        final Button cadastrar = (Button) findViewById(R.id.btn_cadastrar);

        cadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edt_senha.getText().toString().equals(edt_conf.getText().toString())) {
                    SharedPreferences.Editor editor = meusDados.edit();
                    editor.putString("email", edt_email.getText().toString());
                    editor.putString("senha", edt_senha.getText().toString());
                    editor.commit();

                    Toast.makeText(getApplicationContext(), "Cadastro concluído com sucesso!", Toast.LENGTH_LONG).show();

                    Intent intent = new Intent(ActivityRegistro.this, MainActivity.class);
                    startActivity(intent);
                    finish();
                } else {
                    Toast.makeText(getApplicationContext(), "As senhas não coincidem!", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
