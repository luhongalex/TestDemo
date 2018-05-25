package com.example.dell.androidexam.presenter.impl;

import android.content.Context;

import com.example.dell.androidexam.data.bean.Content;
import com.example.dell.androidexam.data.model.SecondModel;
import com.example.dell.androidexam.data.model.SecondModelImpl;
import com.example.dell.androidexam.presenter.IContract.IContrct;

/**
 * Created by DELL
 * on 2018/5/25.
 * at 北京
 */
public class SecondPresenterImpl implements IContrct.SecondPresenter{
    private IContrct.SecondView secondView;
    private SecondModel model;
    public SecondPresenterImpl(IContrct.SecondView secondView) {
        this.secondView = secondView;
        secondView.setPresenter(this);
        model = new SecondModelImpl();
    }

    @Override
    public void setPresenter(String id, String key, String userId, Context context) {
        model.setData(context,id,key,userId,new SecondModel.setonClick() {
            @Override
            public void showData(Content body) {
                secondView.setUpadateUI(body);
            }
        });
    }
}
