package com.example.aurras_mdev;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        defineButtons();
    }

    public void defineButtons(){
        findViewById(R.id.ForgotPasscodeButton).setOnClickListener(buttonClickListener);
        findViewById(R.id.LoginButton).setOnClickListener(buttonClickListener);
        findViewById(R.id.RegisterButton).setOnClickListener(buttonClickListener);
    }


    private View.OnClickListener buttonClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View viewMainActivity) {
            switch (viewMainActivity.getId()) {
                case (R.id.ForgotPasscodeButton):
                    showForgotPasscodePage();
                    break;
                case (R.id.LoginButton):
                    showMusicPlayer();
                    break;
                case (R.id.RegisterButton):
                    showRegistrationPage();
                    break;
            }
        }
    };

    public void showForgotPasscodePage(){
        Intent showForgotPasscode = new Intent(MainActivity.this, ForgotPasscode.class);
        startActivity(showForgotPasscode);
        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
    }

    public void showMusicPlayer(){
        Intent showMusicPlayerApp = new Intent(MainActivity.this, MusicPlayer.class);
        startActivity(showMusicPlayerApp);
        overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
    }

    public void showRegistrationPage(){
        Intent showRegistration = new Intent(MainActivity.this, Register.class);
        startActivity(showRegistration);
        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
    }

    public void AppVersion(View view){
        Toast.makeText(this, "AppVersion v2", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onBackPressed(){

    }



}