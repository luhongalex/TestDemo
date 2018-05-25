package com.example.dell.androidexam.ui.activity;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.dell.androidexam.R;
import com.example.dell.androidexam.data.bean.Bean;
import com.example.dell.androidexam.data.bean.Login;
import com.example.dell.androidexam.presenter.IContract.IContrct;
import com.example.dell.androidexam.presenter.impl.BasePresenterImpl;

import org.greenrobot.eventbus.EventBus;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

//我是物联网H1709A班路宏正在考A场
public class MainActivity extends AppCompatActivity implements IContrct.FristView{

    @BindView(R.id.mphong_edit)
    EditText mphongEdit;
    @BindView(R.id.mPsw_Edit)
    EditText mPswEdit;
    @BindView(R.id.mWang)
    Button mWang;
    @BindView(R.id.mLogin)
    Button mLogin;
    private IContrct.FristPrsenter basePresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
         new BasePresenterImpl(this);
    }


    @OnClick({R.id.mWang, R.id.mLogin})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.mWang:

                break;
            case R.id.mLogin:
                if (mphongEdit.getText().toString().equals("13252028551")&&mPswEdit.getText().toString().equals("123456")){
                    basePresenter.setPresenter();
                    startActivity(new Intent(MainActivity.this,Main2Activity.class));
                }
                break;
        }
    }

    @Override
    public void UpData(Login body) {
        Log.e("aa",body.toString());
        String id = body.org.get(0).getId();
        String userId = body.user.userId;
        String key = body.user.key;
        Log.e("tag",id+"-------"+userId+"----------"+key);
        Bean bean = new Bean(id, userId, key);
        EventBus.getDefault().postSticky(bean);
    }

    @Override
    public void setPresenter(BasePresenterImpl basePresenter) {
        this.basePresenter = basePresenter;
    }
}
