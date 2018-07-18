package com.yd.hp.yikezhong.util.application;

import android.app.Application;

import com.facebook.drawee.backends.pipeline.Fresco;
import com.yd.hp.yikezhong.util.constant.DensityHelper;

import butterknife.ButterKnife;

public class MyApplication extends Application {
    private int DESIGN_WIDTH = 1080;
    @Override
    public void onCreate() {
        super.onCreate();
        Fresco.initialize(this);
        new DensityHelper(this, DESIGN_WIDTH).activate();  //DESIGN_WIDTH为设计图宽度，同样不要忘记清单文件配置Application，另 布局中使用pt
    }
}
