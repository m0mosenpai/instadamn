package X;

/* renamed from: X.3Eq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C70543Eq {
    public double A00;
    public boolean A01;
    public boolean A02;
    public final String A03;

    public final void A00(double d, boolean z) {
        boolean z2 = true;
        if (!this.A02) {
            if (d >= 1.0d) {
                C1KM.A09.A0K(this.A03, ((C1KP) C1KM.A00()).A01);
                this.A02 = z2;
            }
        } else {
            z2 = false;
            if (d == 0.0d) {
                C1KM.A08(this.A03);
                this.A02 = z2;
            }
        }
        if (!this.A01 && z) {
            C1KM.A09(this.A03);
        }
        this.A00 = d;
        this.A01 = z;
    }

    public C70543Eq(String str) {
        this.A03 = str;
    }
}
