package com.example.appciclovida;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btn_passar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Toast.makeText(getApplicationContext(), "OnCreate", Toast.LENGTH_SHORT).show();
        btn_passar = findViewById(R.id.btn_passar);

        Aluno aluno = new Aluno("José", "2020.1.2.45");
        btn_passar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("aluno", aluno);
                startActivity(intent);
            }
        });

    }
}
    /*@Override
    protected void onStart(){
        super.onStart();
        Toast.makeText(getApplicationContext(), "OnStart", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume(){
        super.onResume();
        Toast.makeText(getApplicationContext(), "OnResume", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause(){
        super.onPause();
        Toast.makeText(getApplicationContext(), "OnPause", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop(){
        super.onStop();
        Toast.makeText(getApplicationContext(), "OnStop", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Toast.makeText(getApplicationContext(), "OnRestart", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Toast.makeText(getApplicationContext(), "OnDestroy", Toast.LENGTH_SHORT).show();
    }*/




