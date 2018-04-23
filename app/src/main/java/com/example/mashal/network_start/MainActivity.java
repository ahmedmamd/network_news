package com.example.mashal.network_start;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.example.mashal.network_start.api.ApiService;
import com.example.mashal.network_start.model.ArticlesItem;
import com.example.mashal.network_start.model.Articles;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    ArrayList<ArticlesItem> data;
    adapter products;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        data = new ArrayList<>();
        recyclerView = (RecyclerView) findViewById(R.id.recycel);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        products = new adapter(data, getBaseContext());
        recyclerView.setAdapter(products);
        requestData();
    }

    private void requestData() {
        final String TAG="requestdata";
        Call<Articles> call =  ApiService.getInstance().createRetrofit()
                .getTopHeadLines("sports");

        call.enqueue(new Callback<Articles>() {
            @Override
            public void onResponse(Call<Articles> call, Response<Articles> response) {
                String status = response.body().getStatus();
                if (status.equalsIgnoreCase("ok")) {
                    List<ArticlesItem> articlesItems = response.body().getArticles();
                    data.addAll(articlesItems);
                 products.notifyDataSetChanged();
            }}

            @Override
            public void onFailure(Call<Articles> call, Throwable t) {
                Log.e(TAG, "onFailure: " );
            }});
 }}


