package weizhengzhou.top.dagger2fristdemo.Demo;

/**
 * Created by 75213 on 2017/6/20.
 * 写一个Cloth类用作依赖对象,它包含一个color属性
 */

public class Cloth {
    private String Color ;

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    @Override
    public String toString() {
        return Color + "布料";
    }
}
