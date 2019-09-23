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

        //CHOOSE A GREEN COLOR

        paintbrush.setColor(Color.GREEN);

        // draw a line
        paintbrush.setColor(Color.BLUE);
        canvas.drawLine(10,50,200,50,paintbrush);
        //2ND LINE
        paintbrush.setColor(Color.RED);
        canvas.drawLine(90,90,200,50,paintbrush);

        //canvas .drawRect()

        //DRAW some squares

        paintbrush.setColor(Color.WHITE);
        canvas.drawRect(100,100,120,120, paintbrush);

        //draw a  50*50 square
        canvas.drawRect(150,150,200,200,paintbrush);



        //text size

        //1. set the text size
        paintbrush.setTextSize(40);

        //draw text onto screen
        canvas.drawText("hello world", 10, 400,paintbrush );

        // draw some more text
        paintbrush.setTextSize(10);
        paintbrush.setColor(Color.RED);
        canvas.drawText("GOODBYE WORLD", 20, 450,paintbrush);



        imageView.setImageBitmap(b);
    }
}
