package com.example.dell.androidexam.data.model;

import android.content.Context;
import android.widget.Toast;

import com.example.dell.androidexam.data.api.ApiService;
import com.example.dell.androidexam.data.bean.Content;
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
public class SecondModelImpl implements SecondModel{
    @Override
    public void setData(final Context context, String id, String key, String userId, final setonClick setonClick) {
         Retrofit retrofit = new Retrofit.Builder()
                         .baseUrl("http://test.8lingling.com/")
                         .addConverterFactory(GsonConverterFactory.create(new Gson()))
                         .build();
        ApiService apiService = retrofit.create(ApiService.class);
                Call<Content> data2 = apiService.getData2(id,key,userId);
                data2.enqueue(new Callback<Content>() {
                    @Override
                    public void onResponse(Call<Content> call, Response<Content> response) {
                        Toast.makeText(context, response.body().toString(), Toast.LENGTH_SHORT).show();
                        Content body = response.body();
                        setonClick.showData(body);
                    }

                    @Override
                    public void onFailure(Call<Content> call, Throwable t) {

                    }
                });
    }
}
