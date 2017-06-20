package weizhengzhou.top.dagger2fristdemo.Demo.Subcomponent;

import dagger.Subcomponent;
import weizhengzhou.top.dagger2fristdemo.Demo.Module.MainModule;
import weizhengzhou.top.dagger2fristdemo.Demo.Scope.PerActivity;
import weizhengzhou.top.dagger2fristdemo.MainActivity;

/**
 * Created by 75213 on 2017/6/20.
 */

@PerActivity
@Subcomponent(modules = MainModule.class)
public interface SubMainComponent {
    void inject(MainActivity activity);
}
