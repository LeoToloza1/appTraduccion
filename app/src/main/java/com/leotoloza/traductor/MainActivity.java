package com.leotoloza.traductor;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.leotoloza.traductor.databinding.ActivityMainBinding;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
      String palabra=binding.palabra.getText().toString();
      binding.btnTraducir.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              String palabra=binding.palabra.getText().toString();
              Log.d("salida",palabra);
          }
      });

    }

    public void generarLista(){
        Map<String, String> map = new HashMap<>();
        map.put("arbol", "tree");
        map.put("casa", "house");
        map.put("auto", "car");
        map.put("gato", "cat");
        map.put("perro", "dog");
        map.put("caballo", "horse");
        map.put("vaca", "cow");
    }





}