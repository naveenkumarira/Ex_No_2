package com.example.ex_no_2;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Rating;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String name,gender,course;
    float ratingOnProgrammingKnowledge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Name
        final EditText nameEditText = findViewById(R.id.et_name);
        //Gender
        final Spinner genderSpinner = findViewById(R.id.sp_gender);
        //Course
        final RadioGroup courseRadioGroup = findViewById(R.id.rg_course);
        final RadioButton cseRadioButton = findViewById(R.id.radio_cse);
        final RadioButton itRadioButton = findViewById(R.id.radio_it);
        //Programming Rating
        final RatingBar ratingBarOnProgramming = findViewById(R.id.rb_rating_programming);
        final Button submitButton = findViewById(R.id.btn_submit);

        courseRadioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(R.id.radio_cse == checkedId) {
                    course =  "BE- CSE";
                }
                else {
                    course = "B.TECH- IT";
                }
            }
        });

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name = nameEditText.getText().toString();
                gender = genderSpinner.getSelectedItem().toString();
                ratingOnProgrammingKnowledge = ratingBarOnProgramming.getRating();
                //To show it to user
                Toast.makeText(getApplicationContext(), "Name: " +name+ "\nCourse: "+course+"\nGender: "+gender+"\nRating: "+ratingOnProgrammingKnowledge, Toast.LENGTH_LONG).show();
            }
        });

    }
}