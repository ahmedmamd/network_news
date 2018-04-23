package com.example.mashal.network_start.api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by mashal on 2018-03-18.
 */
public class ApiService {




        private static String baseUrl = "https://newsapi.org/";
        public static final String apiKey = "0ac3806da6bd415d9bd46374204cb84d";
        private static ApiService instance = null;

        public static ApiService getInstance(){
            if (instance == null){
                instance = new ApiService();
            }

            return instance;
        }

        private ApiService(){}

        public myapi createRetrofit(){
            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl(baseUrl)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();

            return retrofit.create(myapi.class);
        }
    }


