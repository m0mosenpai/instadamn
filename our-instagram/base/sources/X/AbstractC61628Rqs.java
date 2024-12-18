package X;

import android.app.Notification;
import android.app.Service;
import android.os.Build;

/* renamed from: X.Rqs, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC61628Rqs {
    public static void A00(Notification notification, Service service, int i) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 34) {
            AbstractC61627Rqr.A00(notification, service, i);
        } else if (i2 >= 29) {
            AbstractC61626Rqq.A00(notification, service, i);
        } else {
            service.startForeground(20030, notification);
        }
    }
}
