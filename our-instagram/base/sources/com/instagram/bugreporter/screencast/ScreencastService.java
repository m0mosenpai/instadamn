package com.instagram.bugreporter.screencast;

import X.AbstractC166987dD;
import X.C08770cf;
import X.C0f9;
import X.C14360o3;
import X.MSV;
import X.XN9;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes10.dex */
public final class ScreencastService extends Service {
    public static final List A00 = AbstractC166987dD.A1E();

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        int A04 = C0f9.A04(1746634125);
        super.onCreate();
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            NotificationChannel notificationChannel = new NotificationChannel("SCREEN_CAST_NOTIFICATION_CHANNEL_ID", "Screencast background service", 0);
            notificationChannel.setLockscreenVisibility(0);
            Object systemService = getSystemService("notification");
            C14360o3.A0C(systemService, MSV.A00(15));
            ((NotificationManager) systemService).createNotificationChannel(notificationChannel);
            Notification A03 = new XN9(this, "SCREEN_CAST_NOTIFICATION_CHANNEL_ID").A03();
            C14360o3.A07(A03);
            if (i >= 34) {
                startForeground(20029, A03, 32);
                Iterator it = A00.iterator();
                if (it.hasNext()) {
                    it.next();
                    throw AbstractC166987dD.A15("this$0");
                }
            } else {
                startForeground(20029, A03);
            }
        }
        C0f9.A0B(152224827, A04);
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        int A04 = C0f9.A04(214269576);
        if (intent != null) {
            C08770cf.A01.A01(this, intent);
        }
        C0f9.A0B(-1887423320, A04);
        return 0;
    }
}
