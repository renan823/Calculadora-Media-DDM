package com.example.a23_04_11ddm;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView lblNome;
    private TextView lblEmail;
    private TextView lblMedia;

    private EditText editTextNome;
    private EditText editTextEmail;
    private EditText editTextNota1;
    private EditText editTextNota2;


    private Button btnSai;
    private Button btnExibe;
    private Button btnCalcula;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lblNome = findViewById(R.id.lblNome);
        lblEmail = findViewById(R.id.lblEmail);
        lblMedia = findViewById(R.id.lblMedia);

        editTextNome = findViewById(R.id.editTextNome);
        editTextEmail = findViewById(R.id.editTextEmail);
        editTextNota1 = findViewById(R.id.editTextNota1);
        editTextNota2 = findViewById(R.id.editTextNota2);

        btnCalcula = findViewById(R.id.btnCalcula);
        btnCalcula.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                double nota1, nota2, media;

                nota1 = Double.parseDouble(editTextNota1.getText().toString());
                nota2 = Double.parseDouble(editTextNota2.getText().toString());
                media = (nota1 + nota2) / 2;

                lblMedia.setText(Double.toString(media));
            }
        });

        btnExibe = findViewById(R.id.btnExibe);
        btnExibe.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                String msg = "";
                msg = msg + editTextNome.getText() + "\n";
                msg = msg + editTextEmail.getText() + "\n";
                msg = msg + "Notas: " + editTextNota1.getText() + " e " + editTextNota2.getText();

                Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_LONG).show();

            }
        });

        btnSai = findViewById(R.id.btnSai);
        btnSai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.exit(1);
            }
        });
    }

}