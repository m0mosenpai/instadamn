package X;

import android.app.ForegroundServiceStartNotAllowedException;
import android.app.Notification;
import android.app.Service;
import androidx.work.impl.foreground.SystemForegroundService;

/* renamed from: X.RrK, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC61648RrK {
    public static void A00(Notification service, Service id, int notification, int foregroundServiceType) {
        try {
            id.startForeground(notification, service, foregroundServiceType);
        } catch (ForegroundServiceStartNotAllowedException | SecurityException e) {
            C48442Kl.A00();
            android.util.Log.w(SystemForegroundService.A05, "Unable to start foreground service", e);
        }
    }
}
