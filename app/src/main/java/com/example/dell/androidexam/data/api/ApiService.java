package com.example.dell.androidexam.data.api;

import com.example.dell.androidexam.data.bean.Content;
import com.example.dell.androidexam.data.bean.Login;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

/**
 * Created by DELL
 * on 2018/5/25.
 * at 北京
 */
public interface ApiService {
    @GET("ms/service/loginOrg?phone=13252028551&password=123456")
    Call<Login> getData();
    @FormUrlEncoded
    @POST("ms/service/getIndexNews2")
    Call<Content> getData2(@Field("orgId")String id,@Field("key")String key,@Field("userId")String userid);
}
