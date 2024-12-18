package X;

import android.app.Notification;
import android.app.PendingIntent;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;

/* renamed from: X.Xq8, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC72874Xq8 {
    public static Notification.BubbleMetadata A00(XND xnd) {
        Notification.BubbleMetadata.Builder builder;
        String str = xnd.A06;
        if (str != null) {
            builder = new Notification.BubbleMetadata.Builder(str);
        } else {
            builder = new Notification.BubbleMetadata.Builder(xnd.A04, AbstractC58497PwQ.A00(null, xnd.A05));
        }
        Notification.BubbleMetadata.Builder deleteIntent = builder.setDeleteIntent(xnd.A03);
        boolean z = true;
        if ((xnd.A02 & 1) == 0) {
            z = false;
        }
        deleteIntent.setAutoExpandBubble(z).setSuppressNotification(AbstractC167007dF.A1M(xnd.A02 & 2));
        int i = xnd.A00;
        if (i != 0) {
            builder.setDesiredHeight(i);
        }
        int i2 = xnd.A01;
        if (i2 != 0) {
            builder.setDesiredHeightResId(i2);
        }
        return builder.build();
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.XoU, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [X.XoU, java.lang.Object] */
    public static XND A01(Notification.BubbleMetadata bubbleMetadata) {
        C72835XoU c72835XoU;
        if (bubbleMetadata.getShortcutId() != null) {
            String shortcutId = bubbleMetadata.getShortcutId();
            ?? obj = new Object();
            if (!TextUtils.isEmpty(shortcutId)) {
                obj.A06 = shortcutId;
                c72835XoU = obj;
            } else {
                throw AbstractC166987dD.A15("Bubble requires a non-null shortcut id");
            }
        } else {
            PendingIntent intent = bubbleMetadata.getIntent();
            IconCompat A01 = AbstractC58497PwQ.A01(bubbleMetadata.getIcon());
            ?? obj2 = new Object();
            if (intent != null) {
                obj2.A04 = intent;
                obj2.A05 = A01;
                c72835XoU = obj2;
            } else {
                throw AbstractC166987dD.A15("Bubble requires non-null pending intent");
            }
        }
        boolean autoExpandBubble = bubbleMetadata.getAutoExpandBubble();
        int i = c72835XoU.A02;
        int i2 = i & (-2);
        if (autoExpandBubble) {
            i2 = i | 1;
        }
        c72835XoU.A02 = i2;
        c72835XoU.A03 = bubbleMetadata.getDeleteIntent();
        boolean isNotificationSuppressed = bubbleMetadata.isNotificationSuppressed();
        int i3 = c72835XoU.A02;
        int i4 = i3 & (-3);
        if (isNotificationSuppressed) {
            i4 = i3 | 2;
        }
        c72835XoU.A02 = i4;
        if (bubbleMetadata.getDesiredHeight() != 0) {
            c72835XoU.A00 = Math.max(bubbleMetadata.getDesiredHeight(), 0);
            c72835XoU.A01 = 0;
        }
        if (bubbleMetadata.getDesiredHeightResId() != 0) {
            c72835XoU.A01 = bubbleMetadata.getDesiredHeightResId();
            c72835XoU.A00 = 0;
        }
        return c72835XoU.A00();
    }
}
