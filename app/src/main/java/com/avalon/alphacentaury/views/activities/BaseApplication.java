package com.avalon.alphacentaury.views.activities;






import dagger.android.AndroidInjector;
import dagger.android.support.DaggerApplication;




/**
 * Created by User on 2/19/2020.
 */
public class BaseApplication extends DaggerApplication {

    @Override
    protected AndroidInjector<? extends DaggerApplication> applicationInjector() {
        return null;
    }

}
