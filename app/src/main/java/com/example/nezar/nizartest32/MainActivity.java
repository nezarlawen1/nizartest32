package com.example.nezar.nizartest32;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button btActivity , btDailer , btWeb ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btActivity =  findViewById(R.id.btActivity);
        btDailer =  findViewById(R.id.btDialer);
        btWeb =  findViewById(R.id.btWeb);
        btActivity.setOnClickListener((View.OnClickListener) this);
    }

    @Override
    public void onClick(View v) {

    }
}
