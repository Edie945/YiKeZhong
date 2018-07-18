package com.yd.hp.yikezhong.view.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.yd.hp.yikezhong.R;

import java.util.ArrayList;
import java.util.List;

import butterknife.OnClick;
import butterknife.Unbinder;

public class FragmentVideo extends Fragment {
    /*   @BindView(R.id.bianji_tuijian)
       ImageView bianji_tuijian;
       @BindView(R.id.tablayout_video)
       TabLayout tablayout_video;
       @BindView(R.id.vp_video)
       ViewPager vp_video;*/
    private View view;
    private Unbinder unbinder;
    String[] strings = {"热门", "附近"};
    private List<Fragment> fragments = new ArrayList<>();
    Context context;
    private ImageView bianji_tuijian;
    private TabLayout tablayout_video;
    private ViewPager vp_video;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = View.inflate(getContext(), R.layout.fragment_video, null);

//        initTabLayout();

        initView(view);
        return view;
    }

    private void initTabLayout() {
//        tablayout_video.setupWithViewPager(vp_video);

        for (int i = 0; i < strings.length; i++) {
            tablayout_video.addTab(tablayout_video.newTab().setText(strings[i]));
            fragments.add(new FragmentReMen());
        }

        MyAdapter myAdapter = new MyAdapter();
        vp_video.setAdapter(myAdapter);
        /*vp_video.setAdapter(new FragmentPagerAdapter(getChildFragmentManager()) {
            @Override
            public Fragment getItem(int position) {
                return fragments.get(position);
            }

            @Override
            public int getCount() {
                return fragments.size();
            }

            @Override
            public CharSequence getPageTitle(int position) {
                return strings[position];
            }
        });*/
    }

    @OnClick(R.id.bianji_tuijian)
    public void onClick(View v) {
        switch (v.getId()) {
            default:
                break;
            case R.id.bianji_tuijian:

                break;
        }
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }

    private void initView(View view) {
        bianji_tuijian = (ImageView) view.findViewById(R.id.bianji_tuijian);
        tablayout_video = (TabLayout) view.findViewById(R.id.tablayout_video);
        vp_video = (ViewPager) view.findViewById(R.id.vp_video);
    }

    class MyAdapter extends PagerAdapter {

        @Override
        public int getCount() {
            return strings.length;
        }

        @Override
        public boolean isViewFromObject(View view, Object object) {
            return view == object;
        }

        @Override
        public Object instantiateItem(ViewGroup container, int position) {
            ImageView imageView = new ImageView(getContext());
            imageView.setBackgroundResource(R.mipmap.erweima);
            container.addView(imageView);
            return imageView;
        }

        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {
            container.removeView((View) object);
        }
    }
}
