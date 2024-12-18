package X;

import android.app.Notification;

/* loaded from: classes12.dex */
public abstract class XPL {
    public static void A01(Notification.Builder builder) {
        builder.setForegroundServiceBehavior(1);
    }

    public static void A00(Notification.Action.Builder builder, boolean z) {
        builder.setAuthenticationRequired(z);
    }
}
