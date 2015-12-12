package com.mapbox.reactnativemapboxgl;

import android.content.Context;
import android.util.Log;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.mapbox.mapboxsdk.views.MapView;

public class ReactNativeMapboxGLModule extends ReactContextBaseJavaModule {

    private static final String TAG = ReactNativeMapboxGLModule.class.getSimpleName();

    private Context context;
    private ReactNativeMapboxGLPackage aPackage;

    public ReactNativeMapboxGLModule(ReactApplicationContext reactContext) {
        super(reactContext);
        this.context = reactContext;
        Log.d(TAG, "Context " + context);
        Log.d(TAG, "reactContext " + reactContext);
    }

    @Override
    public String getName() {
        return "Mapbox";
    }

    @ReactMethod
    public void setDirection() {
        aPackage.getManager().setDirection(aPackage.getManager().getMapView(),0.0f);
    }

    public void setPackage(ReactNativeMapboxGLPackage aPackage) {
        this.aPackage = aPackage;
    }
//
//    @ReactMethod
//    public void setCancelable(boolean cancelable) {
//        this.progressDialog.setCancelable(cancelable);
//    }
//
//    @ReactMethod
//    public void setProgressStyle(int progressStyle) {
//        this.progressDialog.setProgressStyle(progressStyle);
//    }
//
//    @ReactMethod
//    public void setProgress(int progress) {
//        this.progressDialog.setProgress(progress);
//    }
//
//    @ReactMethod
//    public void setMax(int max) {
//        this.progressDialog.setMax(max);
//    }
//
//    @ReactMethod
//    public void show() {
//        this.progressDialog.show();
//    }
//
//    @ReactMethod
//    public void dismiss() {
//        this.progressDialog.dismiss();
//    }
}