package com.mmbox.myapplication;

import android.app.Application;

import com.alipay.euler.andfix.patch.PatchManager;

/**
 * Created by admin on 2016/10/11.
 */
public class MyApp extends Application {
    public PatchManager mPatchManager;
    @Override
    public void onCreate() {
        super.onCreate();
        mPatchManager = new PatchManager(this);
        mPatchManager.init("1.0");
        mPatchManager.loadPatch();
    }
}
