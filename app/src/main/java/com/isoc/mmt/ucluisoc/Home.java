package com.isoc.mmt.ucluisoc;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Home extends AppCompatActivity implements View.OnClickListener {
    //Button variables are initiated
    Button bHere;
    Button bMeet;
    Button bFood;
    Button bPrayer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    //The id refers to the button created in the xml file for the activities that follow
        bHere = (Button) findViewById(R.id.bHere);
        bMeet = (Button) findViewById(R.id.bMeet);
        bFood = (Button) findViewById(R.id.bFood);
        bPrayer = (Button) findViewById(R.id.bPrayer);

        bHere.setOnClickListener(this);
        bMeet.setOnClickListener(this);
        bFood.setOnClickListener(this);
        bPrayer.setOnClickListener(this);

    }


    @Override
    public void onClick(View v)
    {//This class assigns the action of opening the desired activity when the user clicks on it for the navigation menu//
        String button_text;
        button_text = ((Button) v).getText().toString();
        if (button_text.equals("Subscribe Here"))
        {
            startActivity(new Intent(this, SubscribePage.class));
        }
        else if (button_text.equals("Meet the President"))
        {
            startActivity(new Intent(this, Committee.class));
        }
        else if (button_text.equals("Nearby Halal Restaurants"))
        {
            startActivity(new Intent(this, Food.class));
        }
        else if (button_text.equals("Prayer Times"))
        {
            startActivity(new Intent(this, Prayer.class));
        }
    }


}
