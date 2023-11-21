package com.islamic.wallpaper;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;

public class ImageViewActivity extends AppCompatActivity {
    ImageView imageView, backImageBtn;
    ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_view);
        imageView = findViewById(R.id.imageViewDetail);
        backImageBtn = findViewById(R.id.backImageBtn);
        progressBar = findViewById(R.id.progressBar);

        backImageBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ImageViewActivity.this, MainActivity.class));
            }
        });

        // Retrieve the image URL from the intent
        String imageUrl = getIntent().getStringExtra("imageUrl");

        // Load the clicked image into the ImageView
        Glide.with(this)
                .load(imageUrl)
                .into(imageView);

        Picasso.get()
                .load(imageUrl)
                .into(imageView, new Callback() {
                    @Override
                    public void onSuccess() {
                        progressBar.setVisibility(View.GONE); // Hide the progress bar on success
                    }

                    @Override
                    public void onError(Exception e) {
                        progressBar.setVisibility(View.GONE); // Hide the progress bar on error
                    }
                });

    }
}