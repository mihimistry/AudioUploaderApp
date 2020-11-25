package com.example.audiouploaderapp;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class APIObject {
    public static UploadAudioAPI uploadAudioAPI;

    public static UploadAudioAPI getInstance() {
        if (uploadAudioAPI == null) {
            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl(UploadAudioAPI.BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
            uploadAudioAPI = retrofit.create(UploadAudioAPI.class);
        }
        return uploadAudioAPI;
    }
}
