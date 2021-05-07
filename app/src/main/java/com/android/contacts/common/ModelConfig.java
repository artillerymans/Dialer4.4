package com.android.contacts.common;

public class ModelConfig {

    /**
     * Intent Action used for hanging up the current call from Notification bar. This will
     * choose first ringing call, first active call, or first background call (typically in
     * HOLDING state).
     */
    public static final String ACTION_HANG_UP_ONGOING_CALL =
            "com.android.incallui.ACTION_HANG_UP_ONGOING_CALL";

}
