package X;

import com.facebook.msys.mci.SessionedNotificationCenter;
import com.facebook.msys.util.NotificationScope;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.5ky, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C124935ky implements InterfaceC124945kz {
    public final SessionedNotificationCenter A01;
    public final Map A02 = new ConcurrentHashMap();
    public final C6Eh A00 = new C6Eh() { // from class: X.5l0
        @Override // com.facebook.msys.mci.NotificationCenterInternal.NotificationCallbackInternal
        public final void onNewNotification(String str, InterfaceC49122Nj interfaceC49122Nj, Map map) {
            if (interfaceC49122Nj != null) {
                C124935ky c124935ky = C124935ky.this;
                InterfaceC124965l1 interfaceC124965l1 = (InterfaceC124965l1) c124935ky.A02.remove(interfaceC49122Nj);
                if (interfaceC124965l1 != null) {
                    c124935ky.A01.removeObserver(c124935ky.A00, str, interfaceC49122Nj);
                    interfaceC124965l1.Dh3(map);
                }
            }
        }
    };

    public final NotificationScope A00(InterfaceC124965l1 interfaceC124965l1, String str) {
        return ED9(interfaceC124965l1, str, 1);
    }

    @Override // X.InterfaceC124945kz
    public final NotificationScope ED9(InterfaceC124965l1 interfaceC124965l1, String str, int i) {
        NotificationScope notificationScope = new NotificationScope();
        this.A01.addObserver(this.A00, str, 1, notificationScope);
        this.A02.put(notificationScope, interfaceC124965l1);
        return notificationScope;
    }

    @Override // X.InterfaceC124945kz
    public final void F9V(NotificationScope notificationScope, String str) {
        this.A02.remove(notificationScope);
        this.A01.removeObserver(this.A00, str, notificationScope);
    }

    public C124935ky(SessionedNotificationCenter sessionedNotificationCenter) {
        this.A01 = sessionedNotificationCenter;
    }
}
