package com.example.xylophone;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button C = (Button)findViewById(R.id.C);
        Button D = (Button)findViewById(R.id.D);
        Button E = (Button)findViewById(R.id.E);
        Button F = (Button)findViewById(R.id.F);
        Button G = (Button)findViewById(R.id.G);
        Button A = (Button)findViewById(R.id.A);
        Button B = (Button)findViewById(R.id.B);

        final MediaPlayer mpc = MediaPlayer.create(this, R.raw.note1_c);
        final MediaPlayer mpd = MediaPlayer.create(this, R.raw.note2_d);
        final MediaPlayer mpe = MediaPlayer.create(this, R.raw.note3_e);
        final MediaPlayer mpf = MediaPlayer.create(this, R.raw.note4_f);
        final MediaPlayer mpg = MediaPlayer.create(this, R.raw.note5_g);
        final MediaPlayer mpa = MediaPlayer.create(this, R.raw.note6_a);
        final MediaPlayer mpb = MediaPlayer.create(this, R.raw.note7_b);

        C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mpc.start();
            }
        });

        D.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mpd.start();
            }
        });

        E.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mpe.start();
            }
        });

        F.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mpf.start();
            }
        });

        G.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mpg.start();
            }
        });

        A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mpa.start();
            }
        });

        B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mpb.start();
            }
        });


    }
}
