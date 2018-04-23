package com.example.mashal.network_start.api;

import com.example.mashal.network_start.model.Articles;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by mashal on 2018-03-18.
 */
public interface myapi {
    @GET("v2/top-headlines?apiKey="+ApiService.apiKey)
    Call<Articles> getTopHeadLines(@Query("category") String category);

}


