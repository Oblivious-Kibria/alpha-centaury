package com.avalon.alphacentaury.di.components;

import android.app.Application;

import com.avalon.alphacentaury.di.builders.ActivityBuildersModule;
import com.avalon.alphacentaury.di.modules.AppModule;
import com.avalon.alphacentaury.views.activities.BaseApplication;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;




/**
 * Created by User on 2/19/2020.
 */
@Singleton
@Component(
        modules = {
                AndroidSupportInjectionModule.class,
                ActivityBuildersModule.class,
                AppModule.class,
        }
)
public interface AppComponent extends AndroidInjector<BaseApplication> {

    @Component.Builder
    interface Builder{

        @BindsInstance
        Builder application(Application application);


        AppComponent build();
    }
}
