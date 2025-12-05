package com.example.zadlek51225;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private EditText etImie, etNazwisko, etIleZnakow;
    private Spinner spinner;
    private CheckBox cbLitery, cbCyfry, cbZnaki;
    private Button btnGeneruj,btnZatwierdz;

    private String maleLitery = "qweryuiopasdfghjklzxcvbnm";
    private String duzeLitery = "QWERTYUIOPASDFGHJKLZXCVBNM";
    private String znakiSpecjalne = "!@#$%^&*()-_=+";
    private String cyfry = "1234567890";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        etImie = findViewById(R.id.etImie);
        etNazwisko = findViewById(R.id.etNazwisko);
        etIleZnakow = findViewById(R.id.etIleZnakow);
        spinner = findViewById(R.id.spinner);
        cbLitery = findViewById(R.id.cbLitery);
        cbCyfry = findViewById(R.id.cbCyfry);
        cbZnaki = findViewById(R.id.cbZnaki);
        btnGeneruj = findViewById(R.id.btnGeneruj);
        btnZatwierdz = findViewById(R.id.btnZatwierdz);
    }
}