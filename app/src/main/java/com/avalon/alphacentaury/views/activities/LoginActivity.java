package com.avalon.alphacentaury.views.activities;

import android.os.Bundle;
import android.util.Log;

import com.avalon.alphacentaury.R;

import javax.inject.Inject;

import dagger.android.support.DaggerAppCompatActivity;




public class LoginActivity extends DaggerAppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        Log.d("DaggerTest", "");
    }

}
