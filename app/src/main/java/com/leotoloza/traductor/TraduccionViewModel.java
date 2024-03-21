package com.leotoloza.traductor;

import android.app.Application;
import android.content.Intent;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

import java.util.HashMap;
import java.util.Map;

public class TraduccionViewModel extends AndroidViewModel {
    public Map<String, Palabra> lista = new HashMap<>();

    public TraduccionViewModel(@NonNull Application application) {
        super(application);
    }

    public void verificaPalabra(Intent intent){
        if (intent != null) {
            String palabra = intent.getStringExtra("palabra");
            if (palabra != null) {
                lista=generarLista();
                Palabra trad=lista.getOrDefault(palabra,null);


                Log.d("salida", "Palabra recibida: " + trad.getTraducccion());
            } else {
                Log.d("salida", "No se recibió ninguna palabra.");
            }
        } else {
            Log.d("salida", "Intent nulo.");
        }

         }

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


}
