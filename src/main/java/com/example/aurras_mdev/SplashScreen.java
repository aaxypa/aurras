package com.example.aurras_mdev;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

import gr.net.maroulis.library.EasySplashScreen;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        EasySplashScreen configuration = new EasySplashScreen(SplashScreen.this)
                .withFullScreen()
                .withTargetActivity(MainActivity.class)
                .withSplashTimeOut(3000)
                .withBackgroundColor(Color.parseColor("#231942"))
                .withFooterText("Debug Mode-Midterms")
                .withLogo(R.drawable.aurass_splashicon);

        configuration.getFooterTextView().setTextColor(Color.WHITE);

        View splash = configuration.create();
        setContentView(splash);
    }
}