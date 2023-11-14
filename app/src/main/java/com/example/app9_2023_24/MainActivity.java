package com.example.app9_2023_24;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10, btn11, btn12, btn13, btn14;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Selecccion(View view) {
        int id = view.getId();

        if (id == R.id.banana) {
            Toast.makeText(this, "Estas son banana", Toast.LENGTH_SHORT).show();
        } else if (id == R.id.cereza) {
            Toast.makeText(this, "Estas son cereza", Toast.LENGTH_SHORT).show();
        } else if (id == R.id.frambuesas) {
            Toast.makeText(this, "Estas son frambuesas", Toast.LENGTH_SHORT).show();
        } else if (id == R.id.fresa) {
            Toast.makeText(this, "Estas son fresas", Toast.LENGTH_SHORT).show();
        } else if (id == R.id.kiwi) {
            Toast.makeText(this, "Estas son kiwis", Toast.LENGTH_SHORT).show();
        } else if (id == R.id.mango) {
            Toast.makeText(this, "Estas son mangos", Toast.LENGTH_SHORT).show();
        } else if (id == R.id.manzanas) {
            Toast.makeText(this, "Estas son manzanas", Toast.LENGTH_SHORT).show();
        } else if (id == R.id.melo) {
            Toast.makeText(this, "Estas son melones", Toast.LENGTH_SHORT).show();
        } else if (id == R.id.naranja) {
            Toast.makeText(this, "Estas son naranjas", Toast.LENGTH_SHORT).show();
        } else if (id == R.id.pera) {
            Toast.makeText(this, "Estas son peras", Toast.LENGTH_SHORT).show();
        } else if (id == R.id.piña) {
            Toast.makeText(this, "Estas son piñas", Toast.LENGTH_SHORT).show();
        } else if (id == R.id.sandia) {
            Toast.makeText(this, "Estas son sandias", Toast.LENGTH_SHORT).show();
        } else if (id == R.id.uva) {
            Toast.makeText(this, "Estas son uvas", Toast.LENGTH_SHORT).show();
        } else if (id == R.id.zaramora) {
            Toast.makeText(this, "Estas son zaramoras", Toast.LENGTH_SHORT).show();
        }

    }

}