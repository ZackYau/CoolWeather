package com.coolweather.app.util;

/**
 * Created by Zack on 2015/11/1.
 */
public interface HttpCallbackListener {
    void onFinish(String response);
    void onError(Exception e);
}
