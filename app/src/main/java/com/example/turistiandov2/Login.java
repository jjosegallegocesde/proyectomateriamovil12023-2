package com.example.turistiandov2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class Login extends AppCompatActivity {

    //ATRIBUTOS DE LA CLASE
    EditText cajaNombreUsuario;
    EditText cajaContrasena;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        cajaNombreUsuario=findViewById(R.id.nombreUsuario);
        cajaContrasena=findViewById(R.id.passwordUsuario);

        //Capturando datos de las cajas(Edittext)
        String nombreUsuario=cajaNombreUsuario.getText().toString();
        String passwordUsuario=cajaContrasena.getText().toString();


    }
}