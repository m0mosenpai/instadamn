package X;

import android.app.Notification;
import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;

/* renamed from: X.Xq7, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC72873Xq7 {
    public static Notification.BubbleMetadata A00(XND xnd) {
        PendingIntent pendingIntent = xnd.A04;
        if (pendingIntent == null) {
            return null;
        }
        Notification.BubbleMetadata.Builder deleteIntent = new Notification.BubbleMetadata.Builder().setIcon(AbstractC58497PwQ.A00(null, xnd.A05)).setIntent(pendingIntent).setDeleteIntent(xnd.A03);
        boolean z = true;
        if ((xnd.A02 & 1) == 0) {
            z = false;
        }
        Notification.BubbleMetadata.Builder suppressNotification = deleteIntent.setAutoExpandBubble(z).setSuppressNotification(AbstractC167007dF.A1M(xnd.A02 & 2));
        int i = xnd.A00;
        if (i != 0) {
            suppressNotification.setDesiredHeight(i);
        }
        int i2 = xnd.A01;
        if (i2 != 0) {
            suppressNotification.setDesiredHeightResId(i2);
        }
        return suppressNotification.build();
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.XoU, java.lang.Object] */
    public static XND A01(Notification.BubbleMetadata bubbleMetadata) {
        if (bubbleMetadata.getIntent() == null) {
            return null;
        }
        PendingIntent intent = bubbleMetadata.getIntent();
        IconCompat A01 = AbstractC58497PwQ.A01(bubbleMetadata.getIcon());
        ?? obj = new Object();
        if (intent != null) {
            obj.A04 = intent;
            obj.A05 = A01;
            boolean autoExpandBubble = bubbleMetadata.getAutoExpandBubble();
            int i = obj.A02;
            int i2 = i & (-2);
            if (autoExpandBubble) {
                i2 = i | 1;
            }
            obj.A02 = i2;
            obj.A03 = bubbleMetadata.getDeleteIntent();
            boolean isNotificationSuppressed = bubbleMetadata.isNotificationSuppressed();
            int i3 = obj.A02;
            int i4 = i3 & (-3);
            if (isNotificationSuppressed) {
                i4 = i3 | 2;
            }
            obj.A02 = i4;
            if (bubbleMetadata.getDesiredHeight() != 0) {
                obj.A00 = Math.max(bubbleMetadata.getDesiredHeight(), 0);
                obj.A01 = 0;
            }
            if (bubbleMetadata.getDesiredHeightResId() != 0) {
                obj.A01 = bubbleMetadata.getDesiredHeightResId();
                obj.A00 = 0;
            }
            return obj.A00();
        }
        throw AbstractC166987dD.A15("Bubble requires non-null pending intent");
    }
}
