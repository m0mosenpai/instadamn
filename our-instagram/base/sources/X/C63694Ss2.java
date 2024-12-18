package X;

/* renamed from: X.Ss2, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63694Ss2 implements InterfaceC65310Thm {
    public final C58799QAg A00;
    public final InterfaceC65535Tm7 A01;
    public final InterfaceC65535Tm7 A02;
    public final String A03;
    public final boolean A04;

    @Override // X.InterfaceC65310Thm
    public final InterfaceC65466Tki EqE(SQ2 sq2, Q2O q2o, AbstractC63678Srl abstractC63678Srl) {
        return new C63670Srd(q2o, this, abstractC63678Srl);
    }

    public C63694Ss2(C58799QAg c58799QAg, InterfaceC65535Tm7 interfaceC65535Tm7, InterfaceC65535Tm7 interfaceC65535Tm72, String str, boolean z) {
        this.A03 = str;
        this.A01 = interfaceC65535Tm7;
        this.A02 = interfaceC65535Tm72;
        this.A00 = c58799QAg;
        this.A04 = z;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("RectangleShape{position=");
        A1C.append(this.A01);
        A1C.append(", size=");
        return AbstractC58320PtC.A11(this.A02, A1C);
    }
}
