package com.constraint.interfacedemo;

import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import butterknife.ButterKnife;

public class FirstActivity extends AppCompatActivity implements InterfaceModelClass.OnCustomStateListener2,FragmentFirst.OnFragmentInteractionListener {

    Button btnSecondActivity;
    //SecondActivity.InterfaceSecond interfaceSecond;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        InterfaceModelClass.getInstance().setListener2(this);
        //interfaceSecond=(SecondActivity.InterfaceSecond)this;
        btnSecondActivity=findViewById(R.id.btn_secondactivity);
        btnSecondActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(FirstActivity.this,SecondActivity.class));
            }
        });

        FragmentFirst fragmentFirst = new FragmentFirst();
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.add(R.id.container1,fragmentFirst,"");
        transaction.addToBackStack(null);
        transaction.commit();
    }
    /*@Override
    public void implementForFirstFragment() {
        Toast.makeText(FirstActivity.this," called interface 222",Toast.LENGTH_SHORT).show();
    }*/

    @Override
    public void onFragmentInteraction(Uri uri) {

    }

    @Override
    public void implementForFirstActivity() {
        Toast.makeText(FirstActivity.this," implemetation in First Activity",Toast.LENGTH_SHORT).show();
    }
}
