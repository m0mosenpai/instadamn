package X;

import com.facebook.common.callercontext.CallerContext;

/* renamed from: X.AdL, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23626AdL implements InterfaceC12870lZ {
    public final /* synthetic */ C2NX A00;

    public C23626AdL(C2NX c2nx) {
        this.A00 = c2nx;
    }

    public static final void A00(C23626AdL c23626AdL) {
        C2NX c2nx = c23626AdL.A00;
        CallerContext callerContext = C2NX.A08;
        C195218kN A00 = C195218kN.A00(c2nx.A04);
        synchronized (A00) {
            if (C195218kN.A04(A00)) {
                C195218kN.A03(A00);
            }
        }
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppBackgrounded() {
        C0f9.A0A(2013425841, C0f9.A03(682402426));
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppForegrounded() {
        int A03 = C0f9.A03(-281061912);
        C2NX c2nx = this.A00;
        CallerContext callerContext = C2NX.A08;
        if (C18U.A06(C06090Tz.A05, c2nx.A04, 36326816210040975L)) {
            AbstractC166987dD.A1Z(new PYs(this, null, 46), c2nx.A07);
        } else {
            A00(this);
        }
        C0f9.A0A(1919027760, A03);
    }
}
