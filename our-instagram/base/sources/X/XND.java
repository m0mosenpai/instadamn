package X;

import android.app.Notification;
import android.app.PendingIntent;
import android.os.Build;
import androidx.core.graphics.drawable.IconCompat;

/* loaded from: classes12.dex */
public final class XND {
    public int A00;
    public int A01;
    public int A02;
    public PendingIntent A03;
    public PendingIntent A04;
    public IconCompat A05;
    public String A06;

    public static Notification.BubbleMetadata A00(XND xnd) {
        if (xnd == null) {
            return null;
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            return AbstractC72874Xq8.A00(xnd);
        }
        if (i == 29) {
            return AbstractC72873Xq7.A00(xnd);
        }
        return null;
    }

    public static XND A01(Notification.BubbleMetadata bubbleMetadata) {
        if (bubbleMetadata == null) {
            return null;
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            return AbstractC72874Xq8.A01(bubbleMetadata);
        }
        if (i == 29) {
            return AbstractC72873Xq7.A01(bubbleMetadata);
        }
        return null;
    }
}
