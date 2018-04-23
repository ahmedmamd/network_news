package com.example.mashal.network_start.model;


import com.google.gson.annotations.SerializedName;

//@Generated("com.robohorse.robopojogenerator")
public class ArticlesItem{

	@SerializedName("publishedAt")
	private String publishedAt;

	@SerializedName("author")
	private String author;

	@SerializedName("urlToImage")
	private String urlToImage;

	@SerializedName("title")
	private String title;

	@SerializedName("source")
	private Source source;

	@SerializedName("description")
	private String description;

	@SerializedName("url")
	private String url;

	public String getPublishedAt(){
		return publishedAt;
	}

	public String getAuthor(){
		return author;
	}

	public String getUrlToImage(){
		return urlToImage;
	}

	public String getTitle(){
		return title;
	}

	public Source getSource(){
		return source;
	}

	public String getDescription(){
		return description;
	}

	public String getUrl(){
		return url;
	}
}