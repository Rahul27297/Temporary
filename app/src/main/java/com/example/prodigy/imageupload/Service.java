package com.example.prodigy.imageupload;

import okhttp3.MultipartBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

/**
 * Created by prodigy on 21/2/18.
 */

public interface Service {
    @Multipart
    @POST("/")
    Call<ResponseBody> postImage(@Part MultipartBody.Part image);
}
