package com.radanov.newsapp.util;

import android.content.Context;
import android.content.SharedPreferences;

public class AppSettings {


    private SharedPreferences pref;

    private int theme;

    public static final String THEME_KEY = "theme";
    public static final int THEME_LIGHT = 0;
    public static final int THEME_DARK = 1;
    public static final int THEME_DARK_AMOLED = 2;

    public AppSettings(Context context){
        pref = context.getSharedPreferences("prefApp", Context.MODE_PRIVATE);
        theme = pref.getInt(THEME_KEY, 0);
    }

    public int getTheme() {
        return theme;
    }

    public void setTheme(int theme) {
        this.theme = theme;
        SharedPreferences.Editor editor = pref.edit();
        editor.putInt(THEME_KEY, theme);
        editor.commit();
    }
}
