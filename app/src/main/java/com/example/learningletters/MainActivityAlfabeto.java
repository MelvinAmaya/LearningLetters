package com.example.learningletters;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivityAlfabeto extends AppCompatActivity {
    public ImageView letra_a;
    public ImageView letra_b;
    public ImageView letra_c;
    public ImageView letra_d;
    public ImageView letra_e;
    public ImageView letra_f;
    public ImageView letra_g;
    public ImageView letra_h;
    public ImageView letra_i;
    public ImageView letra_j;
    public ImageView letra_k;
    public ImageView letra_l;
    public ImageView letra_m;
    public ImageView letra_n;
    public ImageView letra_enie;
    public ImageView letra_o;
    public ImageView letra_p;
    public ImageView letra_q;
    public ImageView letra_r;
    public ImageView letra_s;
    public ImageView letra_t;
    public ImageView letra_u;
    public ImageView letra_v;
    public ImageView letra_w;
    public ImageView letra_x;
    public ImageView letra_y;
    public ImageView letra_z;
    public ImageView atras;
    public TextView titulo3;

    MediaPlayer abecedario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_alfabeto);
        letra_a = (ImageView) findViewById(R.id.btnletr_a);
        letra_b = (ImageView) findViewById(R.id.btnletr_b);
        letra_c = (ImageView) findViewById(R.id.btnletr_c);
        letra_d = (ImageView) findViewById(R.id.btnletr_d);
        letra_e = (ImageView) findViewById(R.id.btnletr_e);
        letra_f = (ImageView) findViewById(R.id.btnletr_f);
        letra_g = (ImageView) findViewById(R.id.btnletr_g);
        letra_h = (ImageView) findViewById(R.id.btnletr_h);
        letra_i = (ImageView) findViewById(R.id.btnletr_i);
        letra_j = (ImageView) findViewById(R.id.btnletr_j);
        letra_k = (ImageView) findViewById(R.id.btnletr_k);
        letra_l = (ImageView) findViewById(R.id.btnletr_l);
        letra_m = (ImageView) findViewById(R.id.btnletr_m);
        letra_n = (ImageView) findViewById(R.id.btnletr_n);
        letra_enie = (ImageView) findViewById(R.id.btnletr_enie);
        letra_o = (ImageView) findViewById(R.id.btnletr_o);
        letra_p = (ImageView) findViewById(R.id.btnletr_p);
        letra_q = (ImageView) findViewById(R.id.btnletr_q);
        letra_r = (ImageView) findViewById(R.id.btnletr_r);
        letra_s = (ImageView) findViewById(R.id.btnletr_s);
        letra_t = (ImageView) findViewById(R.id.btnletr_t);
        letra_u = (ImageView) findViewById(R.id.btnletr_u);
        letra_v = (ImageView) findViewById(R.id.btnletr_v);
        letra_w = (ImageView) findViewById(R.id.btnletr_w);
        letra_x = (ImageView) findViewById(R.id.btnletr_x);
        letra_y = (ImageView) findViewById(R.id.btnletr_y);
        letra_z = (ImageView) findViewById(R.id.btnletr_z);
        atras = (ImageView) findViewById(R.id.btnatras);
        titulo3 = (TextView) findViewById(R.id.toolbar_title);
        abecedario=null;

        letra_a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(abecedario ==null)
                {
                    abecedario =MediaPlayer.create(getApplicationContext(),R.raw.a);
                    abecedario.start();
                }
                else
                {
                    abecedario.pause();
                    abecedario.release();
                    abecedario=null;
                    abecedario =MediaPlayer.create(getApplicationContext(),R.raw.a);
                    abecedario.start();
                }
            }
        });

        letra_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(abecedario ==null)
                {
                    abecedario =MediaPlayer.create(getApplicationContext(),R.raw.b);
                    abecedario.start();
                }
                else
                {
                    abecedario.pause();
                    abecedario.release();
                    abecedario=null;
                    abecedario =MediaPlayer.create(getApplicationContext(),R.raw.b);
                    abecedario.start();
                }
            }
        });

        letra_c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(abecedario ==null)
                {
                    abecedario =MediaPlayer.create(getApplicationContext(),R.raw.c);
                    abecedario.start();
                }
                else
                {
                    abecedario.pause();
                    abecedario.release();
                    abecedario=null;
                    abecedario =MediaPlayer.create(getApplicationContext(),R.raw.c);
                    abecedario.start();
                }

            }

        });

        letra_d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(abecedario ==null)
                {
                    abecedario =MediaPlayer.create(getApplicationContext(),R.raw.d);
                    abecedario.start();
                }
                else
                {
                    abecedario.pause();
                    abecedario.release();
                    abecedario=null;
                    abecedario =MediaPlayer.create(getApplicationContext(),R.raw.d);
                    abecedario.start();
                }
            }
        });

        letra_e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(abecedario ==null)
                {
                    abecedario =MediaPlayer.create(getApplicationContext(),R.raw.e);
                    abecedario.start();
                }
                else
                {
                    abecedario.pause();
                    abecedario.release();
                    abecedario=null;
                    abecedario =MediaPlayer.create(getApplicationContext(),R.raw.e);
                    abecedario.start();
                }
            }
        });

        letra_f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(abecedario ==null)
                {
                    abecedario =MediaPlayer.create(getApplicationContext(),R.raw.f);
                    abecedario.start();
                }
                else
                {
                    abecedario.pause();
                    abecedario.release();
                    abecedario=null;
                    abecedario =MediaPlayer.create(getApplicationContext(),R.raw.f);
                    abecedario.start();
                }
            }
        });

        letra_g.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(abecedario ==null)
                {
                    abecedario =MediaPlayer.create(getApplicationContext(),R.raw.g);
                    abecedario.start();
                }
                else
                {
                    abecedario.pause();
                    abecedario.release();
                    abecedario=null;
                    abecedario =MediaPlayer.create(getApplicationContext(),R.raw.g);
                    abecedario.start();
                }
            }
        });

        letra_h.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(abecedario ==null)
                {
                    abecedario =MediaPlayer.create(getApplicationContext(),R.raw.h);
                    abecedario.start();
                }
                else
                {
                    abecedario.pause();
                    abecedario.release();
                    abecedario=null;
                    abecedario =MediaPlayer.create(getApplicationContext(),R.raw.h);
                    abecedario.start();
                }
            }
        });

        letra_i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(abecedario ==null)
                {
                    abecedario =MediaPlayer.create(getApplicationContext(),R.raw.i);
                    abecedario.start();
                }
                else
                {
                    abecedario.pause();
                    abecedario.release();
                    abecedario=null;
                    abecedario =MediaPlayer.create(getApplicationContext(),R.raw.i);
                    abecedario.start();
                }
            }
        });

        letra_j.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(abecedario ==null)
                {
                    abecedario =MediaPlayer.create(getApplicationContext(),R.raw.j);
                    abecedario.start();
                }
                else
                {
                    abecedario.pause();
                    abecedario.release();
                    abecedario=null;
                    abecedario =MediaPlayer.create(getApplicationContext(),R.raw.j);
                    abecedario.start();
                }
            }
        });

        letra_k.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(abecedario ==null)
                {
                    abecedario =MediaPlayer.create(getApplicationContext(),R.raw.k);
                    abecedario.start();
                }
                else
                {
                    abecedario.pause();
                    abecedario.release();
                    abecedario=null;
                    abecedario =MediaPlayer.create(getApplicationContext(),R.raw.k);
                    abecedario.start();
                }
            }
        });

        letra_l.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(abecedario ==null)
                {
                    abecedario =MediaPlayer.create(getApplicationContext(),R.raw.l);
                    abecedario.start();
                }
                else
                {
                    abecedario.pause();
                    abecedario.release();
                    abecedario=null;
                    abecedario =MediaPlayer.create(getApplicationContext(),R.raw.l);
                    abecedario.start();
                }
            }
        });

        letra_m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(abecedario ==null)
                {
                    abecedario =MediaPlayer.create(getApplicationContext(),R.raw.m);
                    abecedario.start();
                }
                else
                {
                    abecedario.pause();
                    abecedario.release();
                    abecedario=null;
                    abecedario =MediaPlayer.create(getApplicationContext(),R.raw.m);
                    abecedario.start();
                }
            }
        });

        letra_n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(abecedario ==null)
                {
                    abecedario =MediaPlayer.create(getApplicationContext(),R.raw.n);
                    abecedario.start();
                }
                else
                {
                    abecedario.pause();
                    abecedario.release();
                    abecedario=null;
                    abecedario =MediaPlayer.create(getApplicationContext(),R.raw.n);
                    abecedario.start();
                }
            }
        });

        letra_enie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(abecedario ==null)
                {
                    abecedario =MediaPlayer.create(getApplicationContext(),R.raw.enie);
                    abecedario.start();
                }
                else
                {
                    abecedario.pause();
                    abecedario.release();
                    abecedario=null;
                    abecedario =MediaPlayer.create(getApplicationContext(),R.raw.enie);
                    abecedario.start();
                }
            }
        });

        letra_o.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(abecedario ==null)
                {
                    abecedario =MediaPlayer.create(getApplicationContext(),R.raw.o);
                    abecedario.start();
                }
                else
                {
                    abecedario.pause();
                    abecedario.release();
                    abecedario=null;
                    abecedario =MediaPlayer.create(getApplicationContext(),R.raw.o);
                    abecedario.start();
                }
            }
        });

        letra_p.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(abecedario ==null)
                {
                    abecedario =MediaPlayer.create(getApplicationContext(),R.raw.p);
                    abecedario.start();
                }
                else
                {
                    abecedario.pause();
                    abecedario.release();
                    abecedario=null;
                    abecedario =MediaPlayer.create(getApplicationContext(),R.raw.p);
                    abecedario.start();
                }
            }
        });

        letra_q.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(abecedario ==null)
                {
                    abecedario =MediaPlayer.create(getApplicationContext(),R.raw.q);
                    abecedario.start();
                }
                else
                {
                    abecedario.pause();
                    abecedario.release();
                    abecedario=null;
                    abecedario =MediaPlayer.create(getApplicationContext(),R.raw.q);
                    abecedario.start();
                }
            }
        });

        letra_r.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(abecedario ==null)
                {
                    abecedario =MediaPlayer.create(getApplicationContext(),R.raw.r);
                    abecedario.start();
                }
                else
                {
                    abecedario.pause();
                    abecedario.release();
                    abecedario=null;
                    abecedario =MediaPlayer.create(getApplicationContext(),R.raw.r);
                    abecedario.start();
                }
            }
        });

        letra_s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(abecedario ==null)
                {
                    abecedario =MediaPlayer.create(getApplicationContext(),R.raw.s);
                    abecedario.start();
                }
                else
                {
                    abecedario.pause();
                    abecedario.release();
                    abecedario=null;
                    abecedario =MediaPlayer.create(getApplicationContext(),R.raw.s);
                    abecedario.start();
                }
            }
        });

        letra_t.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(abecedario ==null)
                {
                    abecedario =MediaPlayer.create(getApplicationContext(),R.raw.t);
                    abecedario.start();
                }
                else
                {
                    abecedario.pause();
                    abecedario.release();
                    abecedario=null;
                    abecedario =MediaPlayer.create(getApplicationContext(),R.raw.t);
                    abecedario.start();
                }
            }
        });

        letra_u.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(abecedario ==null)
                {
                    abecedario =MediaPlayer.create(getApplicationContext(),R.raw.u);
                    abecedario.start();
                }
                else
                {
                    abecedario.pause();
                    abecedario.release();
                    abecedario=null;
                    abecedario =MediaPlayer.create(getApplicationContext(),R.raw.u);
                    abecedario.start();
                }
            }
        });

        letra_v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(abecedario ==null)
                {
                    abecedario =MediaPlayer.create(getApplicationContext(),R.raw.v);
                    abecedario.start();
                }
                else
                {
                    abecedario.pause();
                    abecedario.release();
                    abecedario=null;
                    abecedario =MediaPlayer.create(getApplicationContext(),R.raw.v);
                    abecedario.start();
                }
            }
        });

        letra_w.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(abecedario ==null)
                {
                    abecedario =MediaPlayer.create(getApplicationContext(),R.raw.w);
                    abecedario.start();
                }
                else
                {
                    abecedario.pause();
                    abecedario.release();
                    abecedario=null;
                    abecedario =MediaPlayer.create(getApplicationContext(),R.raw.w);
                    abecedario.start();
                }
            }
        });

        letra_x.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(abecedario ==null)
                {
                    abecedario =MediaPlayer.create(getApplicationContext(),R.raw.x);
                    abecedario.start();
                }
                else
                {
                    abecedario.pause();
                    abecedario.release();
                    abecedario=null;
                    abecedario =MediaPlayer.create(getApplicationContext(),R.raw.x);
                    abecedario.start();
                }
            }
        });

        letra_y.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(abecedario ==null)
                {
                    abecedario =MediaPlayer.create(getApplicationContext(),R.raw.y);
                    abecedario.start();
                }
                else
                {
                    abecedario.pause();
                    abecedario.release();
                    abecedario=null;
                    abecedario =MediaPlayer.create(getApplicationContext(),R.raw.y);
                    abecedario.start();
                }
            }
        });

        letra_z.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(abecedario ==null)
                {
                    abecedario =MediaPlayer.create(getApplicationContext(),R.raw.z);
                    abecedario.start();
                }
                else
                {
                    abecedario.pause();
                    abecedario.release();
                    abecedario=null;
                    abecedario =MediaPlayer.create(getApplicationContext(),R.raw.z);
                    abecedario.start();
                }
            }
        });

        atras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        titulo3.setText("ALFABETO");

    }
}