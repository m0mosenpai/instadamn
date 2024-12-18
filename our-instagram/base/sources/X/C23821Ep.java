package X;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Bundle;
import java.util.HashSet;

/* renamed from: X.1Ep, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C23821Ep {
    public static ServiceConnectionC63461Skg A02;
    public static String A03;
    public final NotificationManager A00;
    public final Context A01;
    public static final Object A05 = new Object();
    public static java.util.Set A04 = new HashSet();
    public static final Object A06 = new Object();

    public final void A00(String str, int i, Notification notification) {
        Bundle bundle = notification.extras;
        if (bundle != null && bundle.getBoolean("android.support.useSideChannel")) {
            Context context = this.A01;
            C63586Spt c63586Spt = new C63586Spt(notification, context.getPackageName(), str, i);
            synchronized (A06) {
                ServiceConnectionC63461Skg serviceConnectionC63461Skg = A02;
                if (serviceConnectionC63461Skg == null) {
                    serviceConnectionC63461Skg = new ServiceConnectionC63461Skg(context.getApplicationContext());
                    A02 = serviceConnectionC63461Skg;
                }
                serviceConnectionC63461Skg.A02.obtainMessage(0, c63586Spt).sendToTarget();
            }
            this.A00.cancel(str, i);
            return;
        }
        this.A00.notify(str, i, notification);
    }

    public C23821Ep(Context context) {
        this.A01 = context;
        this.A00 = (NotificationManager) context.getSystemService("notification");
    }
}
