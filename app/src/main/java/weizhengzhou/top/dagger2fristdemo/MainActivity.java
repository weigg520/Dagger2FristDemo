package weizhengzhou.top.dagger2fristdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Provider;

import dagger.Lazy;
import weizhengzhou.top.dagger2fristdemo.Demo.Cloth;
import weizhengzhou.top.dagger2fristdemo.Demo.ClothHandler;
import weizhengzhou.top.dagger2fristdemo.Demo.Clothes;
import weizhengzhou.top.dagger2fristdemo.Demo.Module.MainModule;
import weizhengzhou.top.dagger2fristdemo.Demo.Qualifier.RedCloth;
import weizhengzhou.top.dagger2fristdemo.Demo.Shop;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    private TextView mTextView;
    private Button mButton;
    @Inject
    Lazy<Cloth> mCloth;
    @Inject
    Provider<Shop> mShop;
    @Inject
    Clothes mClothes;
    @Inject
    @RedCloth
    Cloth redCloth;
    @Inject
    @Named("blue")
    Cloth blueCloth;
    @Inject
    ClothHandler mClothHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTextView = (TextView)findViewById(R.id.testText);
        mButton = (Button)findViewById(R.id.buttonTest);
        /*MainComponent build = DaggerMainComponent
                .builder()
                .baseComponent(((MyApplication)getApplication()).getBaseComponent())
                .mainModule(new MainModule())
                .build();
        build.inject(MainActivity.this);*/
        //mTextView.setText("我现在有" + mCloth + "和" + mShop + "和" + mClothes);
        //mTextView.setText("我现在有" + (mCloth == mClothes.getCloth()));

        MyApplication application = (MyApplication)getApplication();
        application.getBaseComponent().getSubMainComponent(new MainModule()).inject(this);
        mTextView.setText(redCloth + "做" + mClothHandler.handle(redCloth) + "ClothHandler类地址" + mClothHandler);
        Log.d(TAG, "inject done ...");
        Log.d(TAG, "1 use redCloth instance ..");
        Log.d(TAG, "redCloth:" + mCloth.get());
        Log.d(TAG, "2 use redCloth instance ..");
        Log.d(TAG, "redCloth:" + mCloth.get());
        Log.d(TAG, "1 use shoe instance ..");
        Log.d(TAG, "shoe:" + mShop.get());
        Log.d(TAG, "2 use shoe instance ..");
        Log.d(TAG, "shoe:" + mShop.get());
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this , Main2Activity.class));
            }
        });
    }
}
