package com.example.appciclovida;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    private TextView txt_nome;
    private TextView txt_matricula;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        txt_nome = findViewById(R.id.txt_nome);
        txt_matricula = findViewById(R.id.txt_matricula);

        Intent intent = getIntent();
        Aluno aluno = (Aluno) intent.getSerializableExtra("aluno");

        txt_nome.setText(aluno.getNome());
        txt_matricula.setText(aluno.getMatricula());

    }
}