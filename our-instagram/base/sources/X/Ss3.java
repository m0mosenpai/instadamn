package X;

/* loaded from: classes10.dex */
public final class Ss3 implements InterfaceC65310Thm {
    public final C58799QAg A00;
    public final C58799QAg A01;
    public final C58799QAg A02;
    public final Integer A03;
    public final boolean A04;

    @Override // X.InterfaceC65310Thm
    public final InterfaceC65466Tki EqE(SQ2 sq2, Q2O q2o, AbstractC63678Srl abstractC63678Srl) {
        return new C63665SrY(this, abstractC63678Srl);
    }

    public Ss3(C58799QAg c58799QAg, C58799QAg c58799QAg2, C58799QAg c58799QAg3, Integer num, boolean z) {
        this.A03 = num;
        this.A02 = c58799QAg;
        this.A00 = c58799QAg2;
        this.A01 = c58799QAg3;
        this.A04 = z;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("Trim Path: {start: ");
        A1C.append(this.A02);
        A1C.append(AbstractC111324zv.A00(1412));
        A1C.append(this.A00);
        A1C.append(", offset: ");
        return JQ0.A0l(this.A01, A1C);
    }
}
