package X;

/* loaded from: classes9.dex */
public final class OIz {
    public O5D A00;
    public final C54452O4g A01;
    public final C05A A02;
    public final C0UO A03;

    public final void A00(Boolean bool) {
        boolean z;
        if (bool != null) {
            C05A c05a = this.A02;
            C51864Mw8 c51864Mw8 = (C51864Mw8) c05a.getValue();
            boolean booleanValue = bool.booleanValue();
            C51864Mw8 c51864Mw82 = (C51864Mw8) c05a.getValue();
            if (c51864Mw82 != null) {
                z = c51864Mw82.A03;
            } else {
                z = false;
            }
            c05a.F8m(new C51864Mw8(booleanValue, z, c51864Mw8.A01, c51864Mw8.A02));
        }
    }

    public OIz(C54452O4g c54452O4g) {
        this.A01 = c54452O4g;
        C008002u A1H = AbstractC25225BEi.A1H(new C51864Mw8(false, false, false, false));
        this.A02 = A1H;
        this.A03 = AbstractC208910l.A02(A1H);
    }
}
