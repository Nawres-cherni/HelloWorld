package com.nawres.hello_world;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv=findViewById(R.id.nawres);
        tv.setText(getResources().getString((R.string.hi)));
        tv.setTextColor(getResources().getColor(R.color.colorAccent));
        tv.setTextSize(30);
    }
}
