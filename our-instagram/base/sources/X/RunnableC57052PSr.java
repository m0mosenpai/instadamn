package X;

import android.view.View;

/* renamed from: X.PSr, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC57052PSr implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ NTX A01;
    public final /* synthetic */ boolean A02;

    public RunnableC57052PSr(NTX ntx, int i, boolean z) {
        this.A01 = ntx;
        this.A02 = z;
        this.A00 = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [X.PlO, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        NTX ntx = this.A01;
        if (ntx.A03 == null && this.A02) {
            InterfaceC09390do interfaceC09390do = ntx.A0G.A09;
            ntx.A01 = AbstractC166987dD.A0d(interfaceC09390do).getWidth();
            ntx.A00 = AbstractC166987dD.A0d(interfaceC09390do).getHeight();
            NTX.A02(ntx);
        }
        boolean z = this.A02;
        if (z) {
            ntx.A0D.A05(PE1.A00);
        }
        OHO oho = ntx.A0F;
        int i = this.A00;
        oho.A00.A00(new C56571P9s(i - 1));
        PCP pcp = ntx.A0G;
        C57260Pbi c57260Pbi = new C57260Pbi(ntx, i, 2, z);
        View A0d = AbstractC166987dD.A0d(pcp.A0E);
        A0d.setVisibility(0);
        MSX.A10(A0d);
        A0d.setAlpha(0.8f);
        AbstractC43594JPz.A0G(A0d).setDuration(500L).setListener(new C55232Of4(pcp, c57260Pbi)).start();
        ntx.A0D.A05(new Object());
    }
}
