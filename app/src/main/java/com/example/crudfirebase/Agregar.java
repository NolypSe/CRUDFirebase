package com.example.crudfirebase;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;
import java.util.Map;

public class Agregar extends AppCompatActivity {

    EditText nombre, apellido, email, imgURL;
    Button btnAgregar, btnVolver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agregar);

        nombre = findViewById(R.id.txtNombreA);
        apellido = findViewById(R.id.txtApellidoA);
        email = findViewById(R.id.txtEmailA);
        imgURL = findViewById(R.id.txtImgUrlA);

        btnAgregar = findViewById(R.id.btnAgregar);
        btnVolver = findViewById(R.id.btnVolver);

        btnAgregar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                insertarDatos();
            }
        });
        btnVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    private void insertarDatos(){
        Map<String,Object> map = new HashMap<>();
        map.put("Nombre", nombre.getText().toString());
        map.put("Apellido", apellido.getText().toString());
        map.put("Email", email.getText().toString());
        map.put("ImgUrl", imgURL.getText().toString());

        FirebaseDatabase.getInstance().getReference().child("Programacion Android").push()
                .setValue(map).addOnSuccessListener(new OnSuccessListener<Void>() {
                    @Override
                    public void onSuccess(Void unused) {
                        Toast.makeText(Agregar.this, "Insertado Correctamente", Toast.LENGTH_SHORT).show();
                    }
                }).addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Toast.makeText(Agregar.this, "Error al insertar", Toast.LENGTH_SHORT).show();
                    }
                });
    }
}