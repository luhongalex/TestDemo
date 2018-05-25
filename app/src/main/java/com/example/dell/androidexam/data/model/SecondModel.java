package com.example.dell.androidexam.data.model;

import android.content.Context;

import com.example.dell.androidexam.data.bean.Content;

/**
 * Created by DELL
 * on 2018/5/25.
 * at 北京
 */
public interface SecondModel {
    void setData(Context context, String id, String key, String userId, setonClick setonClick);
    interface setonClick{
        void showData(Content body);
    }
}
