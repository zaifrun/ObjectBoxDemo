package org.webdevelopment.objectboxdemo;

import android.app.Application;

import io.objectbox.BoxStore;

/**
 * Created by makn on 07-04-2017.
 */

public class MyApplication extends Application {

    private BoxStore boxStore;


    @Override
    public void onCreate() {
        super.onCreate();



// do this once, for example in your Application class
        boxStore = MyObjectBox.builder().androidContext(MyApplication.this).build();
  }

    public BoxStore getBoxStore() {
        return boxStore;
    }

}
