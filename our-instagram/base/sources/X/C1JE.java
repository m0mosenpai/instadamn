package X;

/* renamed from: X.1JE, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1JE {
    public C2050595u A00;
    public C2050595u A01;
    public C2050595u A02;
    public C2050595u A03;
    public C2050595u A04;
    public C2050595u A05;
    public AnonymousClass155 A06;
    public final AnonymousClass150 A07;

    public final void A00(C2050595u c2050595u, Short sh) {
        short shortValue;
        if (c2050595u != null) {
            try {
                AnonymousClass150 anonymousClass150 = this.A07;
                if (sh == null) {
                    shortValue = 2;
                } else {
                    shortValue = sh.shortValue();
                }
                c2050595u.A00(shortValue);
                anonymousClass150.CjC(c2050595u);
            } catch (Exception e) {
                this.A06.A00.EmP("MobileBoost", "TrackingError", e);
            }
        }
    }

    public C1JE(AnonymousClass155 anonymousClass155, AnonymousClass150 anonymousClass150) {
        this.A07 = anonymousClass150;
        this.A06 = anonymousClass155;
    }
}
