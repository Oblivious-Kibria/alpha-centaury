package com.avalon.alphacentaury.di.modules;

import android.content.Context;
import android.content.SharedPreferences;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;




/**
 * Created by User on 3/1/2020.
 */
@Module
public class AppModule {

    private Context context;


    public AppModule(Context context) {
        this.context = context;
    }

    @Provides
    @Singleton
    SharedPreferences getSharedPreference() {
        return context.getSharedPreferences("MyPreference",Context.MODE_PRIVATE);
    }


    @Provides
    @Singleton
    Context getContext() {
        return context;
    }

}
