package com.acessibility.kdezen.touchtalk;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;

import utilities.MediaHelpers;
import utilities.ScreenHelpers;

public class TelaActivity extends AppCompatActivity {

    LinearLayout comunicacao, pessoal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela);
/*

        MediaHelpers mediaHelpers=new MediaHelpers();

        mediaHelpers.playMusic(this, R.raw.tampas, R.id.LayoutTampas);
        mediaHelpers.playMusic(this, R.raw.panelas, R.id.LayoutPanela);
        mediaHelpers.playMusic(this, R.raw.tambor, R.id.LayoutTambor);
        mediaHelpers.playMusic(this, R.raw.buzina, R.id.LayoutBuzina);*/

     //   comunicacao=(LinearLayout)findViewById(R.)


        this.setTitle("TouchTalk  - Tabelas");
        ScreenHelpers screenHelpers=new ScreenHelpers();

        screenHelpers.runActitivty(com.acessibility.kdezen.touchtalk.ComunicacaoActivity.class,this,R.id.LayoutComunicacao);

        screenHelpers.runActitivty(com.acessibility.kdezen.touchtalk.PessoalActivity.class,this,R.id.LayoutPessoal);

    }
}
