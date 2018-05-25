package com.example.dell.androidexam.data.bean;

/**
 * Created by DELL
 * on 2018/5/25.
 * at 北京
 */
public class Bean {
    String id ;
    String userId;
    String key;

    public Bean() {
    }

    public Bean(String id, String userId, String key) {
        this.id = id;
        this.userId = userId;
        this.key = key;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
