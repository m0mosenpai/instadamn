package X;

import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.content.Context;

/* loaded from: classes9.dex */
public abstract class ONF {
    public static final boolean A01(Context context) {
        Object systemService = context.getSystemService("notification");
        if (systemService != null) {
            int currentInterruptionFilter = ((NotificationManager) systemService).getCurrentInterruptionFilter();
            return (currentInterruptionFilter == 0 || currentInterruptionFilter == 1 || (currentInterruptionFilter != 2 && currentInterruptionFilter != 3 && currentInterruptionFilter != 4)) ? false : true;
        }
        throw AbstractC166997dE.A0g();
    }

    public static final boolean A00(Context context) {
        NotificationManager notificationManager;
        NotificationChannel notificationChannel;
        NotificationChannelGroup notificationChannelGroup;
        if (((NotificationManager) context.getSystemService("notification")).areNotificationsEnabled() && (notificationChannel = (notificationManager = (NotificationManager) context.getSystemService("notification")).getNotificationChannel("ig_direct_video_chat")) != null) {
            if (notificationChannel.getGroup() != null) {
                notificationChannelGroup = notificationManager.getNotificationChannelGroup(notificationChannel.getGroup());
            } else {
                notificationChannelGroup = null;
            }
            if (notificationChannel.getImportance() >= 1 && (notificationChannelGroup == null || !notificationChannelGroup.isBlocked())) {
                return false;
            }
        }
        return true;
    }
}
