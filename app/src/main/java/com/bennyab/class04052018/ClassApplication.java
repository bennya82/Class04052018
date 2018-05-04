package com.bennyab.class04052018;

import android.app.Application;

import com.bennyab.class04052018.Providers.Analytics.AnalyticsEventItem;
import com.bennyab.class04052018.Providers.Analytics.AnalyticsProvider;
import com.bennyab.class04052018.Providers.Analytics.AnalyticsScreenItem;

/**
 * Created by bennya on 04/05/2018.
 */

public class ClassApplication extends Application {

    AnalyticsProvider analyticsProvider;

    @Override
    public void onCreate() {
        super.onCreate();
        analyticsProvider = new AnalyticsProvider(this);
    }

    public void logAnalyticsEvent(AnalyticsEventItem eventItem) {
        try {
            analyticsProvider.logAnalyticsEvent(eventItem);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void logAnalyticsScreen(AnalyticsScreenItem analyticsScreenItem) {
        analyticsProvider.logAnalyticsScreen(analyticsScreenItem);
    }
}
