package X;

/* renamed from: X.U7m, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66291U7m extends AbstractC61812ri {
    public final /* synthetic */ C69457Vng A00;

    public C66291U7m(C69457Vng c69457Vng) {
        this.A00 = c69457Vng;
    }

    @Override // X.AbstractC61812ri
    public final boolean A01(int i, int i2) {
        C69457Vng c69457Vng = this.A00;
        boolean z = false;
        boolean z2 = false;
        c69457Vng.A01 = false;
        if (i2 > 0) {
            z = true;
        }
        float abs = Math.abs(i2);
        if (abs > c69457Vng.A03 && z) {
            C66290U7l c66290U7l = c69457Vng.A0A;
            C69457Vng c69457Vng2 = c66290U7l.A03;
            if (c69457Vng2 != null) {
                c69457Vng2.A01 = true;
            }
            z2 = C66290U7l.A02(c66290U7l, true);
        } else {
            if (abs > c69457Vng.A02) {
                C66290U7l c66290U7l2 = c69457Vng.A0A;
                if (z) {
                    z2 = C66290U7l.A02(c66290U7l2, false);
                } else {
                    z2 = c66290U7l2.A08();
                }
            }
            return z2;
        }
        c69457Vng.A01 = z2;
        return z2;
    }
}
