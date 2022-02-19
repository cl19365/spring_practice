package org.javaboy.ioc;

import okhttp3.OkHttpClient;
/*
实例工厂
 */
public class OkHttpFactory {
    private OkHttpClient okHttpClient;
    public OkHttpClient getInstance(){
        if(okHttpClient==null){
            okHttpClient=new OkHttpClient.Builder().build();
        }
        return okHttpClient;
    }
}
