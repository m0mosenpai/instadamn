package X;

import android.app.NotificationManager;
import android.content.Context;
import com.google.android.gms.common.GooglePlayServicesUtil;

/* loaded from: classes10.dex */
public final class TLI implements Runnable {
    public final /* synthetic */ T5W A00;

    public TLI(T5W t5w) {
        this.A00 = t5w;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context = this.A00.A0B;
        if (!GooglePlayServicesUtil.A02.getAndSet(true)) {
            try {
                NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
                if (notificationManager != null) {
                    notificationManager.cancel(10436);
                }
            } catch (SecurityException unused) {
            }
        }
    }
}
