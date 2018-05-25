package com.example.dell.androidexam.ui.activity;

import android.app.Application;

import com.umeng.commonsdk.UMConfigure;
import com.umeng.socialize.PlatformConfig;

/**
 * Created by DELL
 * on 2018/5/24.
 * at 北京
 */
public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        UMConfigure.init(this,"5b069a3cf29d987db10000b3"
                ,"umeng",UMConfigure.DEVICE_TYPE_PHONE,"");//58edcfeb310c93091c000be2 5965ee00734be40b580001a0
        PlatformConfig.setSinaWeibo("4149350320", "874047b8aceb435144afacd1e376df2f","http://sns.whalecloud.com/sina2/callback");
        PlatformConfig.setQQZone("1106769767", "4zXpGAfrRV2EyAuB");
    }
}
