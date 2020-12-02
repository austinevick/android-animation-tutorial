package com.example.animations;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    boolean image1IsShowing = true;
    public void fade(View view){
        Log.i("info","image tapped");
        ImageView imageView1 = (ImageView)findViewById(R.id.imageView1);
        ImageView imageView2 = (ImageView)findViewById(R.id.imageView2);
      /*  if(image1IsShowing){
            image1IsShowing = false;
            imageView1.animate().alpha(0).setDuration(2000);
            imageView2.animate().alpha(1).setDuration(2000);
        }else {
            image1IsShowing = true;
            imageView1.animate().alpha(1).setDuration(2000);

            imageView2.animate().alpha(0).setDuration(2000);
        }*/
      //  imageView1.animate().translationYBy(200).setDuration(2000);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView imageView1 = (ImageView)findViewById(R.id.imageView1);
imageView1.setX(-1000);
imageView1.animate().translationXBy(1000).rotation(3600).setDuration(5000);

    }
}