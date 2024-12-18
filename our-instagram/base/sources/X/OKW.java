package X;

/* loaded from: classes9.dex */
public final class OKW {
    public final C05A A00;
    public final C0UO A01;

    public final void A00(boolean z) {
        C05A c05a = this.A00;
        C50525MSe c50525MSe = (C50525MSe) c05a.getValue();
        c05a.Egh(new C50525MSe(c50525MSe.A01, 5, z, c50525MSe.A03, c50525MSe.A00));
    }

    public final void A01(boolean z) {
        C05A c05a = this.A00;
        C50525MSe c50525MSe = (C50525MSe) c05a.getValue();
        c05a.Egh(new C50525MSe(c50525MSe.A01, 5, c50525MSe.A02, c50525MSe.A03, z));
    }

    public OKW() {
        C008002u A1H = AbstractC25225BEi.A1H(new C50525MSe(4, 5, false, true, false, false));
        this.A00 = A1H;
        this.A01 = AbstractC208910l.A02(A1H);
    }
}
