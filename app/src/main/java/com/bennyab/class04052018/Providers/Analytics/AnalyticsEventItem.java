package com.bennyab.class04052018.Providers.Analytics;

/**
 * Created by bennya on 04/05/2018.
 */

public class AnalyticsEventItem{

    String itemId;
    String itemName;
    String contentType;

    public AnalyticsEventItem(String itemId,String itemName, String contentType){
        this.itemId = itemId;
        this.itemName = itemName;
        this.contentType = contentType;
    }

}
