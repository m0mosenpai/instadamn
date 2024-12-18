package X;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.content.Context;
import android.media.AudioAttributes;
import android.os.Build;

/* renamed from: X.2Ed, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC47112Ed {
    public static final Boolean A00(Context context, EnumC47122Ee enumC47122Ee, boolean z) {
        NotificationChannelGroup notificationChannelGroup;
        boolean z2 = false;
        if (AbstractC14480oK.A01(context)) {
            Object systemService = context.getSystemService("notification");
            C14360o3.A0C(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
            NotificationManager notificationManager = (NotificationManager) systemService;
            NotificationChannel notificationChannel = notificationManager.getNotificationChannel(enumC47122Ee.A00);
            if (notificationChannel == null) {
                return null;
            }
            String group = notificationChannel.getGroup();
            if ((!z || group == null || Build.VERSION.SDK_INT <= 28 || (notificationChannelGroup = notificationManager.getNotificationChannelGroup(group)) == null || !notificationChannelGroup.isBlocked()) && notificationChannel.getImportance() != 0) {
                z2 = true;
            }
        }
        return Boolean.valueOf(z2);
    }

    public static final void A02(NotificationManager notificationManager, EnumC47122Ee enumC47122Ee) {
        C14360o3.A0B(notificationManager, 0);
        try {
            String str = enumC47122Ee.A00;
            if (notificationManager.getNotificationChannel(str) != null) {
                notificationManager.deleteNotificationChannel(str);
            }
        } catch (Exception e) {
            C0w9.A06("NotificationChannelsUtils", AnonymousClass001.A0g("unable to delete ", enumC47122Ee.A00, " notification channel"), e);
        }
    }

    public static final void A01(NotificationManager notificationManager, android.net.Uri uri, EnumC47122Ee enumC47122Ee, String str, String str2, int i, int i2, int i3, boolean z, boolean z2) {
        AudioAttributes audioAttributes;
        C14360o3.A0B(notificationManager, 9);
        String str3 = enumC47122Ee.A00;
        NotificationChannel notificationChannel = new NotificationChannel(str3, str2, i);
        boolean z3 = false;
        if (i2 != 0) {
            z3 = true;
        }
        notificationChannel.enableLights(z3);
        if (i2 != 0) {
            notificationChannel.setLightColor(i2);
        }
        notificationChannel.enableVibration(z);
        notificationChannel.setShowBadge(z2);
        notificationChannel.setLockscreenVisibility(i3);
        if (str != null) {
            notificationChannel.setGroup(str);
        }
        if (uri == null) {
            audioAttributes = null;
        } else {
            audioAttributes = Notification.AUDIO_ATTRIBUTES_DEFAULT;
        }
        notificationChannel.setSound(uri, audioAttributes);
        try {
            notificationManager.createNotificationChannel(notificationChannel);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(AnonymousClass001.A0v("can not create notification channel for id: ", str3, "; groupId: ", str, ';'), e);
        }
    }

    public static final boolean A03(Context context) {
        Object systemService = context.getSystemService("notification");
        C14360o3.A0C(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        NotificationChannelGroup notificationChannelGroup = ((NotificationManager) systemService).getNotificationChannelGroup("DIRECT");
        if (notificationChannelGroup == null || !notificationChannelGroup.isBlocked()) {
            return true;
        }
        return false;
    }
}
