package X;

import com.instagram.pendingmedia.store.PendingMediaStore;

/* renamed from: X.M6l, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC50022M6l implements Runnable {
    public final /* synthetic */ InterfaceC37261GbE A00;
    public final /* synthetic */ C1OW A01;
    public final /* synthetic */ InterfaceC31091eE A02;
    public final /* synthetic */ PendingMediaStore A03;
    public final /* synthetic */ String A04;

    public RunnableC50022M6l(InterfaceC37261GbE interfaceC37261GbE, C1OW c1ow, InterfaceC31091eE interfaceC31091eE, PendingMediaStore pendingMediaStore, String str) {
        this.A03 = pendingMediaStore;
        this.A04 = str;
        this.A00 = interfaceC37261GbE;
        this.A01 = c1ow;
        this.A02 = interfaceC31091eE;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C47Z A03 = this.A03.A03(this.A04);
        if (A03 == null) {
            InterfaceC37261GbE interfaceC37261GbE = this.A00;
            C114675Fx c114675Fx = AbstractC47202Ktb.A02;
            C162337Ov.A0Z(interfaceC37261GbE.B4C(), C05F.A0N);
            interfaceC37261GbE.DUq(c114675Fx, null);
            return;
        }
        C49538Lur c49538Lur = new C49538Lur(this);
        A03.A0W(c49538Lur);
        c49538Lur.Dbp(A03);
    }
}
