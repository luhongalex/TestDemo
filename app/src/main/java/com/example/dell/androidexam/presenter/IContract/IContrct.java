package com.example.dell.androidexam.presenter.IContract;

import android.content.Context;

import com.example.dell.androidexam.data.bean.Content;
import com.example.dell.androidexam.data.bean.Login;
import com.example.dell.androidexam.presenter.BasePresenter;
import com.example.dell.androidexam.presenter.SecondPreesenter;
import com.example.dell.androidexam.ui.BaseView;

/**
 * Created by DELL
 * on 2018/5/25.
 * at 北京
 */
public interface IContrct {
    interface FristPrsenter extends BasePresenter{
        void setPresenter();
    }
    interface FristView extends BaseView{
        void UpData(Login body);
    }
    interface SecondPresenter extends SecondPreesenter{
        void setPresenter(String id, String key, String userId, Context context);
    }
    interface SecondView extends com.example.dell.androidexam.ui.SecondView{
        void setUpadateUI(Content body);
    }
}
