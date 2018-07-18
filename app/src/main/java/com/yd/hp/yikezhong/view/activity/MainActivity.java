package com.yd.hp.yikezhong.view.activity;

import android.graphics.Color;
import android.os.Bundle;

import com.hjm.bottomtabbar.BottomTabBar;
import com.yd.hp.yikezhong.R;
import com.yd.hp.yikezhong.view.fragment.FragmentDuanZi;
import com.yd.hp.yikezhong.view.fragment.FragmentRecommend;
import com.yd.hp.yikezhong.view.fragment.FragmentVideo;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends BaseActivity {

    @BindView(R.id.bottomtabbar)
    BottomTabBar bottomtabbar;

    @Override
    protected void initData() {
        bottomtabbar.init(getSupportFragmentManager())
                .setChangeColor(Color.BLUE, Color.GRAY)
                .setImgSize(40, 40)
                .setFontSize(15)
                .addTabItem("推荐", R.mipmap.raw_1500085367, R.mipmap.raw_1500083878, FragmentRecommend.class)
                .addTabItem("段子", R.mipmap.raw_1500085899, R.mipmap.raw_1500085327, FragmentDuanZi.class)
                .addTabItem("视频", R.mipmap.raw_1500086067, R.mipmap.raw_1500083686, FragmentVideo.class)
                .isShowDivider(false);
    }

    @Override
    protected int initLayout() {
        return R.layout.activity_main;
    }

}
