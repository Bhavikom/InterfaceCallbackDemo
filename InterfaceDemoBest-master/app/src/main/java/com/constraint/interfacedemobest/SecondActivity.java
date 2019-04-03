package com.constraint.interfacedemobest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity implements ICallback{

    Button btncall;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        btncall=findViewById(R.id.btncallback);
        btncall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }

    @Override
    public void callback(String s) {
        Toast.makeText(this," done "+s,Toast.LENGTH_SHORT).show();
    }
}
