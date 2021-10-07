package com.radanov.newsapp.ui.news;

import android.view.View;

import androidx.annotation.NonNull;

import com.radanov.newsapp.data.NewsItem;
import com.radanov.newsapp.databinding.ItemNewsImageBinding;
import com.radanov.newsapp.databinding.ItemNewsTextBinding;

public class ImageViewHolder extends BaseViewHolder{

    ItemNewsImageBinding itemNewsImageBinding;

    public ImageViewHolder(@NonNull ItemNewsImageBinding itemNewsImageBinding) {
        super(itemNewsImageBinding.getRoot());
        this.itemNewsImageBinding = itemNewsImageBinding;
    }

    @Override
    public void bindData(NewsItem item) {

        itemNewsImageBinding.setNewsItemImage(item);
    }

    @Override
    public ItemNewsTextBinding getItemNewsTextBinding() {
        return null;
    }

    @Override
    public ItemNewsImageBinding getItemNewsImageBinding() {
        return null;
    }
}
