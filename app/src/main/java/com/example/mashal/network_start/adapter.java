package com.example.mashal.network_start;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.mashal.network_start.model.ArticlesItem;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by mashal on 2018-03-19.
 */
   public class adapter extends RecyclerView.Adapter<adapter.recview> {
   Context context;
    ArrayList<ArticlesItem> article=new ArrayList();
    TextView textView;
    ImageView imageView;
    public adapter(ArrayList<ArticlesItem> article, Context context) {
        this.context = context;
        this.article = article;
    }

    @Override
    public recview onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.content_view,parent,false);
        return new recview(view);
    }

    @Override
    public void onBindViewHolder(recview holder, int position) {
     ArticlesItem articles=article.get(position);
        Picasso.with(context).load(articles.getUrlToImage()).into(imageView);
//        textView.setText(articles.getTitle());
        textView.setText(articles.getDescription());
    }

    @Override
    public int getItemCount() {
        return article.size();
    }

    class recview extends RecyclerView.ViewHolder{

    public recview(View itemView) {
        super(itemView);
        textView=(TextView) itemView.findViewById(R.id.text);
        imageView=(ImageView) itemView.findViewById(R.id.image);
    }
}}
