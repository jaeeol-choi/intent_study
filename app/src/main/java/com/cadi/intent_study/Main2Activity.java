package com.cadi.intent_study;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    Button btn_school;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        btn_school = (Button) findViewById(R.id.btn_school);

        btn_school.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Handler hand = new Handler();
                hand.postDelayed(new Runnable() {
                    @Override
                    public void run()
                    {
                        Toast.makeText(Main2Activity.this, "경북대학교", Toast.LENGTH_SHORT).show();
                    }
                },2000);
            }
        });
    }
}
