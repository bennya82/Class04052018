package com.bennyab.class04052018;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.bennyab.class04052018.Providers.Analytics.AnalyticsEventItem;
import com.bennyab.class04052018.Providers.Analytics.AnalyticsScreenItem;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ClassApplication application = (ClassApplication) getApplication();
        application.logAnalyticsScreen(new AnalyticsScreenItem(this.getClass().getName()));
    }
}
