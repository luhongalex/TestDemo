package com.example.dell.androidexam.ui.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.dell.androidexam.R;
import com.example.dell.androidexam.data.bean.Bean;
import com.example.dell.androidexam.data.bean.Content;
import com.example.dell.androidexam.presenter.IContract.IContrct;
import com.example.dell.androidexam.presenter.impl.SecondPresenterImpl;
import com.example.dell.androidexam.ui.activity.MainActivity;
import com.umeng.socialize.ShareAction;
import com.umeng.socialize.bean.SHARE_MEDIA;
import com.umeng.socialize.media.UMImage;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;

/**
 * A simple {@link Fragment} subclass.
 */
public class BFragment extends Fragment implements IContrct.SecondView {


    @BindView(R.id.mShare)
    ImageView mShare;
    Unbinder unbinder;
    private SecondPresenterImpl secondPresenter;

    public BFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View inflate = inflater.inflate(R.layout.fragment_b, container, false);
        unbinder = ButterKnife.bind(this, inflate);
        secondPresenter = new SecondPresenterImpl(this);

        return inflate;
    }

    @Override
    public void onStart() {
        super.onStart();
        EventBus.getDefault().register(this);
    }

    @Subscribe(threadMode = ThreadMode.MAIN, sticky = true)
    public void onMessageEvent(Bean event) {/* Do something */
        String id = event.getId();
        String key = event.getKey();
        String userId = event.getUserId();
        Log.e("tag",id+"-------"+userId+"----------"+key);
        secondPresenter.setPresenter(id, key, userId, getContext());
    }

    @Override
    public void onStop() {
        super.onStop();
        EventBus.getDefault().unregister(this);
    }

    @Override
    public void setUpadateUI(Content body) {
        Log.e("tag",body.toString());
        Toast.makeText(getContext(), body.toString(), Toast.LENGTH_SHORT).show();
    }

    @Override
    public void setPresenter(SecondPresenterImpl secondPresenter) {
        this.secondPresenter = secondPresenter;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }

    @OnClick(R.id.mShare)
    public void onViewClicked() {
        UMImage umImage = new UMImage(getContext(), R.mipmap.ic_launcher);
        new ShareAction(getActivity()).withText("hello")
                .setDisplayList(SHARE_MEDIA.SINA,SHARE_MEDIA.QQ)
                .withMedia(umImage)
                .open();
    }
}
