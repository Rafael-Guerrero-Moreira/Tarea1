package com.example.practic2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Salu2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_salu2);

        //Localizar los controles
         TextView txtSaludo = (TextView)findViewById(R.id.lblsaludo);
         //Recuperamos la información pasada en el intent
         Bundle bundle = this.getIntent().getExtras();
         //Construimos el mensaje a mostrar
         txtSaludo.setText("¡Hola!, "+ bundle.getString("Nombre")+"\n Bienvenido " + "\n Género: " + bundle.getString("Genero")
                 + "\n Teléfono: " + bundle.getString("Telefono")+ "\n Fecha Nacimiento: " + bundle.getString("Fecha"));
    }
}