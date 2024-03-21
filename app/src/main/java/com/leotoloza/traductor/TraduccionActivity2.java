package com.leotoloza.traductor;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

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
        mv.verificaPalabra(intent);
    }

}