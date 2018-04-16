package com.example.android.fitorflab;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        Button BackBtn=(Button) findViewById(R.id.backBtn);
        TextView exerciseTexte= (TextView) findViewById(R.id.TitleView);
        ImageView exerciseImg=(ImageView) findViewById(R.id.exerciseTitle);
        CheckBox checkBox1=(CheckBox) findViewById(R.id.checkBox1);
        CheckBox checkBox2=(CheckBox) findViewById(R.id.checkBox2);
        CheckBox checkBox3=(CheckBox) findViewById(R.id.checkBox3);
        CheckBox checkBox4=(CheckBox) findViewById(R.id.checkBox4);
        CheckBox checkBox5=(CheckBox) findViewById(R.id.checkBox5);
        LinearLayout mainBg=(LinearLayout)findViewById(R.id.mainBG);

        BackBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(DetailsActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });


        String exerciseTitle= getIntent().getStringExtra(MainActivity.EXTRA_ITEM_TITLE);
        exerciseTexte.setText(exerciseTitle);
        if(exerciseTitle.equalsIgnoreCase(MainActivity.EXERCISE_WEIGHTS)){
            exerciseImg.setImageDrawable(getResources().getDrawable(R.drawable.weight,getApplicationContext().getTheme()));
            mainBg.setBackgroundColor(Color.parseColor("#2ca5f5"));
            checkBox1.setText("Complete type set 1");
            checkBox2.setText("Complete type set 2");
            checkBox3.setText("Complete type set 3");
            checkBox4.setText("Complete type set 4");
            checkBox5.setText("Complete type set 5");

        }
        else if(exerciseTitle.equalsIgnoreCase(MainActivity.EXERCISE_YOGA)){
            exerciseImg.setImageDrawable(getResources().getDrawable(R.drawable.lotus,getApplicationContext().getTheme()));
            mainBg.setBackgroundColor(Color.parseColor("#916bcd"));
            checkBox1.setText("Complete type 1 Yoga");
            checkBox2.setText("Complete type 2 Yoga");
            checkBox3.setText("Complete type 3 Yoga");
            checkBox4.setText("Complete type 4 Yoga");
            checkBox5.setText("Complete type 5 Yoga");

        }
        else {
            exerciseImg.setImageDrawable(getResources().getDrawable(R.drawable.heart,getApplicationContext().getTheme()));
            mainBg.setBackgroundColor(Color.parseColor("#52ad56"));
            checkBox1.setText("Walk 2 miles");
            checkBox2.setText("Run 5 miles");
            checkBox3.setText("Sprint 200m");
            checkBox4.setText("Sprint 400m");
            checkBox5.setText("Bike 15 miles");
        }
        }


    }

