package com.Abiraj.myQueeze;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.WindowManager;
import android.widget.TextView;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    ConstraintLayout constraintLayout;
    TextView tvTimeMsg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        constraintLayout = findViewById(R.id.container);
        tvTimeMsg = findViewById(R.id.tv_time_msg);

        Calendar c = Calendar.getInstance();
        int timeOfDay = c.get(Calendar.HOUR_OF_DAY);

        if(timeOfDay >= 0 && timeOfDay < 12){
            //morning
            constraintLayout.setBackground(getDrawable(R.drawable.good_morning_img));
            tvTimeMsg.setText("Good Morning");

        }else if(timeOfDay >=12 && timeOfDay <16){
            //afternoon

        }else if(timeOfDay >=16 && timeOfDay <21){
            //evening
        }else if(timeOfDay >=21 && timeOfDay < 24){
            // night
            constraintLayout.setBackground(getDrawable(R.drawable.good_night_img));
            tvTimeMsg.setText("Good Night");
        }

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
    }
}
