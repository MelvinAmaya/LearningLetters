package com.example.learningletters;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivityVocales extends AppCompatActivity {
    public ImageButton vocala;
    public ImageButton vocale;
    public ImageButton vocali;
    public ImageButton vocalo;
    public ImageButton vocalu;
    public ImageView atra;
    public TextView titulo2;
    MediaPlayer audio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_vocales);
        vocala = (ImageButton) findViewById(R.id.btnletraa);
        vocale = (ImageButton) findViewById(R.id.btnletrae);
        vocali = (ImageButton) findViewById(R.id.btnletrai);
        vocalo = (ImageButton) findViewById(R.id.btnletrao);
        vocalu = (ImageButton) findViewById(R.id.btnletrau);
        atra = (ImageView) findViewById(R.id.btnatras);
        titulo2 = (TextView) findViewById(R.id.toolbar_title);


       vocala.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
              // audio = MediaPlayer.create(MainActivityVocales.this,R.raw.letra_a);
               audio =MediaPlayer.create(getApplicationContext(),R.raw.a);
               Toast.makeText(getApplicationContext(),"Hola panas",Toast.LENGTH_LONG).show();
               audio.start();
           }
       });

       vocale.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               audio = MediaPlayer.create(getApplicationContext(),R.raw.e);
               audio.start();
           }
       });

       vocali.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               audio = MediaPlayer.create(getApplicationContext(),R.raw.i);
               audio.start();
           }
       });

       vocalo.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               audio = MediaPlayer.create(getApplicationContext(),R.raw.o);
               audio.start();
           }
       });

       vocalu.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               audio = MediaPlayer.create(getApplicationContext(),R.raw.u);
               audio.start();
           }
       });

       atra.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent i = new Intent(MainActivityVocales.this,MainActivity.class);
               startActivity(i);
               finish();
           }
       });
       titulo2.setText("VOCALES");


    }
}