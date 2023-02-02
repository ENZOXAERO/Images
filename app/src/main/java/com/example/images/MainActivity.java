package com.example.images;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<SlideModel> images = new ArrayList<>();

        images.add(new SlideModel("https://m.media-amazon.com/images/M/MV5BMTQ0NTk5Mzk2OV5BMl5BanBnXkFtZTcwMDE3NTE4MQ@@._V1_.jpg", "", ScaleTypes.CENTER_INSIDE));
        images.add(new SlideModel("https://media.timeout.com/images/9441/750/422/image.jpg", "", ScaleTypes.CENTER_INSIDE));
        images.add(new SlideModel("https://upload.wikimedia.org/wikipedia/it/d/df/RocknRolla.jpg", "", ScaleTypes.CENTER_INSIDE));
        images.add(new SlideModel("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQISgqX7A94xYJsfO7z0ZTPM9mbfxfJYzt1Jg&usqp=CAU", "", ScaleTypes.CENTER_INSIDE));
        images.add(new SlideModel("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQwy_Cp8FSSIDiHYy42K0VSDrTg9-WJi3oKcg&usqp=CAU", "", ScaleTypes.CENTER_INSIDE));

        ImageSlider img = findViewById(R.id.image_slider);
        img.setImageList(images);

        Button btn = findViewById(R.id.btnMore);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://www.imdb.com/title/tt1032755/");
                startActivity(new Intent(Intent.ACTION_VIEW, uri));
            }
        });
    }
}