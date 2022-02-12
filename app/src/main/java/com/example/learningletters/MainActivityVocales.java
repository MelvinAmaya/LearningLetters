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
    public ImageView vocala;
    public ImageView vocale;
    public ImageView vocali;
    public ImageView vocalo;
    public ImageView vocalu;
    public ImageView atra;
    public TextView titulo2;
    MediaPlayer audio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_vocales);
        vocala = (ImageView) findViewById(R.id.btnletraa);
        vocale = (ImageView) findViewById(R.id.btnletrae);
        vocali = (ImageView) findViewById(R.id.btnletrai);
        vocalo = (ImageView) findViewById(R.id.btnletrao);
        vocalu = (ImageView) findViewById(R.id.btnletrau);
        atra = (ImageView) findViewById(R.id.btnatras);
        titulo2 = (TextView) findViewById(R.id.toolbar_title);
        audio = null;


       vocala.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               if(audio ==null)
               {
                   audio =MediaPlayer.create(getApplicationContext(),R.raw.a);
                   audio.start();
               }
               else
               {
                   audio.pause();
                   audio.release();
                   audio=null;
                   audio =MediaPlayer.create(getApplicationContext(),R.raw.a);
                   audio.start();
               }

           }
       });

       vocale.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               if(audio ==null)
               {
                   audio =MediaPlayer.create(getApplicationContext(),R.raw.e);
                   audio.start();
               }
               else
               {
                   audio.pause();
                   audio.release();
                   audio=null;
                   audio =MediaPlayer.create(getApplicationContext(),R.raw.e);
                   audio.start();
               }
           }
       });

       vocali.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               if(audio ==null)
               {
                   audio =MediaPlayer.create(getApplicationContext(),R.raw.i);
                   audio.start();
               }
               else
               {
                   audio.pause();
                   audio.release();
                   audio=null;
                   audio =MediaPlayer.create(getApplicationContext(),R.raw.i);
                   audio.start();
               }
           }
       });

       vocalo.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               if(audio ==null)
               {
                   audio =MediaPlayer.create(getApplicationContext(),R.raw.o);
                   audio.start();
               }
               else
               {
                   audio.pause();
                   audio.release();
                   audio=null;
                   audio =MediaPlayer.create(getApplicationContext(),R.raw.o);
                   audio.start();
               }
           }
       });

       vocalu.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               if(audio ==null)
               {
                   audio =MediaPlayer.create(getApplicationContext(),R.raw.u);
                   audio.start();
               }
               else
               {
                   audio.pause();
                   audio.release();
                   audio=null;
                   audio =MediaPlayer.create(getApplicationContext(),R.raw.u);
                   audio.start();
               }
           }
       });

       atra.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               finish();
           }
       });
       titulo2.setText("VOCALES");


    }
}