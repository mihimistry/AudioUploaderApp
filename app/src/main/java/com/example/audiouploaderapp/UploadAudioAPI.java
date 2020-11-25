package com.example.audiouploaderapp;

import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

public interface UploadAudioAPI {
    String BASE_URL = "http://192.168.43.51/audiouploader/";

    @Multipart
    @POST("upload_audio.php?apicall=upload")
    Call<ResponseBody> uploadAudio(@Part("desc") RequestBody desc,
                                   @Part MultipartBody.Part file);
}
