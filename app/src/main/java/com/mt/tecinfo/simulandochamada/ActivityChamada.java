package com.mt.tecinfo.simulandochamada;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class ActivityChamada extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chamada);

        final TextView numero = (TextView) findViewById(R.id.displayN);
        final Button btn_c = (Button) findViewById(R.id.btn_apagar);
        final Button btn1 = (Button) findViewById(R.id.btn_1);
        final Button btn2 = (Button) findViewById(R.id.btn_2);
        final Button btn3 = (Button) findViewById(R.id.btn_3);
        final Button btn4 = (Button) findViewById(R.id.btn_4);
        final Button btn5 = (Button) findViewById(R.id.btn_5);
        final Button btn6 = (Button) findViewById(R.id.btn_6);
        final Button btn7 = (Button) findViewById(R.id.btn_7);
        final Button btn8 = (Button) findViewById(R.id.btn_8);
        final Button btn9 = (Button) findViewById(R.id.btn_9);
        final Button btn0 = (Button) findViewById(R.id.btn_0);
        final Button btnAst = (Button) findViewById(R.id.btn_a);
        final Button btnHash = (Button) findViewById(R.id.btn_hashtag);

        final Button btnLigar = (Button) findViewById(R.id.btn_ligar);
    }
}
