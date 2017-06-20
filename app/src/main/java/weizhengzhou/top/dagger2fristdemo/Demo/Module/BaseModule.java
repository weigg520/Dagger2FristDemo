package weizhengzhou.top.dagger2fristdemo.Demo.Module;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import weizhengzhou.top.dagger2fristdemo.Demo.ClothHandler;

/**
 * Created by 75213 on 2017/6/20.
 */

@Module
public class BaseModule {
    @Singleton
    @Provides
    public ClothHandler getClothHandler(){
        return new ClothHandler();
    }
}
