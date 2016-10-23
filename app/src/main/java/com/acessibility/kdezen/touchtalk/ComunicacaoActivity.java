package com.acessibility.kdezen.touchtalk;

import android.app.Activity;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;


import utilities.MediaHelpers;

public class ComunicacaoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comunicacao);

        this.setTitle("TouchTalk  - Comunicação");

       MediaHelpers mediaHelpers=new MediaHelpers();



           mediaHelpers.playMusic(this, R.raw.oi, R.id.LayoutOiComoVai);
           mediaHelpers.playMusic(this, R.raw.tudobem, R.id.LayoutTudoBem);
            mediaHelpers.playMusic(this, R.raw.ler, R.id.LayoutLer);
            mediaHelpers.playMusic(this, R.raw.estoutriste, R.id.LayoutEstouTriste);

       // mediaHelpers.playOnly(this,R.raw.oi);
    }

}
