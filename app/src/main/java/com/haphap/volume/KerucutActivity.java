package com.haphap.volume;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class KerucutActivity extends AppCompatActivity {

    EditText etR, etS;
    Button btnHasil;
    TextView tvHasil;

    DecimalFormat df = new DecimalFormat("###.##");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kerucut);

        etR = findViewById(R.id.et_r);
        etS = findViewById(R.id.et_s);
        btnHasil = findViewById(R.id.btn_hasil);
        tvHasil = findViewById(R.id.tv_hasil);

        btnHasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    double r = Double.valueOf(etR.getText().toString().trim());
                    double s = Double.valueOf(etS.getText().toString().trim());

                    double luas = 3.14 * r * (r + s);

                    tvHasil.setText(df.format(luas));

                } catch (NumberFormatException e) {
                    Toast.makeText(getApplicationContext(),"Field tidak boleh kosong", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
