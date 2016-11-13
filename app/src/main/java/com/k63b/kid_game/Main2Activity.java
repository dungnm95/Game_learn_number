package com.k63b.kid_game;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class Main2Activity extends AppCompatActivity {

    ImageView back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        back = (ImageView)findViewById(R.id.btn_back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent screen_main = new Intent(Main2Activity.this,MainActivity.class);
                startActivity(screen_main);
            }
        });
    }
}
