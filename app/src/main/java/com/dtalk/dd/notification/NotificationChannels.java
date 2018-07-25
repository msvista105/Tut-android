package com.dtalk.dd.notification;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import android.support.annotation.RequiresApi;

import java.util.Arrays;

public class NotificationChannels {
    public static final String GENERAL = "GEN";
    public static final String ALERT = "ALT";
    public static final String MESSAGE = "MSG";

    @RequiresApi(api = Build.VERSION_CODES.O)
    public static void init(Context context) {
        NotificationManager nm = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
        nm.createNotificationChannels(Arrays.asList(
                new NotificationChannel(ALERT, "im_notif_alert", NotificationManager.IMPORTANCE_HIGH),
                new NotificationChannel(GENERAL, "im_notif_general", NotificationManager.IMPORTANCE_DEFAULT),
                new NotificationChannel(MESSAGE, "im_notif_message", NotificationManager.IMPORTANCE_DEFAULT)
        ));
    }
}
