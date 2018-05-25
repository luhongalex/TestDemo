package com.example.dell.androidexam.data.model;

import com.example.dell.androidexam.data.api.ApiService;
import com.example.dell.androidexam.data.bean.Login;
import com.google.gson.Gson;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by DELL
 * on 2018/5/25.
 * at 北京
 */
public class BaseModelImpl implements BaseModel {
    @Override
    public void setData(final setonChanged setonChanged) {
         Retrofit retrofit = new Retrofit.Builder()
                         .baseUrl("http://test.8lingling.com/")
                         .addConverterFactory(GsonConverterFactory.create(new Gson()))
                         .build();
                 ApiService apiService = retrofit.create(ApiService.class);
                 Call<Login> videoData = apiService.getData();
                 videoData.enqueue(new Callback<Login>() {
                     @Override
                     public void onResponse(Call<Login> call, Response<Login> response) {
                         Login body = response.body();
                         setonChanged.showData(body);
                     }

                     @Override
                     public void onFailure(Call<Login> call, Throwable t) {

                     }
                 });
    }
}
