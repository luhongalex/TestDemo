package com.example.dell.androidexam.presenter.impl;

import com.example.dell.androidexam.data.bean.Login;
import com.example.dell.androidexam.data.model.BaseModel;
import com.example.dell.androidexam.data.model.BaseModelImpl;
import com.example.dell.androidexam.presenter.IContract.IContrct;

/**
 * Created by DELL
 * on 2018/5/25.
 * at 北京
 */
public class BasePresenterImpl implements IContrct.FristPrsenter {
    private IContrct.FristView fristView;
    private BaseModel model;
    public BasePresenterImpl(IContrct.FristView fristView) {
        this.fristView = fristView;
        fristView.setPresenter(this);
        model = new BaseModelImpl();
    }

    @Override
    public void setPresenter() {
        model.setData(new BaseModel.setonChanged() {
            @Override
            public void showData(Login body) {
                fristView.UpData(body);
            }
        });
    }
}
