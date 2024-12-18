package X;

/* loaded from: classes8.dex */
public final class JR7 implements InterfaceC42271xH {
    public final /* synthetic */ C43626JRj A00;
    public final /* synthetic */ JR2 A01;
    public final /* synthetic */ MSJ A02;

    public JR7(C43626JRj c43626JRj, JR2 jr2, MSJ msj) {
        this.A01 = jr2;
        this.A00 = c43626JRj;
        this.A02 = msj;
    }

    @Override // X.InterfaceC42271xH
    public final /* bridge */ /* synthetic */ boolean A79(Object obj) {
        C2AS c2as = (C2AS) obj;
        C14360o3.A0B(c2as, 0);
        JR2 jr2 = this.A01;
        if (jr2.A1L.getContext() != null && c2as.A00.equals(C17060sy.A01.A01(jr2.A0p()))) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC41501vz
    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int i;
        C56352iT c56352iT;
        int A03 = C0f9.A03(-1583928908);
        int A032 = C0f9.A03(583385506);
        JR2 jr2 = this.A01;
        C43626JRj c43626JRj = this.A00;
        MSJ msj = this.A02;
        boolean A0f = JR2.A0f(c43626JRj, jr2, msj);
        boolean A0g = JR2.A0g(c43626JRj, jr2, msj);
        msj.EWR(C2E8.A05(jr2.A0p()));
        c43626JRj.A0C(A0f);
        if (C2E9.A05(jr2.A0p())) {
            i = 0;
        } else {
            i = 1;
            if (A0g) {
                i = 2;
            }
        }
        jr2.A01 = i;
        jr2.A17(null);
        C43935Jbk c43935Jbk = jr2.A1O;
        if (c43935Jbk != null) {
            JR3 jr3 = c43935Jbk.A00;
            C31261Doj c31261Doj = jr3.A02;
            if (c31261Doj != null && c31261Doj.A04.isResumed() && (c56352iT = c31261Doj.A00) != null) {
                c56352iT.A0T();
            }
            C31256Doe c31256Doe = jr3.A04;
            if (c31256Doe != null) {
                C31256Doe.A01(c31256Doe);
            }
        }
        C0f9.A0A(-780800601, A032);
        C0f9.A0A(326072738, A03);
    }
}
