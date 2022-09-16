package com.example.batterydrawable;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.LevelListDrawable;
import android.os.BatteryManager;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import java.util.logging.Level;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();
    private int mDecrease = 7;
    private int mIncrease = 0;
    ImageView batteryCharge ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        batteryCharge = findViewById(R.id.imageView);
    }

    public void decreaseCharge(View view) {

        if(batteryCharge.equals(R.drawable.ic_baseline_battery_full)){
            mDecrease = getDrawable(R.drawable.ic_baseline_battery_full).getLevel();
            batteryCharge.setImageLevel(mDecrease--);
        }
        else if(batteryCharge.equals(R.drawable.ic_baseline_battery_6_bar)){
            mDecrease = getDrawable(R.drawable.ic_baseline_battery_6_bar).getLevel();
            batteryCharge.setImageLevel(mDecrease--);
        }
        else if(batteryCharge.equals(R.drawable.ic_baseline_battery_5_bar)){
            mDecrease = getDrawable(R.drawable.ic_baseline_battery_5_bar).getLevel();
            batteryCharge.setImageLevel(mDecrease--);
        }
        else if(batteryCharge.equals(R.drawable.ic_baseline_battery_4_bar)){
            mDecrease = getDrawable(R.drawable.ic_baseline_battery_4_bar).getLevel();
            batteryCharge.setImageLevel(mDecrease--);
        }
        else if(batteryCharge.equals(R.drawable.ic_baseline_battery_3_bar)){
            mDecrease = getDrawable(R.drawable.ic_baseline_battery_3_bar).getLevel();
            batteryCharge.setImageLevel(mDecrease--);
        }
        else if(batteryCharge.equals(R.drawable.ic_baseline_battery_2_bar)){
            mDecrease = getDrawable(R.drawable.ic_baseline_battery_2_bar).getLevel();
            batteryCharge.setImageLevel(mDecrease--);
        }
        else if(batteryCharge.equals(R.drawable.ic_baseline_battery_1_bar)){
            mDecrease = getDrawable(R.drawable.ic_baseline_battery_1_bar).getLevel();
            batteryCharge.setImageLevel(mDecrease--);
        }
        else if(batteryCharge.equals(R.drawable.ic_baseline_battery_0_bar)) {
            mDecrease = getDrawable(R.drawable.ic_baseline_battery_0_bar).getLevel();
            batteryCharge.setImageLevel(0);
        }
        else{
            Log.i(TAG, "error: Out of bounds");
        }
    }

    public void increaseCharge(View view) {


        if(batteryCharge.equals(R.drawable.ic_baseline_battery_0_bar)){
            mDecrease = getDrawable(R.drawable.ic_baseline_battery_0_bar).getLevel();
            batteryCharge.setImageLevel(mIncrease++);
        }
        else if(batteryCharge.equals(R.drawable.ic_baseline_battery_1_bar)){
            mDecrease = getDrawable(R.drawable.ic_baseline_battery_1_bar).getLevel();
            batteryCharge.setImageLevel(mIncrease++);
        }
        else if(batteryCharge.equals(R.drawable.ic_baseline_battery_2_bar)){
            mDecrease = getDrawable(R.drawable.ic_baseline_battery_2_bar).getLevel();
            batteryCharge.setImageLevel(mIncrease++);
        }
        else if(batteryCharge.equals(R.drawable.ic_baseline_battery_3_bar)){
            mDecrease = getDrawable(R.drawable.ic_baseline_battery_3_bar).getLevel();
            batteryCharge.setImageLevel(mIncrease++);
        }
        else if(batteryCharge.equals(R.drawable.ic_baseline_battery_4_bar)){
            mDecrease = getDrawable(R.drawable.ic_baseline_battery_4_bar).getLevel();
            batteryCharge.setImageLevel(mIncrease++);
        }
        else if(batteryCharge.equals(R.drawable.ic_baseline_battery_5_bar)){
            mDecrease = getDrawable(R.drawable.ic_baseline_battery_5_bar).getLevel();
            batteryCharge.setImageLevel(mIncrease++);
        }
        else if(batteryCharge.equals(R.drawable.ic_baseline_battery_6_bar)){
            mDecrease = getDrawable(R.drawable.ic_baseline_battery_6_bar).getLevel();
            batteryCharge.setImageLevel(mIncrease++);
        }
        else if(batteryCharge.equals(R.drawable.ic_baseline_battery_full)) {
            mDecrease = getDrawable(R.drawable.ic_baseline_battery_full).getLevel();
            batteryCharge.setImageLevel(7);
        }
        else{
            Log.i(TAG, "error: Out of bounds");
        }
    }
}