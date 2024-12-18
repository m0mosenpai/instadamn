package X;

/* renamed from: X.Ss1, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63693Ss1 implements InterfaceC65310Thm {
    public final C58804QAl A00;
    public final String A01;
    public final boolean A02;
    public final int A03;

    @Override // X.InterfaceC65310Thm
    public final InterfaceC65466Tki EqE(SQ2 sq2, Q2O q2o, AbstractC63678Srl abstractC63678Srl) {
        return new C63668Srb(q2o, this, abstractC63678Srl);
    }

    public final String toString() {
        return AnonymousClass001.A0l("ShapePath{name=", this.A01, MSV.A00(290), '}', this.A03);
    }

    public C63693Ss1(C58804QAl c58804QAl, String str, int i, boolean z) {
        this.A01 = str;
        this.A03 = i;
        this.A00 = c58804QAl;
        this.A02 = z;
    }
}
