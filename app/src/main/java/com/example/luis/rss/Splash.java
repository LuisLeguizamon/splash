package com.example.luis.rss;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        lanzarthread();
    }

    private void lanzarthread(){
        Thread mythread = new Thread(){
            public void run(){
                try {
                    sleep(3000);
                    Intent Pantallaprincipal = new Intent(getApplicationContext(),Principal.class);
                    startActivity(Pantallaprincipal);
                    finish();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        mythread.start();
    }

}