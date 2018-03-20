package com.example.admin.ch5_2_3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "Ch5_2_3"; //private：別的類別不能使用，static：靜態的方法，final String：宣告不可變動之常數 TAG

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "Activity Ch5_2_3:onCreate"); // Log.d：debug訊息
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "Activity Ch5_2_3:onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "Activity Ch5_2_3:onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "Activity Ch5_2_3:onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "Activity Ch5_2_3:onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "Activity Ch5_2_3:onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "Activity Ch5_2_3:onDestroy");
    }
}
