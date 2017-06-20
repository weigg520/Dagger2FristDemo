package weizhengzhou.top.dagger2fristdemo.Demo;

/**
 * Created by 75213 on 2017/6/20.
 */

public class ClothHandler {
    public Clothes handle(Cloth cloth){
        return new Clothes(cloth);
    }
}
