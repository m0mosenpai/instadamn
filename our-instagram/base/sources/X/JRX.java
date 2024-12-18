package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class JRX implements MRN {
    public final C42221xC A00;
    public final AbstractC42211xB A01;
    public final AbstractC42211xB A02;
    public final C5Fn A03;
    public final AbstractC42211xB A04;
    public final UserSession A05;
    public final C44041JdS A06;
    public final JTM A07;

    public JRX(C42221xC c42221xC, C42221xC c42221xC2, C5Fn c5Fn, C5Fn c5Fn2, UserSession userSession, C44043JdU c44043JdU, AbstractC46972Dl abstractC46972Dl, C4I3 c4i3, boolean z, boolean z2, boolean z3) {
        C14360o3.A0B(c5Fn2, 3);
        this.A05 = userSession;
        this.A03 = c5Fn2;
        this.A00 = c42221xC;
        this.A02 = AbstractC42021ws.A01(new C51761Mtk(abstractC46972Dl, AbstractC166997dE.A0a()));
        this.A01 = AbstractC42021ws.A01(c4i3);
        this.A04 = AbstractC42021ws.A00();
        this.A06 = new C44041JdS();
        C42221xC c42221xC3 = this.A00;
        C42221xC A0C = this.A01.A0C();
        C5Fn c5Fn3 = this.A03;
        this.A07 = new JTM(C43597JQd.A00(C42221xC.A03(JRV.A00, c42221xC3, A0C.A0O(c5Fn3), this.A02.A0C().A0O(c5Fn3)), this, 29), c42221xC2, c5Fn, userSession, c44043JdU, abstractC46972Dl, z, z2, z3);
    }

    @Override // X.MRN
    public final C42221xC AED() {
        return C42221xC.A09(new C51729Mt8(3, 2, false));
    }

    @Override // X.MRN
    public final void Efi(C4I3 c4i3) {
        C14360o3.A0B(c4i3, 0);
        this.A01.accept(c4i3);
    }

    public static final C46h A00(JRW jrw, JRX jrx) {
        Integer num;
        if (jrw.A01 == C4I3.A03 && (((num = jrw.A02) != null && (num.intValue() == -1 || num.intValue() == 0)) || AbstractC137186Ix.A00(jrx.A05))) {
            C46h c46h = jrw.A00;
            C14360o3.A06(c46h);
            return c46h;
        }
        InterfaceC50517MRu interfaceC50517MRu = InterfaceC50517MRu.A01;
        interfaceC50517MRu.getClass();
        return new C4JL(interfaceC50517MRu);
    }

    @Override // X.MRN
    public final C42221xC AVJ() {
        return this.A01.A0C();
    }

    @Override // X.MRN
    public final C42221xC AWK() {
        return this.A02.A0C();
    }

    @Override // X.MRN
    public final MSI B7D() {
        return this.A06;
    }

    @Override // X.MRN
    public final MSJ C7c() {
        return this.A07;
    }

    @Override // X.MRN
    public final C42221xC E41() {
        return this.A04;
    }

    @Override // X.MRN
    public final void EUg(C51761Mtk c51761Mtk) {
        this.A02.accept(c51761Mtk);
    }

    @Override // X.MRN
    public final void Ead(int i) {
        this.A04.accept(Integer.valueOf(i));
    }

    @Override // X.MRN
    public final C42221xC Eq6() {
        C42221xC c42221xC = this.A00;
        C42221xC A0C = this.A01.A0C();
        C5Fn c5Fn = this.A03;
        return C43597JQd.A00(C42221xC.A03(JRV.A00, c42221xC, A0C.A0O(c5Fn), this.A02.A0C().A0O(c5Fn)), this, 30);
    }
}
