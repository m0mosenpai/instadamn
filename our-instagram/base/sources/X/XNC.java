package X;

import android.app.Notification;
import android.content.LocusId;

/* loaded from: classes12.dex */
public abstract class XNC {
    public static void A02(Notification.Builder builder, Object obj) {
        builder.setLocusId((LocusId) obj);
    }

    public static void A00(Notification.Action.Builder builder, boolean z) {
        builder.setContextual(z);
    }

    public static void A01(Notification.BubbleMetadata bubbleMetadata, Notification.Builder builder) {
        builder.setBubbleMetadata(bubbleMetadata);
    }

    public static void A03(Notification.Builder builder, boolean z) {
        builder.setAllowSystemGeneratedContextualActions(z);
    }
}
