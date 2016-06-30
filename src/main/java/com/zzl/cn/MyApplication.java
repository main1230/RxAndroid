package com.zzl.cn;

import android.app.Application;

/**
 * Created by: zzl.
 * describe:
 * date: 2016/6/30.
 */
public class MyApplication extends Application {
    private static MyApplication mInstance;

    public static MyApplication getInstance() {
        return mInstance;
    }

    @Override
    public void onCreate() {
        super.onCreate();

        mInstance = this;
    }
}
