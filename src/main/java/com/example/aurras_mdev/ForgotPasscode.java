package com.example.aurras_mdev;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class ForgotPasscode extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_passcode);

        defineButtons();
    }

    public void defineButtons(){
        findViewById(R.id.BackButton).setOnClickListener(buttonClickListener);
        findViewById(R.id.CantRememberButton).setOnClickListener(buttonClickListener);
        findViewById(R.id.FPNextButton).setOnClickListener(buttonClickListener);
    }

    private View.OnClickListener buttonClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View viewForgotPasscode) {
            switch (viewForgotPasscode.getId()){
                case (R.id.BackButton):
                    showMainActivity();
                    break;
                case (R.id.CantRememberButton):
                    Toast.makeText(ForgotPasscode.this, "This feature is not yet available", Toast.LENGTH_SHORT).show();
                    break;
                case (R.id.FPNextButton):
                    showPageNotFound();
                    break;
            }
        }
    };

    public void showMainActivity(){
        Intent showMainActivityPage = new Intent(ForgotPasscode.this, MainActivity.class);
        startActivity(showMainActivityPage);
    }

    public void showPageNotFound(){
        Intent showPageNotFoundPage = new Intent(ForgotPasscode.this, PageNotFound.class);
        startActivity(showPageNotFoundPage);
        overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out);
    }

    @Override
    public void onBackPressed(){

    }
}