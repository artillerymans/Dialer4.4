// Copyright 2013 Google Inc. All Rights Reserved.

package com.android.dialer;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;

import com.android.contacts.common.ModelConfig;
import com.android.contacts.common.extensions.ExtensionsFactory;
import com.android.incallui.InCallPresenter;
import com.android.incallui.Log;

public class DialerApplication extends Application {


    @Override
    public void onCreate() {
        super.onCreate();
        ExtensionsFactory.init(getApplicationContext());
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
    }
}
