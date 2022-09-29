package com.example.aurras_mdev;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        defineButtons();
    }

    public void defineButtons() {
        findViewById(R.id.BackButton).setOnClickListener(buttonClickListener);
        findViewById(R.id.SUNextButton).setOnClickListener(buttonClickListener);
    }

    private View.OnClickListener buttonClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View viewRegister) {
            switch (viewRegister.getId()) {
                case (R.id.BackButton):
                    showMainActivity();
                    break;
                case (R.id.SUNextButton):
                    NotImplemented(viewRegister);
                    break;
            }
        }
    };

    public void showMainActivity(){
        Intent showMainActivityPage = new Intent(this, MainActivity.class);
        startActivity(showMainActivityPage);
        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
    }

    @Override
    public void onBackPressed(){
    }

    public void NotImplemented(View viewSU){
        Toast.makeText(this, "This feature is not yet available", Toast.LENGTH_SHORT).show();
    }
}