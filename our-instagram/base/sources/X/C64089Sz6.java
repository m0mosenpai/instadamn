package X;

import com.facebook.msys.mci.NotificationCenterInternal;
import java.util.Map;

/* renamed from: X.Sz6, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64089Sz6 implements NotificationCenterInternal.NotificationCallbackInternal, C6Eh {
    public final int A00;
    public final Object A01;

    public C64089Sz6(SJW sjw, int i) {
        this.A00 = i;
        this.A01 = sjw;
    }

    @Override // com.facebook.msys.mci.NotificationCenterInternal.NotificationCallbackInternal
    public final void onNewNotification(String str, InterfaceC49122Nj interfaceC49122Nj, Map map) {
        AbstractRunnableC14200nk rcH;
        int i = this.A00;
        SJW sjw = (SJW) this.A01;
        if (i != 0) {
            rcH = new RcI(sjw, map);
        } else {
            rcH = new RcH(sjw, map);
        }
        AbstractC58323PtF.A1K(rcH);
    }
}
