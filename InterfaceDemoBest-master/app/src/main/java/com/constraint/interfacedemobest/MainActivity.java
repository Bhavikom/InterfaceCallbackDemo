package com.constraint.interfacedemobest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements ICallback{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CallbackClass  c = new CallbackClass(this,"hi");
        c.callCallback();
        //MyButton m = new MyButton(this);

        startActivity(new Intent(MainActivity.this,SecondActivity.class));
    }

    @Override
    public void callback(String s) {
       // Toast.makeText(this," done "+s,Toast.LENGTH_SHORT).show();
    }

    /*public class MyButton {
        MyListener ml;

        // constructor
        MyButton(MyListener ml) {
            this.ml = ml;
        }

        public void MyLogicToIntimateOthere() {
            ml.callback(this, "success");
        }
    }
    public interface MyListener {
        // you can define any parameter as per your requirement
        public void callback(View view, String result);
    }*/
}
