package com.example.practic2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText nombre, fecha,telf;
    private RadioButton rbFem,rbMasc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nombre=(EditText)findViewById(R.id.txtnombre);
        fecha=(EditText)findViewById(R.id.txtdate);
        telf=(EditText)findViewById(R.id.txttelefono);
        rbFem=(RadioButton)findViewById(R.id.rdbutton1);
        rbMasc=(RadioButton)findViewById(R.id.rdbutton2);
    }
    public void btEnviar(View view){
        String nom=nombre.getText().toString();
        String fec=fecha.getText().toString();
        String tel=telf.getText().toString();

        if(nom.length()==0 || fec.length()==0 || tel.length()==0 || (!rbFem.isChecked() && !rbMasc.isChecked()))
        {
            Toast.makeText(this, "Rellene todos los campos para continuar" , Toast.LENGTH_LONG).show();
        }
        else
        {
            Toast.makeText(this, "Excelente" , Toast.LENGTH_LONG).show();
            Intent intent = new Intent(MainActivity.this, Salu2.class);
            Bundle b = new Bundle();
            b.putString("Nombre", nom);
            b.putString("Fecha", fec);
            b.putString("Telefono", tel);
            if(rbFem.isChecked())
                b.putString("Genero", rbFem.getText().toString());
            if(rbMasc.isChecked())
                b.putString("Genero", rbMasc.getText().toString());
            intent.putExtras(b);
            startActivity(intent);
        }
    }

    }