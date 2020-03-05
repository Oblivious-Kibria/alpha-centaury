package com.avalon.alphacentaury.di.modules;

import android.content.Context;
import android.content.SharedPreferences;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Module;
import dagger.Provides;




/**
 * Created by User on 3/1/2020.
 */
@Module
public class AppModule {



    @Provides
    @Singleton
    SharedPreferences provideSharedPreference(Context context) {
        return context.getSharedPreferences("MyPreference",Context.MODE_PRIVATE);
    }




}
