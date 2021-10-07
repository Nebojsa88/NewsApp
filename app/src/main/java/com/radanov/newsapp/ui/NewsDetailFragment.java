package com.radanov.newsapp.ui;

import android.os.Bundle;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.radanov.newsapp.R;
import com.radanov.newsapp.data.FakeDataSource;
import com.radanov.newsapp.data.NewsItem;
import com.radanov.newsapp.databinding.FragmentNewsDetailBinding;


public class NewsDetailFragment extends Fragment {


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        FragmentNewsDetailBinding fragmentNewsDetailBinding =
                DataBindingUtil.inflate(LayoutInflater.from(getContext()), R.layout.fragment_news_detail,container, false );

        FakeDataSource fakeDataSource = new FakeDataSource();
        NewsItem item = fakeDataSource.generateRandomNewsItem();
        //item.setFav(true);
        fragmentNewsDetailBinding.setNewsitemData(item);

        // Inflate the layout for this fragment
        return fragmentNewsDetailBinding.getRoot();
    }
}