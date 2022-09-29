package com.example.aurras_mdev;

import androidx.annotation.ColorRes;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.pdf.PdfDocument;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class PageNotFound extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_not_found);

        defineButtons();
    }

    int clicks = 0;
    View viewer;

    public void defineButtons() {
        findViewById(R.id.BackButton).setOnClickListener(buttonClickListener);
        findViewById(R.id.NotFound).setOnClickListener(buttonClickListener);
    }

    private View.OnClickListener buttonClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View viewPageNotFound) {
            switch (viewPageNotFound.getId()){
                case (R.id.BackButton):
                    goBackToMainActivity();
                    break;
                case (R.id.NotFound):
                    clicks++;
                    goBreakPage(clicks);
                    break;
            }
        }
    };

    public void goBackToMainActivity(){
        Intent goBackToMainActivityPage = new Intent(PageNotFound.this,MainActivity.class);
        startActivity(goBackToMainActivityPage);
    }

    public void goBreakPage(int clicks){
        switch (clicks){
            case 1:
                Toast.makeText(this, "Don\'t taunt the blackhole", Toast.LENGTH_SHORT).show();
                break;
            case 2:
                Toast.makeText(this,"You will break the app", Toast.LENGTH_SHORT).show();
                break;
            case 3:
                findViewById(R.id.BackButton).setVisibility(View.INVISIBLE);
                findViewById(R.id.BackgroundXML_PN).setVisibility(View.INVISIBLE);
                Toast.makeText(this, "Stop", Toast.LENGTH_SHORT).show();
                break;
            case 4:
                findViewById(R.id.ForgotPassCode).setVisibility(View.INVISIBLE);
                Toast.makeText(this, "STOP", Toast.LENGTH_SHORT).show();
                break;
            case 5:
                findViewById(R.id.Oops).setVisibility(View.INVISIBLE);
                Toast.makeText(this, "S T O P", Toast.LENGTH_SHORT).show();
                break;
            case 6:
                goBackToMainActivity();
                break;
        }

    }

    @Override
    public void onBackPressed(){

    }
}