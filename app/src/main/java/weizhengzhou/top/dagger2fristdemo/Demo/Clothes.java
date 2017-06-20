package weizhengzhou.top.dagger2fristdemo.Demo;

/**
 * Created by 75213 on 2017/6/20.
 */

public class Clothes {
    private Cloth mCloth;
    public Clothes(Cloth cloth){
        mCloth = cloth;
    }

    public Cloth getCloth() {
        return mCloth;
    }

    @Override
    public String toString() {
        return mCloth.getColor() + "衣服";
    }
}
