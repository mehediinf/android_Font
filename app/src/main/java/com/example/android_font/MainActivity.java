package com.example.android_font;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView1,textView2;
    private Typeface typeface1,typeface2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView1 = findViewById(R.id.textView_Id1);
        textView2 = findViewById(R.id.textView_Id2);

        typeface1 = Typeface.createFromAsset(getAssets(),"font/OpenSans_Bold.ttf");
        textView1.setTypeface(typeface1);


        typeface2 = Typeface.createFromAsset(getAssets(),"font/OpenSans_Italic.ttf");
        textView2.setTypeface(typeface2);
    }
}