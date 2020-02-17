package com.haphap.volume;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class LimasActivity extends AppCompatActivity {

    EditText etLebarAlas, etTinggiAlas, etTinggiLimas;
    Button btnHasil;
    TextView tvHasil;

    DecimalFormat df = new DecimalFormat("###.##");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_limas);

        etLebarAlas = findViewById(R.id.et_l_alas);
        etTinggiAlas = findViewById(R.id.et_t_alas);
        etTinggiLimas = findViewById(R.id.et_t_limas);
        btnHasil = findViewById(R.id.btn_hasil);
        tvHasil = findViewById(R.id.tv_hasil);

        btnHasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    double lebarAlas = Double.valueOf(etLebarAlas.getText().toString().trim());
                    double tinggiAlas = Double.valueOf(etTinggiAlas.getText().toString().trim());
                    double tinggiLimas = Double.valueOf(etTinggiLimas.getText().toString().trim());

                    double volume = lebarAlas * tinggiAlas / 2 * tinggiLimas /3;

                    tvHasil.setText(df.format(volume));

                } catch (NumberFormatException e) {
                    Toast.makeText(getApplicationContext(),"Field tidak boleh kosong", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
