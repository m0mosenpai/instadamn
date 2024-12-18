package X;

import com.facebook.msys.mci.NotificationCenter;
import com.facebook.msys.util.NotificationScope;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Deprecated
/* renamed from: X.YBf, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C73394YBf implements InterfaceC124945kz {
    public final NotificationCenter A00;
    public final Map A02 = new ConcurrentHashMap();
    public final C73395YBg A01 = new C73395YBg(this);

    @Override // X.InterfaceC124945kz
    public final NotificationScope ED9(InterfaceC124965l1 interfaceC124965l1, String str, int i) {
        String A00 = AbstractC111324zv.A00(654);
        NotificationScope notificationScope = new NotificationScope();
        NotificationCenter notificationCenter = this.A00;
        C73395YBg c73395YBg = this.A01;
        synchronized (notificationCenter) {
            notificationCenter.A01(notificationScope, c73395YBg, A00, 1);
        }
        this.A02.put(notificationScope, interfaceC124965l1);
        return notificationScope;
    }

    @Override // X.InterfaceC124945kz
    public final void F9V(NotificationScope notificationScope, String str) {
        this.A02.remove(notificationScope);
        NotificationCenter notificationCenter = this.A00;
        C73395YBg c73395YBg = this.A01;
        synchronized (notificationCenter) {
            notificationCenter.A00(notificationScope, c73395YBg, str);
        }
    }

    public C73394YBf(NotificationCenter notificationCenter) {
        this.A00 = notificationCenter;
    }
}
