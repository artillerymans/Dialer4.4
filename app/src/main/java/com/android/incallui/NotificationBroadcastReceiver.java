package com.android.incallui;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import com.android.contacts.common.ModelConfig;

public class NotificationBroadcastReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        final String action = intent.getAction();
        Log.i(this, "Broadcast from Notification: " + action);

        if (action.equals(ModelConfig.ACTION_HANG_UP_ONGOING_CALL)) {
            InCallPresenter.getInstance().hangUpOngoingCall(context);
        }
    }
}
