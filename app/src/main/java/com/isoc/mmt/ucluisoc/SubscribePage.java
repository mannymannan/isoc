package com.isoc.mmt.ucluisoc;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SubscribePage extends AppCompatActivity implements View.OnClickListener {

    Button bSubscribe;
    EditText etName, etEmail, etDegree_Studying, etMobile_Number;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subscribe_page);

        etName = (EditText) findViewById(R.id.etName);
        etEmail = (EditText) findViewById(R.id.etEmail);
        etDegree_Studying = (EditText) findViewById(R.id.etDegree_Studying);
        etMobile_Number = (EditText) findViewById(R.id.etMobile_Number);
        bSubscribe = (Button) findViewById(R.id.bSubscribe);

        bSubscribe.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.bSubscribe:

                startActivity(new Intent(this, Registered.class));

                break;
        }

    }
}
