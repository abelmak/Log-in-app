package com.example.loginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class HomePageActivity extends AppCompatActivity {
    private TextView ecGPA;
    private TextView epGPA;
    private TextView eaccCredits;
    private TextView esemCredits;
    private TextView eWelcome;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        eWelcome = findViewById(R.id.tvWelcome);
        eWelcome.setText("Welcome " + RegistrationActivity.credentials.getUsername());
        ecGPA = findViewById(R.id.tvcGPA);
        ecGPA.setText("Cumulative GPA: " + RegistrationActivity.profile.getcGPA());
        epGPA = findViewById(R.id.tvpGPA);
        epGPA.setText("Projected GPA: " + RegistrationActivity.profile.getpGPA());
        eaccCredits = findViewById(R.id.tvaccCredits);
        eaccCredits.setText("Accumulated Credits: " + RegistrationActivity.profile.getAccCredits());
        esemCredits = findViewById(R.id.tvsemCredits);
        esemCredits.setText("Credits this semester: " + RegistrationActivity.profile.getSemCredits());

    }
    public void csbrowser(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.eee.ntu.edu.sg/Programmes/ProspectiveStudents/UG/IEM/Curriculum/Pages/Curriculum-Structure.aspx"));
        startActivity(browserIntent);
    }
}