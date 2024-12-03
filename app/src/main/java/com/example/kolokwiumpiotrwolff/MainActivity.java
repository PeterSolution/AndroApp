package com.example.kolokwiumpiotrwolff;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Button cw;
    Button cw2;
    Button cw3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        cw= (Button) findViewById(R.id.walutykarta);
        cw2= (Button)findViewById(R.id.gameCard);
        cw3= (Button)findViewById(R.id.dbkarta);
        cw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gotogameactivity=new Intent(MainActivity.this, walutykarta.class);
                startActivity(gotogameactivity);
            }
        });
        cw2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1=new Intent(MainActivity.this, grakarta.class);
                startActivity(intent1);
            }
        });
    }
    void gotodolar(View view){
        Intent gotowalutyactivity=new Intent(MainActivity.this, walutykarta.class);
        startActivity(gotowalutyactivity);
    }
    void gotogame(View view){
        Intent gotogameactivity=new Intent(MainActivity.this, grakarta.class);
        startActivity(gotogameactivity);
    }
}