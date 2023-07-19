package com.example.turistiandov2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Home extends AppCompatActivity {

    //ZONA DE LOS ATRIBUTOS
    Button botonHoteles;
    Button botonRestaurantes;
    Button botonTurismo;

    TextView nombreCliente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        String nombre=getIntent().getStringExtra("nombre");

        botonHoteles=findViewById(R.id.botonhoteles);
        botonRestaurantes=findViewById(R.id.botonrestaurantes);
        botonTurismo=findViewById(R.id.botonsitios);
        nombreCliente=findViewById(R.id.usuario);

        //Uniendo el texto del PUTEXTRA con el TEXTVIEW
        nombreCliente.setText(nombre);

        //detectando eventos
        botonHoteles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentHoteles=new Intent(Home.this,HotelesHome.class);
                startActivity(intentHoteles);
            }
        });




    }


    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item){
        int itemSeleccionado=item.getItemId();
        switch (itemSeleccionado){

            case(R.id.opcion1):

                break;
            case(R.id.opcion2):

                break;
            case(R.id.opcion3):

                break;
            case(R.id.opcion4):

                Intent intent = new Intent(Home.this,Acerca.class);
                startActivity(intent);

                break;

        }

        return super.onOptionsItemSelected(item);
    }

    public void cambiarIdioma(String idioma){

    }

}