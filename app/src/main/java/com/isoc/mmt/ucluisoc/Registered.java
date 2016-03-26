package com.isoc.mmt.ucluisoc;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Registered extends AppCompatActivity implements View.OnClickListener {
    //Button variables are initiated
    Button bReturn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registered);
    //The id refers to the button created in the xml file for the activities that follow
        bReturn = (Button) findViewById(R.id.bReturn);

        bReturn.setOnClickListener(this);


    }

    @Override
    public void onClick(View v)
    {//This class assigns the action of opening the desired activity when the user clicks on it for the navigation menu//
        switch (v.getId()){
            case R.id.bReturn:

                startActivity(new Intent(this, SubscribePage.class));

                break;
        }

    }

}
