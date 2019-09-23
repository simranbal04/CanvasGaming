package com.example.canvasdrawingdemo;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //make our variables for drawing
        ImageView imageView = findViewById(R.id.imageview);
        Bitmap b = Bitmap.createBitmap(300, 500, Bitmap.Config.ARGB_8888);

        // SETUP THE  CANVAS
        Canvas canvas = new Canvas(b);

        //setup yoyur paintbrush
        Paint paintbrush = new  Paint();

        //draw somestuff on the canvas
        //set the background color
        canvas.drawColor(Color.YELLOW);

        //

        imageView.setImageBitmap(b);
    }
}
