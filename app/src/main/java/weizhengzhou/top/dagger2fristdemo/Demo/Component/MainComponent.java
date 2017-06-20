package weizhengzhou.top.dagger2fristdemo.Demo.Component;

import dagger.Component;
import weizhengzhou.top.dagger2fristdemo.Demo.Module.MainModule;
import weizhengzhou.top.dagger2fristdemo.Demo.Scope.PerActivity;
import weizhengzhou.top.dagger2fristdemo.MainActivity;

/**
 * Created by 75213 on 2017/6/20.
 */

@PerActivity
@Component(modules = MainModule.class , dependencies = BaseComponent.class)
public interface MainComponent {
    void inject(MainActivity mainActivity);
}
