package com.example.learningletters;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public Button ActivityVocal;
    public Button ActivityAlfabeto;
    public TextView titul;
    public ImageView botonatras;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActivityVocal = (Button) findViewById(R.id.btnActivityVocal);
        ActivityAlfabeto = (Button) findViewById(R.id.btnActivityAbecedario);
        titul = (TextView) findViewById(R.id.toolbar_title);
        botonatras = (ImageView) findViewById(R.id.btnatras);

        ActivityVocal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,MainActivityVocales.class);
                startActivity(i);
                finish();
            }
        });
        //abecedario
        ActivityAlfabeto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,MainActivityAlfabeto.class);
                startActivity(i);
                finish();


            }
        });

        titul.setText("LearningLetters");
        botonatras.setVisibility(View.INVISIBLE);

    }
}