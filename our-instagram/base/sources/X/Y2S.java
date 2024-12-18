package X;

import android.app.Notification;
import android.graphics.drawable.Icon;

/* loaded from: classes12.dex */
public abstract class Y2S {
    public static void A00(Notification.BigPictureStyle bigPictureStyle) {
        bigPictureStyle.setContentDescription(null);
    }

    public static void A01(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
        bigPictureStyle.bigPicture(icon);
    }

    public static void A02(Notification.BigPictureStyle bigPictureStyle, boolean z) {
        bigPictureStyle.showBigPictureWhenCollapsed(z);
    }
}
