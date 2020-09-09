package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button=(Buttin)findViewByI(R.i.buttonTest);
        button.setInClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v){
                Intent intent=new Intent(MainActivity.this,AnotherActivity.class);
                intent.putExtra("name","zhangsan");
                intent.putExtra("age",20);
                startActivityForResult(intent,0);
            }
        });
    }


}