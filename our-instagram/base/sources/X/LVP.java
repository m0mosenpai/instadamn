package X;

import com.google.common.util.concurrent.SettableFuture;
import java.util.Map;

/* loaded from: classes8.dex */
public final class LVP implements C6Eh {
    public final /* synthetic */ C125875mc A00;
    public final /* synthetic */ SettableFuture A01;

    public LVP(C125875mc c125875mc, SettableFuture settableFuture) {
        this.A00 = c125875mc;
        this.A01 = settableFuture;
    }

    @Override // com.facebook.msys.mci.NotificationCenterInternal.NotificationCallbackInternal
    public final void onNewNotification(String str, InterfaceC49122Nj interfaceC49122Nj, Map map) {
        C125875mc c125875mc;
        SettableFuture settableFuture;
        C64K c64k;
        Boolean bool;
        if (map != null && (bool = (Boolean) map.get("ACTRegistrationResult")) != null) {
            boolean booleanValue = bool.booleanValue();
            c125875mc = this.A00;
            settableFuture = this.A01;
            if (booleanValue) {
                c64k = C64K.A09;
            } else {
                c64k = C64K.A07;
            }
        } else {
            c125875mc = this.A00;
            settableFuture = this.A01;
            c64k = C64K.A08;
        }
        C125875mc.A01(c125875mc, c64k, settableFuture);
    }
}
