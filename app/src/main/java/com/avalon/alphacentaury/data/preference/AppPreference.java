package com.avalon.alphacentaury.data.preference;

import android.content.SharedPreferences;
import android.util.Log;

import javax.inject.Inject;

import dagger.Provides;




public class AppPreference {



    private SharedPreferences sharedPreferences;
    private SharedPreferences.Editor editor;




    @Inject
    public AppPreference(SharedPreferences sharedPreferences) {
        Log.d("SharedPreferencesTest", "SharedPreferences ok");
        this.sharedPreferences = sharedPreferences;
        editor = sharedPreferences.edit();
    }




    public void setString(String key, String value) {
        editor.putString(key, value);
        editor.commit();
    }




    public String getString(String key) {
        return sharedPreferences.getString(key, "");
    }




    public void setBoolean(String key, boolean value) {
        editor.putBoolean(key, value);
        editor.commit();
    }




    public Boolean getBoolean(String key) {
        return sharedPreferences.getBoolean(key, false);
    }




    public void setBooleanForPush(String key, boolean value) {
        editor.putBoolean(key, value);
        editor.commit();
    }




    public void setInteger(String key, int value) {
        editor.putInt(key, value);
        editor.commit();
    }




    public int getInteger(String key) {
        return sharedPreferences.getInt(key, 0);
    }

}
