package com.acessibility.kdezen.touchtalk;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity implements Runnable {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // tempo em que a tela fica

        Handler handler=new Handler();
        handler.postDelayed(this, 3000);

        //

    }




    public void run() {
        startActivity(new Intent(this,com.acessibility.kdezen.touchtalk.TelaActivity.class));

        finish();
    }
}