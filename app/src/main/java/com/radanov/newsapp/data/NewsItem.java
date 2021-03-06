package com.radanov.newsapp.data;

import java.util.Date;

public class NewsItem {

    int id;
    String title;
    String username;
    String newsImg;
    String userImage;
    String content;
    String bgColor;
    Date dateCreation;
    int viewType = 0; //required to determine the view type 0 for simple news type(text base news) 1 for image based news and 2 for news that contains video...
    String videoUrl;
    boolean isFav = false;

    public NewsItem(){

    }

    public NewsItem(int id, String title, String username, String newsImg, String userImage, String content, String bgColor, Date dateCreation, int viewType, String videoUrl, boolean isFav) {
        this.id = id;
        this.title = title;
        this.username = username;
        this.newsImg = newsImg;
        this.userImage = userImage;
        this.content = content;
        this.bgColor = bgColor;
        this.dateCreation = dateCreation;
        this.viewType = viewType;
        this.videoUrl = videoUrl;
        this.isFav = isFav;
    }

    public NewsItem(int id, String title, String username, String newsImg, String userImage, String content, String bgColor, Date dateCreation, int viewType) {
        this.id = id;
        this.title = title;
        this.username = username;
        this.newsImg = newsImg;
        this.userImage = userImage;
        this.content = content;
        this.bgColor = bgColor;
        this.dateCreation = dateCreation;
        this.viewType = viewType;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getUsername() {
        return username;
    }

    public String getNewsImg() {
        return newsImg;
    }

    public String getUserImage() {
        return userImage;
    }

    public String getContent() {
        return content;
    }

    public String getBgColor() {
        return bgColor;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public int getViewType() {
        return viewType;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public boolean isFav() {
        return isFav;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setNewsImg(String newsImg) {
        this.newsImg = newsImg;
    }

    public void setUserImage(String userImage) {
        this.userImage = userImage;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setBgColor(String bgColor) {
        this.bgColor = bgColor;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public void setViewType(int viewType) {
        this.viewType = viewType;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public void setFav(boolean fav) {
        isFav = fav;
    }

    @Override
    public String toString() {
        return "NewsItem{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", username='" + username + '\'' +
                ", newsImg='" + newsImg + '\'' +
                ", userImage='" + userImage + '\'' +
                ", content='" + content + '\'' +
                ", bgColor='" + bgColor + '\'' +
                ", dateCreation=" + dateCreation +
                ", viewType=" + viewType +
                ", videoUrl='" + videoUrl + '\'' +
                ", isFav=" + isFav +
                '}';
    }
}
