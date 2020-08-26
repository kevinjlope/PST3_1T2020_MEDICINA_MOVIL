package com.example.medicinamovil;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class InfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info3);
        TextView nombre = (TextView) findViewById(R.id.tvNombreMedicamento);
        ImageView imagenMedicina = (ImageView) findViewById(R.id.ivMedicinaInfo);
        Intent intent = getIntent();
        Bundle b = intent.getExtras();
        System.out.println(b);

        if(b!=null){
            System.out.println("NOMBRE MEDICINA DENTRO DEL INTENT"+ b.get("nombreMedicina"));
            nombre.setText((String) b.get("nombreMedicina"));
            Picasso.get().load((String) b.get("imagenMedicina")).into(imagenMedicina);

            //img.setImageResource();

        }
    }
}