package com.haphap.volume;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnLimas = findViewById(R.id.btn_limas);
        Button btnKerucut = findViewById(R.id.btn_kerucut);

        btnLimas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), LimasActivity.class);
                startActivity(intent);
            }
        });

        btnKerucut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), KerucutActivity.class);
                startActivity(intent);
            }
        });
    }
}
