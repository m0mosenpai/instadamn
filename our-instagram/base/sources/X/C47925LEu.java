package X;

import android.app.NotificationManager;
import android.service.notification.StatusBarNotification;

/* renamed from: X.LEu, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47925LEu {
    public final NotificationManager A00;
    public final C7TH A01;
    public final C2IZ A02;
    public final C27741Wc A03;
    public final InterfaceC16660sJ A04;
    public final C13920nI A05;

    public C47925LEu(NotificationManager notificationManager, C13920nI c13920nI, C7TH c7th, C2IZ c2iz, C27741Wc c27741Wc, InterfaceC16660sJ interfaceC16660sJ) {
        AbstractC25233BEq.A0w(1, c7th, interfaceC16660sJ, c13920nI);
        C14360o3.A0B(notificationManager, 6);
        this.A01 = c7th;
        this.A02 = c2iz;
        this.A04 = interfaceC16660sJ;
        this.A05 = c13920nI;
        this.A03 = c27741Wc;
        this.A00 = notificationManager;
    }

    public static final StatusBarNotification A00(C47925LEu c47925LEu, String str, String str2) {
        String A0T = AnonymousClass001.A0T(str2, str, '|');
        StatusBarNotification[] activeNotifications = c47925LEu.A00.getActiveNotifications();
        if (activeNotifications != null && activeNotifications.length != 0) {
            C0s6 c0s6 = new C0s6(activeNotifications);
            while (c0s6.hasNext()) {
                StatusBarNotification statusBarNotification = (StatusBarNotification) c0s6.next();
                if (C14360o3.A0K(A0T, statusBarNotification.getTag())) {
                    return statusBarNotification;
                }
            }
            return null;
        }
        return null;
    }
}
