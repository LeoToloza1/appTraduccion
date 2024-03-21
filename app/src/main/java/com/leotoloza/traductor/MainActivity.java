package com.leotoloza.traductor;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.lifecycle.ViewModelProvider;

import com.leotoloza.traductor.databinding.ActivityMainBinding;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
private ActivityMainBinding binding;
    private MainActivityViewModel mv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        mv= ViewModelProvider.AndroidViewModelFactory.getInstance(getApplication()).create(MainActivityViewModel.class);
      binding.btnTraducir.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              String palabra=binding.palabra.getText().toString();
              mv.enviarPalabra(palabra);
          }
      });

       /** for (Map.Entry<String, Palabra> entry : lista.entrySet()) {
            String clave = entry.getKey();
            Palabra palabras = entry.getValue();
         // Log.d("Iteracion", "Clave: " + clave + ", Traducción: " + palabras.getTraduccion() + ", Imagen: " + palabras.getImg());
            Log.d("salida",clave + "-" + palabras.getTraducccion());
        }*/

    }
/*
    public Map generarLista(){
        Map<String, Palabra> map = new HashMap<>();
        Palabra a = new Palabra("cat", R.drawable.cat);
        map.put("gato", a);
        Palabra b = new Palabra("car", R.drawable.car);
        map.put("auto", b);
        Palabra c = new Palabra("cow", R.drawable.cow);
        map.put("vaca", c);
        Palabra d = new Palabra("dog", R.drawable.dog);
        map.put("perro", d);
        return map;
    }
*/
}