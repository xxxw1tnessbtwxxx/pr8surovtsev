package com.example.pr8surovtsev;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainMenu extends AppCompatActivity implements View.OnClickListener
{

    ImageView coffee;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_menu);
        coffee = findViewById(R.id.img_coffee);
        coffee.setOnClickListener(this);
    }




    @Override
    public void onClick(View view) {
        startActivity(new Intent(this, ccatalog.class));
    }
}