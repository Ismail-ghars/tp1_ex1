package com.example.tp1_ex1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView texte = findViewById(R.id.text_view_id);
        texte.setText("Bonjour chers étudiants !");
    }
}
