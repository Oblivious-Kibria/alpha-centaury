package com.avalon.alphacentaury.di;

import com.avalon.alphacentaury.views.activities.LoginActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;




/**
 * Created by User on 2/19/2020.
 */
@Module
public abstract class ActivityBuildersModule {


    @ContributesAndroidInjector
    abstract LoginActivity contributeLoginActivity();



}
