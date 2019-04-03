package com.constraint.interfacedemo;

import android.net.Uri;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity implements SecondFragment.OnFragmentInteractionListener{

    Button btn1,btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        btn1=findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                InterfaceModelClass.getInstance().callInSecondActivitToImplementInFirstFragment();
            }
        });
        btn2=findViewById(R.id.btn2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                InterfaceModelClass.getInstance().callInSecondActivityImplementInFirstActivity();
            }
        });
        SecondFragment secondFragment = new SecondFragment();
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.container2,secondFragment,"");
        transaction.commit();
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
