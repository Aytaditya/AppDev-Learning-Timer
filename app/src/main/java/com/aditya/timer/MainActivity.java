package com.aditya.timer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Task Schedular using Handler and Runnable
        // Scheduling toast that displays in ever 1sec

//        final Handler handler=new Handler();
//        Runnable run= new Runnable() {
//            @Override
//            public void run() {
//                // code to execute
//                number++;
//
//                //Toast.LENGTH_SHORT: This specifies that the Toast message should be displayed for a short duration. The exact duration is system-dependent but is typically around 2 seconds.
//                Toast.makeText(MainActivity.this,"this is toast "+number,Toast.LENGTH_SHORT);
//                handler.postDelayed(this,1000);
//
//
//            }
//        };
//        handler.post(run);


        new CountDownTimer(5000,1000){

            public void onTick(long millsUntilFinished){
                Log.d("batman", "onTick: I am batman");
                //in every 1sec i am batman will get printed
                // after 5sec when its over we will see finished completely

            }

            public void onFinish(){
                Log.d("finish", "onFinish: finished completely ");

            }
        }.start();



    }
}