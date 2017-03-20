package com.example.leonardo.soan;

import android.media.Image;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;

/**
 * Created by Leonardo on 14/03/2017.
 */

public class TestJava extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test_layout);
        TabLayout tabs = (TabLayout)findViewById(R.id.Tabs);
        tabs.setTabMode(TabLayout.MODE_SCROLLABLE);
        tabs.addTab(tabs.newTab().setText("1"));
        tabs.addTab(tabs.newTab().setText("2"));
        tabs.addTab(tabs.newTab().setText("3"));
        tabs.addTab(tabs.newTab().setText("4"));
        tabs.addTab(tabs.newTab().setText("5"));
        tabs.addTab(tabs.newTab().setText("6"));
        tabs.addTab(tabs.newTab().setText("7"));
        tabs.addTab(tabs.newTab().setText("8"));
        tabs.addTab(tabs.newTab().setText("9"));
        tabs.addTab(tabs.newTab().setText("10"));

        tabs.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {


            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

    }
    public void onRadioButtonClicked(View view) {

        boolean checked = ((RadioButton) view).isChecked();


        switch(view.getId()) {
            case R.id.R1:
                if (checked)

                    break;
            case R.id.R2:
                if (checked)
                    break;
        }
    }

}

