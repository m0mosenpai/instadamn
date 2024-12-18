package X;

/* renamed from: X.Sw5, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63930Sw5 implements C0CC {
    public C19280xC A00;
    public volatile InterfaceC11360iu A01;

    @Override // X.C0CC
    public final void A7L(String str, String str2) {
        "mobile_power_stats".getClass();
        this.A00 = C19280xC.A01("mobile_power_stats", null);
    }

    @Override // X.C0CC
    public final void A7k(String str, double d) {
        C19280xC c19280xC = this.A00;
        if (c19280xC != null) {
            c19280xC.A0A(str, Double.valueOf(d));
        }
    }

    @Override // X.C0CC
    public final void A7l(String str, int i) {
        C19280xC c19280xC = this.A00;
        if (c19280xC != null) {
            AbstractC58318PtA.A1O(c19280xC, str, i);
        }
    }

    @Override // X.C0CC
    public final void A7m(String str, long j) {
        C19280xC c19280xC = this.A00;
        if (c19280xC != null) {
            c19280xC.A0B(str, Long.valueOf(j));
        }
    }

    @Override // X.C0CC
    public final void A7n(String str, String str2) {
        C19280xC c19280xC = this.A00;
        if (c19280xC != null) {
            c19280xC.A0C(str, str2);
        }
    }

    @Override // X.C0CC
    public final void CiO() {
        C19280xC c19280xC = this.A00;
        if (c19280xC != null) {
            this.A01.EHW(c19280xC);
            this.A00 = null;
        }
    }

    @Override // X.C0CC
    public final boolean isSampled() {
        return AbstractC167007dF.A1W(this.A00);
    }
}
