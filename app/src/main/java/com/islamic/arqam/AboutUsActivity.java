package com.islamic.arqam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.islamic.wallpaper.R;

public class AboutUsActivity extends AppCompatActivity {
    ImageView  backImageBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);
        backImageBtn = findViewById(R.id.backImageBtn);
        backImageBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(AboutUsActivity.this, MainActivity.class));
            }
        });
    }
}