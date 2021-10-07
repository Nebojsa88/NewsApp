package com.radanov.newsapp.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.NavigationUI;

import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.radanov.newsapp.R;
import com.radanov.newsapp.util.AppSettings;

public class MainActivity extends AppCompatActivity {

    NavHostFragment navHostFragment;
    BottomNavigationView bottomNavigationView;

    AppSettings settings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        settings = new AppSettings(this);



        applyTheme(settings.getTheme());

        setContentView(R.layout.activity_main);
        setupNavigation();


    }

    private void applyTheme(int theme) {

        switch (theme){
            case AppSettings.THEME_LIGHT: setTheme(R.style.Theme_NewsApp);
                break;
            case AppSettings.THEME_DARK: setTheme(R.style.DarkTheme);
                break;
            case AppSettings.THEME_DARK_AMOLED:setTheme(R.style.DarkTheme);
                break;
            default: setTheme(R.style.DarkTheme);
        }

    }

    private void setupNavigation() {
        navHostFragment = (NavHostFragment) getSupportFragmentManager().findFragmentById(R.id.nav_host_fragment);
        bottomNavigationView = findViewById(R.id.bottom_nav);

        NavigationUI.setupWithNavController(bottomNavigationView, navHostFragment.getNavController());
    }
}