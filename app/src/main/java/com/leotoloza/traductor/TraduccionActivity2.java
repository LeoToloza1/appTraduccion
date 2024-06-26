package com.leotoloza.traductor;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.lifecycle.ViewModelProvider;

public class TraduccionActivity2 extends AppCompatActivity {
    private TraduccionViewModel mv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_traduccion2);
        mv = new ViewModelProvider(this).get(TraduccionViewModel.class);

       Intent intent = getIntent();
       Palabra result= mv.verificaPalabra(intent);

       //Obtener referencias elementos
       TextView traduccionTextView = findViewById(R.id.traduccion);
       ImageView imagenTradImageView = findViewById(R.id.imagenTrad);
       Button btnAtrasButton = findViewById(R.id.btnAtras);

        //Muestra la palabra traducida y la imagen
        traduccionTextView.setText(result.getTraducccion());
        imagenTradImageView.setImageResource(result.getImg());

        // Agregar un Listener al botón para cerrar la actividad
        btnAtrasButton.setOnClickListener(view -> finish());
       Log.d("salida", "Salida-> "  + result.getTraducccion() + " "+ "img-> " + result.getImg());
       // si l apalbra buscdano esta llegara un palabr aError,  siempre se imprime lo que llegue

       /* if ("Error".equals(result.getTraducccion())) {
            Log.d("salida", "Error");
        }
        else
        {
            Log.d("salida", "ok");
        }

        */
    }

}