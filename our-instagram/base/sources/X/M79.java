package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.pendingmedia.store.PendingMediaStore;

/* loaded from: classes8.dex */
public final /* synthetic */ class M79 implements Runnable {
    public final /* synthetic */ C19260xA A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ InterfaceC37261GbE A02;
    public final /* synthetic */ C1OW A03;
    public final /* synthetic */ DirectThreadKey A04;
    public final /* synthetic */ PendingMediaStore A05;
    public final /* synthetic */ String A06;

    public /* synthetic */ M79(C19260xA c19260xA, UserSession userSession, InterfaceC37261GbE interfaceC37261GbE, C1OW c1ow, DirectThreadKey directThreadKey, PendingMediaStore pendingMediaStore, String str) {
        this.A01 = userSession;
        this.A05 = pendingMediaStore;
        this.A03 = c1ow;
        this.A06 = str;
        this.A04 = directThreadKey;
        this.A02 = interfaceC37261GbE;
        this.A00 = c19260xA;
    }

    @Override // java.lang.Runnable
    public final void run() {
        UserSession userSession = this.A01;
        PendingMediaStore pendingMediaStore = this.A05;
        C1OW c1ow = this.A03;
        String str = this.A06;
        DirectThreadKey directThreadKey = this.A04;
        LHD.A01(this.A00, userSession, this.A02, c1ow, directThreadKey, C40121td.A00(AbstractC12290kX.A00, userSession), pendingMediaStore, str);
    }
}
