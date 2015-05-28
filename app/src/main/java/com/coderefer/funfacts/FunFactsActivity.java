package com.coderefer.funfacts;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;


public class FunFactsActivity extends ActionBarActivity {

String[] facts = {"Ants stretch when they wake up in the morning.",
        "Ostriches can run faster than horses.",
        "Olympic gold medals are actually made mostly of silver.",
        "You are born with 300 bones; by the time you are an adult you will have 206",
        "It takes about 8 minutes for light from the sun to reach earth",
        "Some bamboo plants can grow almost a meter in just one day.",
        "The state of Florida is bigger than England",
        "Some penguins can loop 2-3 meters out of the water",
        "Mammoths still walked the earth when the Great Pyramid was being built."};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);

        //Declare our View Variables adn assign the views from the layout file
        final TextView factLabel = (TextView) findViewById(R.id.tvFact);
        Button showFactButton = (Button) findViewById(R.id.bShowFact);

        showFactButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String fact = "";
                Random randGen = new Random();
                int randNum = randGen.nextInt(facts.length);

                factLabel.setText(facts[randNum]);

            }
        });



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_fun_facts, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
