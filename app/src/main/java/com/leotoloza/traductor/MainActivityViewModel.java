package com.leotoloza.traductor;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

public class MainActivityViewModel extends AndroidViewModel {
    public MainActivityViewModel(@NonNull Application application) {
        super(application);
    }

    public void enviarPalabra(String palabra){
        Intent intent = new Intent(getApplication().getApplicationContext(), TraduccionActivity2.class);
        intent.putExtra("palabra",palabra);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        Log.d("salida",intent.getStringExtra("palabra"));
        getApplication().startActivity(intent);
    }
}


