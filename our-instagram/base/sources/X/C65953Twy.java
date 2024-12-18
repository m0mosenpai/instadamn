package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Twy, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C65953Twy extends C1I2 {
    public C3FQ A00;
    public final InterfaceC71954XCg A01;
    public final C65785Tu3 A02;

    public C65953Twy(UserSession userSession, InterfaceC62612t0 interfaceC62612t0, Integer num, int i) {
        AbstractC167007dF.A1F(userSession, 1, interfaceC62612t0);
        Tx6 tx6 = new Tx6(this);
        this.A01 = tx6;
        this.A02 = new C65785Tu3(userSession, interfaceC62612t0, tx6, C05F.A00, num, i, true);
    }

    @Override // X.C1I2
    public final void onScroll(C3FQ c3fq, int i, int i2, int i3, int i4, int i5) {
        int A03 = C0f9.A03(1371923185);
        C14360o3.A0B(c3fq, 0);
        this.A00 = c3fq;
        C65785Tu3 c65785Tu3 = this.A02;
        if (c65785Tu3.A05 == C05F.A01 && C65785Tu3.A00(c65785Tu3, i, i2, i3)) {
            c65785Tu3.A02.AD4();
        }
        C0f9.A0A(-597590489, A03);
    }

    @Override // X.C1I2
    public final void onScrollStateChanged(C3FQ c3fq, int i) {
        int count;
        int A0N = AbstractC167017dG.A0N(c3fq, 1933427799);
        this.A00 = c3fq;
        if (i == 0) {
            C65785Tu3 c65785Tu3 = this.A02;
            int B6q = c3fq.B6q();
            int BM3 = (c3fq.BM3() - c3fq.B6q()) + 1;
            InterfaceC65242xM AZU = c3fq.AZU();
            if (AZU != null) {
                count = AZU.getCount();
            } else {
                count = c3fq.getCount();
            }
            if (c65785Tu3.A05 == C05F.A00 && C65785Tu3.A00(c65785Tu3, B6q, BM3, count)) {
                c65785Tu3.A02.AD4();
            }
        }
        C0f9.A0A(-1856053484, A0N);
    }
}
