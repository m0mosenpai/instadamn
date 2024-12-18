package X;

import com.facebook.msys.mci.NotificationCenter;
import com.facebook.msys.mci.NotificationCenterInternal;
import java.util.Map;

/* renamed from: X.YBg, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C73395YBg implements NotificationCenterInternal.NotificationCallbackInternal {
    public final /* synthetic */ C73394YBf A00;

    public C73395YBg(C73394YBf c73394YBf) {
        this.A00 = c73394YBf;
    }

    @Override // com.facebook.msys.mci.NotificationCenterInternal.NotificationCallbackInternal
    public final void onNewNotification(String str, InterfaceC49122Nj interfaceC49122Nj, Map map) {
        if (interfaceC49122Nj != null) {
            C73394YBf c73394YBf = this.A00;
            InterfaceC124965l1 interfaceC124965l1 = (InterfaceC124965l1) c73394YBf.A02.remove(interfaceC49122Nj);
            if (interfaceC124965l1 != null) {
                NotificationCenter notificationCenter = c73394YBf.A00;
                C73395YBg c73395YBg = c73394YBf.A01;
                synchronized (notificationCenter) {
                    notificationCenter.A00(interfaceC49122Nj, c73395YBg, str);
                }
                interfaceC124965l1.Dh3(map);
            }
        }
    }
}
