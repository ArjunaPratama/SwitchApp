package com.arjuna.switchapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txthasil;
    EditText etpergi;
    Button btnHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        txthasil = (TextView) findViewById(R.id.txthasil);
        etpergi = (EditText) findViewById(R.id.etpergi);
        btnHasil = (Button) findViewById(R.id.btnHasil);



        btnHasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String npergi = etpergi.getText().toString();
                switch (npergi) {
                    case "1":
                        txthasil.setText("Naik Pesawat Terbang");
                        break;
                    case "2":
                        txthasil.setText("Naik Kereta Api");
                        break;
                    case "3":
                        txthasil.setText("Naik Bus");
                        break;
                    case "4":
                        txthasil.setText("Naik Taksi");
                        break;
                    case "5":
                        txthasil.setText("Naik Mobil");
                        break;
                    case "6":
                        txthasil.setText("Naik Motor");
                        break;
                    default:
                        txthasil.setText("Pilihan diantara no 1-6");
                }

            }
        });


    }
}
