package weizhengzhou.top.dagger2fristdemo.Demo.Module;


import android.util.Log;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;
import weizhengzhou.top.dagger2fristdemo.Demo.Cloth;
import weizhengzhou.top.dagger2fristdemo.Demo.Clothes;
import weizhengzhou.top.dagger2fristdemo.Demo.Qualifier.RedCloth;
import weizhengzhou.top.dagger2fristdemo.Demo.Scope.PerActivity;
import weizhengzhou.top.dagger2fristdemo.Demo.Shop;

/**
 * Created by 75213 on 2017/6/20.
 * 现在的需求是MainActivity中需要使用到Cloth对象,所以我们要为MainActivity书写一个Module类用来提供Cloth对象,相当于创建了一个提供商
 */


/**
 *  @Module以表明该类是Module类,这样Dagger2才能识别
 */

@Module
public class MainModule {
    private static final String TAG = "MainModule";
    @PerActivity
    @Provides
    public Cloth getColor(){
        Log.d(TAG, "getRedCloth: ...");
        Cloth cloth = new Cloth();
        cloth.setColor("红色");
        return cloth;
    }

    @Provides
    @RedCloth
    public Cloth getRedCloth(){
        Cloth cloth = new Cloth();
        cloth.setColor("红色");
        return cloth;
    }

    @Provides
    @Named("blue")
    public Cloth getBlueCloth() {
        Cloth cloth = new Cloth();
        cloth.setColor("蓝色");
        return cloth;
    }

    @Provides
    public Clothes getClothes(Cloth cloth){
        return new Clothes(cloth);
    }

    @PerActivity
    @Provides
    public Shop getShop(){
        Log.d(TAG, "getShoe: ...");
        return new Shop();
    }

}
