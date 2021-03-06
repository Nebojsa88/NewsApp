package com.radanov.newsapp.ui;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import androidx.appcompat.app.AppCompatDelegate;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;


import com.radanov.newsapp.R;
import com.radanov.newsapp.util.AppSettings;

import java.util.Objects;


public class SettingsFragment extends Fragment {


    private RadioGroup rgTheme;
    private RadioButton rbLight, rbDark, rbAmoled;
    private AppSettings settings;



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_settings, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        settings = new AppSettings(getActivity().getBaseContext());



        initView(view);
        rgTheme.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if(checkedId == R.id.rb_light) {
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
                    settings.setTheme(0);
                } else if(checkedId == R.id.rb_dark) {
                    settings.setTheme(1);
                    getActivity().recreate();
                }
            }
        });
    }

    private void initView(View view) {
        rgTheme = view.findViewById(R.id.rg_theme);
        rbLight = view.findViewById(R.id.rb_light);
        rbDark = view.findViewById(R.id.rb_dark);
        rbAmoled = view.findViewById(R.id.rb_amoled);
        switch (settings.getTheme()){
            case AppSettings.THEME_LIGHT: rbLight.setChecked(true);
                break;
            case AppSettings.THEME_DARK: rbDark.setChecked(true);
                break;

            default: rbLight.setChecked(true);
        }
    }
}