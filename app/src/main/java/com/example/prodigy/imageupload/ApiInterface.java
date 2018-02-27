package com.example.prodigy.imageupload;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * Created by prodigy on 20/2/18.
 */

public interface ApiInterface {

    @FormUrlEncoded
    @POST("index.php")
    Call<ImageClass> uploadImage(@Field("Image") String Image);
}
