package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Tu2, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C65784Tu2 extends C1I7 {
    public final C65785Tu3 A00;
    public final C65786Tu4 A01;

    public C65784Tu2(UserSession userSession, InterfaceC62612t0 interfaceC62612t0, InterfaceC65242xM interfaceC65242xM, Integer num, int i, boolean z, boolean z2) {
        Integer num2;
        C65786Tu4 c65786Tu4 = new C65786Tu4(interfaceC65242xM);
        this.A01 = c65786Tu4;
        if (z) {
            num2 = C05F.A00;
        } else {
            num2 = C05F.A01;
        }
        this.A00 = new C65785Tu3(userSession, interfaceC62612t0, c65786Tu4, num2, num, i, z2);
    }

    @Override // X.C1I7, X.C1I2
    public final void onScroll(C3FQ c3fq, int i, int i2, int i3, int i4, int i5) {
        int A03 = C0f9.A03(-1202991376);
        C65785Tu3 c65785Tu3 = this.A00;
        if (c65785Tu3.A05 == C05F.A01 && C65785Tu3.A00(c65785Tu3, i, i2, i3)) {
            c65785Tu3.A02.AD4();
        }
        C0f9.A0A(-751222886, A03);
    }

    @Override // X.C1I2
    public final void onScrollStateChanged(C3FQ c3fq, int i) {
        int A0N = AbstractC167017dG.A0N(c3fq, -951554787);
        InterfaceC65242xM AZU = c3fq.AZU();
        if (i == 0 && AZU != null) {
            C65785Tu3 c65785Tu3 = this.A00;
            int B6q = c3fq.B6q();
            int BM3 = (c3fq.BM3() - c3fq.B6q()) + 1;
            int count = AZU.getCount();
            if (c65785Tu3.A05 == C05F.A00 && C65785Tu3.A00(c65785Tu3, B6q, BM3, count)) {
                c65785Tu3.A02.AD4();
            }
        }
        C0f9.A0A(-74519864, A0N);
    }

    public C65784Tu2(UserSession userSession, InterfaceC62612t0 interfaceC62612t0, InterfaceC65242xM interfaceC65242xM, Integer num, int i, boolean z) {
        Integer num2;
        C65786Tu4 c65786Tu4 = new C65786Tu4(interfaceC65242xM);
        this.A01 = c65786Tu4;
        if (z) {
            num2 = C05F.A00;
        } else {
            num2 = C05F.A01;
        }
        this.A00 = new C65785Tu3(userSession, interfaceC62612t0, c65786Tu4, num2, num, i, true);
    }
}
