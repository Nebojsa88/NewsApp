package com.radanov.newsapp.ui.news;

import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;

import com.radanov.newsapp.R;
import com.radanov.newsapp.data.NewsItem;
import com.radanov.newsapp.databinding.ItemNewsImageBinding;
import com.radanov.newsapp.databinding.ItemNewsTextBinding;

public class NewsListAdapter extends ListAdapter<NewsItem, BaseViewHolder> {

    OnNewsItemClickEvent listener;

    public static final int VIEW_TYPE_NEWS_TEXT = 1;
    public static final int VIEW_TYPE_NEWS_IMAGE = 0;
    public static final int VIEW_TYPE_NEWS_VIDEO = 2;

    public interface OnNewsItemClickEvent{
        void onItemTextClick();
        void onItemImageClick();
        void onItemLongClick();
    }

    public void setOnNewsItemClickListener(OnNewsItemClickEvent listener){
        this.listener = listener;
    }


    public NewsListAdapter(@NonNull DiffUtil.ItemCallback<NewsItem> diffCallback) {
        super(diffCallback);
    }

    @Override
    public int getItemViewType(int position) {
        return super.getItemViewType(position);
    }

    @NonNull
    @Override
    public BaseViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {




        // based on the item viewType we create our viewHolder
        // we have two viewHolder for now : text viewHolder and image viewHolder
        switch (viewType){
                case VIEW_TYPE_NEWS_TEXT:
                    ItemNewsTextBinding itemNewsTextBinding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()
                        ), R.layout.item_news_text, parent, false);
                    return new TextViewHolder(itemNewsTextBinding);

                case VIEW_TYPE_NEWS_IMAGE:
                    ItemNewsImageBinding itemNewsImageBinding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()),
                            R.layout.item_news_image,parent,false);
                    return new ImageViewHolder(itemNewsImageBinding);

                default:
                    ItemNewsImageBinding defitemNewsImageBinding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()),
                        R.layout.item_news_image,parent,false);
                    return new ImageViewHolder(defitemNewsImageBinding);


                    /*ItemNewsTextBinding defaultItemNewsTextBinding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()
                    ), R.layout.item_news_text, parent, false);
                    return new TextViewHolder(defaultItemNewsTextBinding);*/
            }
    }

    @Override
    public void onBindViewHolder(@NonNull BaseViewHolder holder, int position) {

        holder.bindData(getItem(position));

    }
}
