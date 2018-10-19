package com.photo_editor_android_ui;

import android.app.Application;
import android.os.StrictMode;

/**
 * Created by divyanshunegi on 19/10/18.
 * Project : photoeditorandroidui
 */
public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        StrictMode.VmPolicy.Builder builder = new StrictMode.VmPolicy.Builder();
        StrictMode.setVmPolicy(builder.build());
    }
}
