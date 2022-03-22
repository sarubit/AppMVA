package com.example.minhavidaacademica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class FormLogin extends AppCompatActivity {

    private TextView link;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_login);

        getSupportActionBar().hide();

        link = (TextView) findViewById(R.id.text_tela_cadastro);
        link.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("http://www.minhavidaacademica.com.br/View/quem_cadastrar.php"));
                startActivity(Intent);

            }
        });

    }
}