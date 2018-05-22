package com.example.xiaolitongxue.wieying.view;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.xiaolitongxue.wieying.R;
import com.example.xiaolitongxue.wieying.view.custom.ResideLayout;
import com.example.xiaolitongxue.wieying.view.fragment.ChoicenessFragment;
import com.example.xiaolitongxue.wieying.view.fragment.FindFragment;
import com.example.xiaolitongxue.wieying.view.fragment.MyFragment;
import com.example.xiaolitongxue.wieying.view.fragment.SpecialFragment;
import com.hjm.bottomtabbar.BottomTabBar;
import com.makeramen.roundedimageview.RoundedImageView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends BaseActivity implements View.OnClickListener{

    @BindView(R.id.bottom_tabbar)
    BottomTabBar bottomTabbar;
    @BindView(R.id.resideLayout)
    ResideLayout residlayout;
    @BindView(R.id.avatar)
    RoundedImageView avatar;
    @BindView(R.id.desc)
    TextView desc;
    @BindView(R.id.tv_collect)
    TextView tvCollect;
    @BindView(R.id.tv_mydown)
    TextView tvMydown;
    @BindView(R.id.tv_fuli)
    TextView tvFuli;
    @BindView(R.id.tv_share)
    TextView tvShare;
    @BindView(R.id.tv_feedback)
    TextView tvFeedback;
    @BindView(R.id.tv_setting)
    TextView tvSetting;
    @BindView(R.id.about)
    TextView about;
    @BindView(R.id.theme)
    TextView theme;

    @Override
    void initView() {
        //初始化控件
    }

    @Override
    void initData() {
        //初始化数据
        avatar.setOnClickListener(this);
        desc.setOnClickListener(this);
        tvCollect.setOnClickListener(this);
        tvMydown.setOnClickListener(this);
        tvFuli.setOnClickListener(this);
        tvShare.setOnClickListener(this);
        tvFeedback.setOnClickListener(this);
        tvSetting.setOnClickListener(this);
        about.setOnClickListener(this);
        theme.setOnClickListener(this);

        bottomTabbar.init(getSupportFragmentManager())
                .setImgSize(60, 60)
                .setFontSize(14)
                .setTabPadding(50 / 2, 0, 0)
                .setChangeColor(Color.RED, Color.DKGRAY)
                .setTabBarBackgroundResource(R.drawable.bottom_bg)
                .addTabItem("精选", R.drawable.found_select, R.drawable.found, ChoicenessFragment.class)
                .addTabItem("专题", R.drawable.special_select, R.drawable.special, SpecialFragment.class)
                .addTabItem("发现", R.drawable.fancy_select, R.drawable.fancy, FindFragment.class)
                .addTabItem("我的", R.drawable.my_select, R.drawable.my, MyFragment.class)
//                .setTabPadding(20,6,10)


                .setOnTabChangeListener(new BottomTabBar.OnTabChangeListener() {
                    @Override
                    public void onTabChange(int position, String name) {

                    }
                });

    }

    @Override
    int getLayout() {
        return R.layout.activity_main;
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.avatar:
              Toast.makeText(MainActivity.this,"我是头像",Toast.LENGTH_SHORT).show();
                break;
            case R.id.desc:
              //微影，微一下

                break;
            case R.id.tv_collect:
             //收藏

                break;
            case R.id.tv_mydown:
             //下载
                break;
            case R.id.tv_fuli:
             //福利
                break;
            case R.id.tv_share:
             //分享
                break;
            case R.id.tv_feedback:
             //建议反馈
                break;
            case R.id.tv_setting:
             //设置
                break;
            case R.id.about:
             //关于
                break;
            case R.id.theme:
             //主题
                break;

        }
    }
}
