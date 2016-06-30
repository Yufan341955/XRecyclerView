package com.example.xrecyclerview;

import android.app.Application;

import com.squareup.leakcanary.LeakCanary;

/**
 * date        :  2016-04-28  15:29
 * author      :  Mickaecle gizthon
 * description :
 */
public class AppContext extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        LeakCanary.install(this);
    }
}
