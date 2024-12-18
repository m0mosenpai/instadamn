package X;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.2Sy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C50302Sy extends C1WE {
    @Override // X.C1WE
    public final String A0C() {
        return "reachability_silent_push";
    }

    @Override // X.C1WE
    public final void A0D(C116155Nu c116155Nu, AbstractC12990ll abstractC12990ll, L85 l85, String str) {
        l85.A00(false);
    }

    @Override // X.C1WE
    public final void A04(C116155Nu c116155Nu, AbstractC12990ll abstractC12990ll, String str) {
        List<NotificationChannel> emptyList;
        NotificationManager notificationManager = (NotificationManager) AbstractC12290kX.A00.getSystemService("notification");
        if (notificationManager == null) {
            C0w9.A03("PushReachabilityNotificationHandler", "Failed to fetch the Notification Manager Service");
            return;
        }
        HashMap hashMap = new HashMap();
        try {
            emptyList = notificationManager.getNotificationChannels();
        } catch (Exception unused) {
            C0w9.A03("PushReachabilityNotificationHandler", "Unable to get notification channels");
            emptyList = Collections.emptyList();
        }
        for (NotificationChannel notificationChannel : emptyList) {
            boolean canShowBadge = notificationChannel.canShowBadge();
            boolean z = false;
            if (notificationChannel.getImportance() >= 3) {
                z = true;
            }
            HashMap hashMap2 = new HashMap();
            hashMap2.put("badge", Boolean.valueOf(canShowBadge));
            hashMap2.put("sound", Boolean.valueOf(z));
            hashMap.put(notificationChannel.getId(), hashMap2);
        }
        C92I.A0A(AbstractC12290kX.A00, abstractC12990ll, hashMap);
    }
}
