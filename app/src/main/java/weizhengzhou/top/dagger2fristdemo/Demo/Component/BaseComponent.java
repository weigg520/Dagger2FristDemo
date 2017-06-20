package weizhengzhou.top.dagger2fristdemo.Demo.Component;

import javax.inject.Singleton;

import dagger.Component;
import weizhengzhou.top.dagger2fristdemo.Demo.ClothHandler;
import weizhengzhou.top.dagger2fristdemo.Demo.Module.BaseModule;
import weizhengzhou.top.dagger2fristdemo.Demo.Module.MainModule;
import weizhengzhou.top.dagger2fristdemo.Demo.Subcomponent.SubMainComponent;

/**
 * Created by 75213 on 2017/6/20.
 */

@Singleton
@Component(modules = BaseModule.class)
public interface BaseComponent {
    ClothHandler getClothHandler();

    SubMainComponent getSubMainComponent(MainModule module);
}
