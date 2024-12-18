package X;

import com.instagram.common.session.UserSession;
import java.util.List;
import kotlin.Deprecated;

/* loaded from: classes8.dex */
public final class JTM implements MSJ {
    public boolean A00;
    public final C42201xA A01;
    public final C42201xA A02;
    public final C42201xA A03;
    public final C42201xA A04;
    public final C42201xA A05;
    public final C42201xA A06;
    public final C42201xA A07;
    public final C42201xA A08;
    public final C42221xC A09;
    public final UserSession A0A;
    public final C44043JdU A0B;
    public final C42221xC A0C;
    public final C5Fn A0D;
    public final C41761wQ A0E;

    public JTM(C42221xC c42221xC, C42221xC c42221xC2, C5Fn c5Fn, UserSession userSession, C44043JdU c44043JdU, AbstractC46972Dl abstractC46972Dl, boolean z, boolean z2, boolean z3) {
        this.A0A = userSession;
        this.A0B = c44043JdU;
        this.A0C = c42221xC;
        this.A09 = c42221xC2;
        this.A0D = c5Fn;
        C42201xA A00 = AbstractC42021ws.A00();
        this.A07 = A00;
        this.A06 = AbstractC42021ws.A01(new C44042JdT());
        this.A05 = AbstractC42021ws.A01(abstractC46972Dl);
        this.A01 = AbstractC42021ws.A01(Boolean.valueOf(z));
        this.A04 = AbstractC42021ws.A01(AbstractC166997dE.A0a());
        this.A02 = AbstractC42021ws.A01(Boolean.valueOf(z2));
        this.A03 = AbstractC42021ws.A01(Boolean.valueOf(z3));
        this.A08 = AbstractC42021ws.A01(true);
        this.A0E = AbstractC31174DnI.A0S();
        A00.accept(C4JK.A00);
    }

    @Override // X.MR3
    public final void AX3() {
    }

    @Override // X.MSJ
    @Deprecated(message = "Use viewModelObservable() instead")
    public final List Av6() {
        return null;
    }

    @Override // X.MSJ
    public final int CCs() {
        return 0;
    }

    @Override // X.MSJ
    public final void FD1(C2EC c2ec) {
    }

    @Override // X.MSJ
    public final void FD2(java.util.Set set) {
    }

    @Override // X.MSJ
    public final C43918JbT AFJ() {
        InterfaceC50517MRu interfaceC50517MRu;
        C46h c46h = (C46h) this.A07.A0W();
        if (c46h != null && (interfaceC50517MRu = (InterfaceC50517MRu) c46h.A04()) != null) {
            int count = interfaceC50517MRu.getCount();
            int i = 0;
            int i2 = 0;
            for (int i3 = 0; i3 < count; i3++) {
                if (interfaceC50517MRu.Cf7(i3)) {
                    i++;
                    if (!interfaceC50517MRu.CZ5(i3)) {
                        i2++;
                    }
                }
            }
            return new C43918JbT(i, 0, i, i2);
        }
        return new C43918JbT(0, 0, 0, 0);
    }

    @Override // X.MSJ
    public final void EWR(boolean z) {
        this.A01.accept(Boolean.valueOf(z));
    }

    @Override // X.MSJ
    public final void EWV(boolean z) {
        this.A02.accept(Boolean.valueOf(z));
    }

    @Override // X.MSJ
    public final void EWW(boolean z) {
        this.A03.accept(Boolean.valueOf(z));
    }

    @Override // X.MSJ
    public final void EWg(boolean z) {
        this.A04.accept(Boolean.valueOf(z));
    }

    @Override // X.MSJ
    public final void EWh(boolean z) {
        if (C18U.A06(C06090Tz.A05, this.A0A, 36325819777299860L)) {
            this.A00 = false;
            this.A08.accept(Boolean.valueOf(z));
        } else {
            this.A00 = true;
        }
    }

    @Override // X.MR3
    public final void EdV(AbstractC46972Dl abstractC46972Dl) {
        this.A05.accept(abstractC46972Dl);
    }

    @Override // X.MSJ
    public final void EdW(C3o9 c3o9) {
        C42201xA c42201xA = this.A06;
        if (!c3o9.equals(c42201xA.A0W())) {
            c42201xA.accept(c3o9);
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [X.JdW] */
    @Override // X.MR3
    public final C42221xC FDh() {
        C42201xA c42201xA = this.A07;
        C42221xC A0C = this.A05.A0C();
        C42221xC A0C2 = this.A01.A0C();
        C42221xC A0C3 = this.A04.A0C();
        C42221xC A0C4 = this.A02.A0C();
        C42221xC A0C5 = this.A03.A0C();
        C42221xC A0C6 = this.A06.A0C();
        C42221xC c42221xC = this.A09;
        final C44051Jdc c44051Jdc = C44051Jdc.A00;
        AbstractC42051wv abstractC42051wv = ((C42221xC) c42201xA).A00;
        AbstractC42051wv abstractC42051wv2 = A0C.A00;
        AbstractC42051wv abstractC42051wv3 = A0C2.A00;
        AbstractC42051wv abstractC42051wv4 = A0C3.A00;
        AbstractC42051wv abstractC42051wv5 = A0C4.A00;
        AbstractC42051wv abstractC42051wv6 = A0C5.A00;
        AbstractC42051wv abstractC42051wv7 = A0C6.A00;
        AbstractC42051wv abstractC42051wv8 = c42221xC.A00;
        c44051Jdc.getClass();
        ?? r1 = new Object() { // from class: X.JdW
        };
        AbstractC42141x4.A01(abstractC42051wv, "source1 is null");
        AbstractC42141x4.A01(abstractC42051wv2, "source2 is null");
        AbstractC42141x4.A01(abstractC42051wv3, "source3 is null");
        AbstractC42141x4.A01(abstractC42051wv4, "source4 is null");
        AbstractC42141x4.A01(abstractC42051wv5, "source5 is null");
        AbstractC42141x4.A01(abstractC42051wv6, "source6 is null");
        AbstractC42141x4.A01(abstractC42051wv7, "source7 is null");
        AbstractC42141x4.A01(abstractC42051wv8, "source8 is null");
        C42221xC c42221xC2 = new C42221xC(AbstractC42051wv.A00(new JRN(r1), new InterfaceC42061ww[]{abstractC42051wv, abstractC42051wv2, abstractC42051wv3, abstractC42051wv4, abstractC42051wv5, abstractC42051wv6, abstractC42051wv7, abstractC42051wv8}, AbstractC137366Kh.A00));
        UserSession userSession = this.A0A;
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, userSession, 36325819777299860L)) {
            c42221xC2 = C43597JQd.A01(C42221xC.A01(C44146JfB.A00, c42221xC2, this.A08.A0C()), new C50354MLg(this, 6), 31);
            C14360o3.A0A(c42221xC2);
        }
        C5Fn c5Fn = this.A0D;
        AbstractC44046JdX abstractC44046JdX = new AbstractC44046JdX(new C72105XNz(c42221xC2.A00));
        AbstractC150996r0 abstractC150996r0 = c5Fn.A00;
        AbstractC42141x4.A01(abstractC150996r0, "scheduler is null");
        C42221xC A00 = C43597JQd.A00(new C42221xC(new C43932Jbh(new C43933Jbi(abstractC44046JdX, abstractC150996r0))), this, 32);
        if (C18U.A06(c06090Tz, userSession, 36325819777496471L)) {
            C42221xC A0H = A00.A0H(new C43923JbY(C44034JdL.A00, 2));
            C14360o3.A0A(A0H);
            return A0H;
        }
        return A00;
    }

    @Override // X.MR3
    public final void cancel() {
        this.A0E.A01();
    }

    @Override // X.MR3
    public final void start() {
        this.A0E.A02(this.A0C, this.A07);
    }
}
