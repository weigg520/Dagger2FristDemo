package weizhengzhou.top.dagger2fristdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import javax.inject.Inject;
import javax.inject.Named;

import weizhengzhou.top.dagger2fristdemo.Demo.Cloth;
import weizhengzhou.top.dagger2fristdemo.Demo.ClothHandler;
import weizhengzhou.top.dagger2fristdemo.Demo.Component.DaggerSecondComponent;
import weizhengzhou.top.dagger2fristdemo.Demo.Component.SecondComponent;
import weizhengzhou.top.dagger2fristdemo.Demo.Module.SecondModule;

public class Main2Activity extends AppCompatActivity {
    private TextView mTextView;
    @Inject
    @Named("blue")
    Cloth blueCloth;
    @Inject
    ClothHandler mClothHandler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        mTextView = (TextView)findViewById(R.id.textTest2);
        SecondComponent build = DaggerSecondComponent
                .builder()
                .baseComponent(((MyApplication)getApplication()).getBaseComponent())
                .secondModule(new SecondModule())
                .build();
        build.inject(Main2Activity.this);
        mTextView.setText("" + blueCloth + "做" + mClothHandler.handle(blueCloth) + "ClothHandler类地址" + mClothHandler);
    }
}
