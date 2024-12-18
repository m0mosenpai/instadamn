package X;

import android.app.Notification;
import android.app.Service;

/* renamed from: X.Rqr, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC61627Rqr {
    public static void A00(Notification notification, Service service, int i) {
        if (i != 0) {
            i = 1;
        }
        service.startForeground(20030, notification, i);
    }
}
