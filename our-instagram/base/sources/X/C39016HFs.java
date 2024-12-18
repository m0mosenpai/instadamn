package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.HFs, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39016HFs extends C1P1 {
    public int A00;
    public final /* synthetic */ UserSession A01;

    public C39016HFs(UserSession userSession) {
        this.A01 = userSession;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03 = C0f9.A03(198001519);
        int i = this.A00;
        if (i < 7) {
            int pow = ((int) (2.0d * Math.pow(2.0d, i))) * 1000;
            this.A00 = i + 1;
            C1ON A00 = IBB.A00(this.A01);
            A00.A00 = this;
            C1GJ.A05(A00, 524, 4, pow, false, false);
        }
        C0f9.A0A(1988293278, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        InterfaceC19610xo ARD;
        int A03 = C0f9.A03(-1068593234);
        int A032 = C0f9.A03(-2137167357);
        this.A00 = 0;
        InterfaceC19630xq interfaceC19630xq = IBB.A00;
        if (interfaceC19630xq != null && (ARD = interfaceC19630xq.ARD()) != null) {
            ARD.E7G(AbstractC111324zv.A00(1683), System.currentTimeMillis());
            ARD.apply();
        }
        C0f9.A0A(-1662518003, A032);
        C0f9.A0A(-1248968807, A03);
    }
}
