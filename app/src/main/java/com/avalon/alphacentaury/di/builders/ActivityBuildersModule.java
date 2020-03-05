package com.avalon.alphacentaury.di.builders;

import android.app.Application;
import android.content.Context;

import com.avalon.alphacentaury.views.activities.LoginActivity;

import dagger.Binds;
import dagger.Module;
import dagger.android.ContributesAndroidInjector;




/**
 * Created by User on 2/19/2020.
 */
@Module
public abstract class ActivityBuildersModule {


    @ContributesAndroidInjector
    abstract LoginActivity contributeLoginActivity();


    @Binds
    abstract Context bindContext(Application application);
}
