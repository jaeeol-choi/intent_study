package com.cadi.intent_study;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    Button btn_intent;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_intent = (Button) findViewById(R.id.btn_intent);

        btn_intent.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Intent goMain2 = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(goMain2);
                finish();
            }
        });

    }
}
