package X;

import java.util.Map;

/* loaded from: classes8.dex */
public final class LVQ implements C6Eh {
    public final /* synthetic */ C48521LdJ A00;
    public final /* synthetic */ InterfaceC16660sJ A01;

    public LVQ(C48521LdJ c48521LdJ, InterfaceC16660sJ interfaceC16660sJ) {
        this.A00 = c48521LdJ;
        this.A01 = interfaceC16660sJ;
    }

    @Override // com.facebook.msys.mci.NotificationCenterInternal.NotificationCallbackInternal
    public final void onNewNotification(String str, InterfaceC49122Nj interfaceC49122Nj, Map map) {
        InterfaceC16660sJ interfaceC16660sJ;
        boolean z;
        this.A00.A01.removeEveryObserver(this);
        AbstractC09800fd.A00(-637442150);
        if (map != null && map.containsKey("ACTRegistrationResult")) {
            interfaceC16660sJ = this.A01;
            Object obj = map.get("ACTRegistrationResult");
            if (!(obj instanceof Boolean)) {
                obj = null;
            }
            z = AbstractC31177DnL.A1b(obj);
        } else {
            interfaceC16660sJ = this.A01;
            z = false;
        }
        AbstractC25227BEk.A1Q(interfaceC16660sJ, z);
    }
}
