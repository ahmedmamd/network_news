package com.example.mashal.network_start.model;


import java.util.List;
import com.google.gson.annotations.SerializedName;


public class Articles {

	@SerializedName("articles")
	private List<ArticlesItem> articles;

	@SerializedName("totalResults")
	private int totalResults;

	@SerializedName("status")
	private String status;

	public List<ArticlesItem> getArticles(){
		return articles;
	}

	public int getTotalResults(){
		return totalResults;
	}

	public String getStatus(){
		return status;
	}
}