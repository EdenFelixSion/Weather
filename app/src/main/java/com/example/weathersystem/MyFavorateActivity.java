package com.example.weathersystem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class MyFavorateActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView addCityIv,moreIv;
    LinearLayout pointLayout;
    ViewPager mainVp;
    List<Fragment> fragmentList;
    List<String>cityList;
    List<ImageView>imgList;
    private CityFragmentPagerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_favorate);
        pointLayout = findViewById(R.id.myfavorate_layout_point);
        mainVp = findViewById(R.id.myfavorate_vp);
        fragmentList = new ArrayList<>();
        cityList = new ArrayList<>();
        imgList = new ArrayList<>();
        try {
            FileInputStream fileInputStream =  openFileInput( "city.txt" );
            if (fileInputStream != null) {
                InputStreamReader inputreader = new InputStreamReader(fileInputStream );
                BufferedReader buffreader = new BufferedReader( inputreader );
                String string;

                while ((string = buffreader.readLine()) != null) {
                    cityList.add(string);
                }
                fileInputStream.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        if(cityList.size()==0){
            cityList.add("北京");
        }
        initPager();
        adapter = new CityFragmentPagerAdapter(getSupportFragmentManager(),fragmentList);
        mainVp.setAdapter(adapter);
    }



    private void initPager() {
        for(int i = 0;i<cityList.size();i++){
            CityWeatherFragment cwFragmnt = new CityWeatherFragment();
            Bundle bundle = new Bundle();
            bundle.putString("city",cityList.get(i));
            cwFragmnt.setArguments(bundle);
            fragmentList.add(cwFragmnt);
        }
    }

    @Override
    public void onClick(View v) {

    }
}
