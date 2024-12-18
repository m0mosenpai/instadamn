package X;

import android.app.Notification;
import android.content.LocusId;

/* loaded from: classes12.dex */
public abstract class Y2R {
    public static Notification.BubbleMetadata A00(Notification notification) {
        return notification.getBubbleMetadata();
    }

    public static LocusId A01(Notification notification) {
        return notification.getLocusId();
    }

    public static boolean A02(Notification notification) {
        return notification.getAllowSystemGeneratedContextualActions();
    }
}
