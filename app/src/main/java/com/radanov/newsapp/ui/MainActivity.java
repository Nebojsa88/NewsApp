package com.radanov.newsapp.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
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

        applyThemeTest(settings.getTheme());

        setContentView(R.layout.activity_main);
        setupNavigation();
    }

    private void applyThemeTest(int theme) {

        if (theme == 0){
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        }else if(theme == 1){
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
        }else {
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        }
    }

    private void setupNavigation() {
        navHostFragment = (NavHostFragment) getSupportFragmentManager().findFragmentById(R.id.nav_host_fragment);
        bottomNavigationView = findViewById(R.id.bottom_nav);

        NavigationUI.setupWithNavController(bottomNavigationView, navHostFragment.getNavController());
    }
}