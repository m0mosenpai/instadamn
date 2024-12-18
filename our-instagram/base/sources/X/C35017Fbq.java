package X;

/* renamed from: X.Fbq, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35017Fbq {
    public static C35017Fbq A02;
    public boolean A00 = false;
    public final InterfaceC41501vz A01 = new C36155FxU(this, 2);

    public final synchronized void A01() {
        if (!this.A00) {
            this.A00 = true;
            C41451vu.A01.A02(this.A01, AbstractC36034FvW.class);
        }
    }

    public final synchronized void A02() {
        C41451vu.A01.A03(this.A01, AbstractC36034FvW.class);
        this.A00 = false;
    }

    public static C35017Fbq A00() {
        C35017Fbq c35017Fbq = A02;
        if (c35017Fbq == null) {
            C35017Fbq c35017Fbq2 = new C35017Fbq();
            A02 = c35017Fbq2;
            return c35017Fbq2;
        }
        return c35017Fbq;
    }
}
