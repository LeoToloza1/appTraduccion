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
                Palabra trad=lista.getOrDefault(palabra,lista.get("tradError"));
                Log.d("salida", "Palabra traducida: " + trad.getTraducccion());
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
        Palabra e = new Palabra("Error", R.drawable.error);
        map.put("tradError", e);
        return map;
    }


}
