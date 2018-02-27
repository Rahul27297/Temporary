package com.example.prodigy.imageupload;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by prodigy on 20/2/18.
 */

public class ApiClient {
    private static final String BaseUrl = "http://192.168.1.3/Travelate/";
    private static Retrofit retrofit;

    public static Retrofit getApiClient(){
        if(retrofit == null){
            retrofit = new Retrofit.Builder().baseUrl(BaseUrl).addConverterFactory(GsonConverterFactory.create()).build();
        }
        return  retrofit;
    }
}
