package com.example.dell.androidexam.data.model;

import com.example.dell.androidexam.data.bean.Login;

/**
 * Created by DELL
 * on 2018/5/25.
 * at 北京
 */
public interface BaseModel {
    void setData(setonChanged setonChanged);
    interface setonChanged{
        void showData(Login body);
    }
}
