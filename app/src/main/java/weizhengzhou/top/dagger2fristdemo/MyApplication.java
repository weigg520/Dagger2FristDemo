package weizhengzhou.top.dagger2fristdemo;

import android.app.Application;

import weizhengzhou.top.dagger2fristdemo.Demo.Component.BaseComponent;
import weizhengzhou.top.dagger2fristdemo.Demo.Component.DaggerBaseComponent;
import weizhengzhou.top.dagger2fristdemo.Demo.Module.BaseModule;

/**
 * Created by 75213 on 2017/6/20.
 */

public class MyApplication extends Application {
    private BaseComponent mBaseComponent;
    @Override
    public void onCreate() {
        super.onCreate();
        mBaseComponent  = DaggerBaseComponent.builder().baseModule(new BaseModule()).build();
    }

    public BaseComponent getBaseComponent(){
        return mBaseComponent;
    }
}
