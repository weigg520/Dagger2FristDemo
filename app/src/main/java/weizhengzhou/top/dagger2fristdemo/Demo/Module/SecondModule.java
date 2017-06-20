package weizhengzhou.top.dagger2fristdemo.Demo.Module;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;
import weizhengzhou.top.dagger2fristdemo.Demo.Cloth;

/**
 * Created by 75213 on 2017/6/20.
 */

@Module
public class SecondModule {
    @Provides
    @Named("blue")
    public Cloth getBlueCloth() {
        Cloth cloth = new Cloth();
        cloth.setColor("蓝色");
        return cloth;
    }

}
