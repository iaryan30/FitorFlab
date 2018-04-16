package com.example.android.fitorflab;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_ITEM_TITLE="extra.item.title";
    public static final String EXERCISE_WEIGHTS="Weight_Lifting";
    public static final String EXERCISE_YOGA="Yoga";
    public static final String EXERCISE_CARDIO="Cardio";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        RelativeLayout weightBtn=(RelativeLayout)findViewById(R.id.weightBtn);
        RelativeLayout yogaBtn=(RelativeLayout)findViewById(R.id.yogaBtn);
        RelativeLayout cardioBtn=(RelativeLayout)findViewById(R.id.cardioBtn);

        weightBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadDetailActivity(MainActivity.EXERCISE_WEIGHTS);//for static variable-> class name and then the static variable

            }
        });

        yogaBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadDetailActivity(MainActivity.EXERCISE_YOGA);
            }
        });

        cardioBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadDetailActivity(MainActivity.EXERCISE_CARDIO);
            }
        });
    }
    //title of exercise will be passed
    private void loadDetailActivity(String exerciseTitle){
        Intent intent= new Intent(MainActivity.this,DetailsActivity.class);
        intent.putExtra(MainActivity.EXTRA_ITEM_TITLE,exerciseTitle);
        startActivity(intent);

    }
}
