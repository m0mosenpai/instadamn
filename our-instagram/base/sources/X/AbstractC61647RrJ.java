package X;

import android.app.Notification;
import android.app.Service;

/* renamed from: X.RrJ, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC61647RrJ {
    public static void A00(Notification service, Service id, int notification, int foregroundServiceType) {
        id.startForeground(notification, service, foregroundServiceType);
    }
}
