package weizhengzhou.top.dagger2fristdemo.Demo;

import javax.inject.Inject;

/**
 * Created by 75213 on 2017/6/20.
 * 构造器
 */

public class Shop {
    @Inject
   public Shop(){

   }

    @Override
    public String toString() {
        return "鞋子";
    }
}
