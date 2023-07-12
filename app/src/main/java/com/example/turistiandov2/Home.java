package com.example.turistiandov2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Home extends AppCompatActivity {

    //ZONA DE LOS ATRIBUTOS
    Button botonHoteles;
    Button botonRestaurantes;
    Button botonTurismo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        botonHoteles=findViewById(R.id.botonhoteles);
        botonRestaurantes=findViewById(R.id.botonrestaurantes);
        botonTurismo=findViewById(R.id.botonsitios);

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
                Toast.makeText(this, "quiero que este en ingles", Toast.LENGTH_SHORT).show();
                break;
            case(R.id.opcion2):
                Toast.makeText(this, "quiero que este en español", Toast.LENGTH_SHORT).show();
                break;
            case(R.id.opcion3):
                Toast.makeText(this, "quiero que este en italiano", Toast.LENGTH_SHORT).show();
                break;
            case(R.id.opcion4):
                Toast.makeText(this, "quiero ir a acerca de nosotros", Toast.LENGTH_SHORT).show();
                break;

        }

        return super.onOptionsItemSelected(item);
    }

    public void cambiarIdioma(String idioma){

    }

}