package com.example.dell.androidexam.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;

import com.example.dell.androidexam.R;
import com.example.dell.androidexam.ui.fragment.AFragment;
import com.example.dell.androidexam.ui.fragment.BFragment;
import com.umeng.socialize.UMShareAPI;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class Main2Activity extends AppCompatActivity {

    @BindView(R.id.mFrame)
    FrameLayout mFrame;
    @BindView(R.id.mTeach)
    ImageView mTeach;
    @BindView(R.id.mInfo)
    ImageView mInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ButterKnife.bind(this);
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.add(R.id.mFrame,new AFragment());
        transaction.addToBackStack(null);
        transaction.commit();
        mTeach.setImageDrawable(getResources().getDrawable(R.drawable.tab_teach_blue));
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        UMShareAPI.get(this).onActivityResult(requestCode, resultCode, data);
    }

    @OnClick({R.id.mTeach, R.id.mInfo})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.mTeach:
                initstart();
                mTeach.setImageDrawable(getResources().getDrawable(R.drawable.tab_teach_blue));
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.mFrame,new AFragment());
                transaction.addToBackStack(null);
                transaction.commit();
                break;
            case R.id.mInfo:
                initstart();
                mInfo.setImageDrawable(getResources().getDrawable(R.drawable.tab_info_blue));
                FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.mFrame,new BFragment());
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
                break;
        }
    }
    private void initstart(){
        mTeach.setImageDrawable(getResources().getDrawable(R.drawable.tab_teach_gray));
        mInfo.setImageDrawable(getResources().getDrawable(R.drawable.tab_info_gray));
    }
}
