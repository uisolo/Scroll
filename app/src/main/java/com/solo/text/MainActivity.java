package com.solo.text;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity
{

    MyView v1;
    Button bt;
    String name;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        v1=(MyView)findViewById(R.id.id_v1);
        bt=(Button)findViewById(R.id.id_bt);
        bt.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                v1.scrollBy(-50,-50);
                name="lanlan";
            }
        });
    }

}
