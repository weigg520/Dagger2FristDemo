package weizhengzhou.top.dagger2fristdemo.Demo.Component;

import dagger.Component;
import weizhengzhou.top.dagger2fristdemo.Demo.Module.SecondModule;
import weizhengzhou.top.dagger2fristdemo.Demo.Scope.PerActivity;
import weizhengzhou.top.dagger2fristdemo.Main2Activity;

/**
 * Created by 75213 on 2017/6/20.
 */

@PerActivity
@Component(modules = SecondModule.class , dependencies = BaseComponent.class)
public interface SecondComponent {
    void inject(Main2Activity main2Activity);
}
