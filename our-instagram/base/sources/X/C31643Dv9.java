package X;

import java.util.List;

/* renamed from: X.Dv9, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31643Dv9 implements InterfaceC169507hQ {
    public boolean A00;
    public final JR2 A01;

    public C31643Dv9(JR2 jr2) {
        C14360o3.A0B(jr2, 1);
        this.A01 = jr2;
    }

    @Override // X.InterfaceC169507hQ
    public final void DcI(InterfaceC169517hR interfaceC169517hR) {
        C14360o3.A0B(interfaceC169517hR, 0);
        this.A00 = interfaceC169517hR.isLoading();
        List list = ((C31671Dvc) interfaceC169517hR.Bov()).A01;
        if (!list.isEmpty()) {
            JR2 jr2 = this.A01;
            if (C18U.A06(C06090Tz.A06, jr2.A0p(), 36322169055946796L)) {
                jr2.A0z = list;
            } else {
                jr2.A0q().A0A(list, 0);
            }
            jr2.A0v().A0E("suggested_threads_fetch_succeeded");
            return;
        }
        C43626JRj.A03(this.A01.A0q());
    }
}
