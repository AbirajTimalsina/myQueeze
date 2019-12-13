package com.Abiraj.myQueeze;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;

public class Dashboard extends AppCompatActivity {

    ConstraintLayout constraintLayout;
    AnimationDrawable animationDrawable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

            constraintLayout = (ConstraintLayout)findViewById(R.id.constraint_layout);
            animationDrawable = (AnimationDrawable)constraintLayout.getBackground();
            animationDrawable.setEnterFadeDuration(4000);
            animationDrawable.setExitFadeDuration(4000);
            animationDrawable.start();

    }
}
