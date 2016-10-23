package com.acessibility.kdezen.touchtalk;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import utilities.MediaHelpers;

public class PessoalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pessoal);

        this.setTitle("TouchTalk  - Pessoal");

        MediaHelpers mediaHelpers=new MediaHelpers();
         mediaHelpers.playMusic(this, R.raw.comer, R.id.LayoutComer);
        mediaHelpers.playMusic(this, R.raw.dormir, R.id.LayoutDormir);
        mediaHelpers.playMusic(this, R.raw.escovarosdentes, R.id.LayoutEscovar);
        mediaHelpers.playMusic(this, R.raw.tomarbanho, R.id.LayoutTomar);
    }
}
