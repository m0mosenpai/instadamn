package X;

import com.google.android.gms.common.Feature;

/* renamed from: X.SYp, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62947SYp {
    public InterfaceC65406Tjd A01;
    public Feature[] A03;
    public boolean A02 = true;
    public int A00 = 0;

    public static C5KS A00(C61Q c61q, C62947SYp c62947SYp, int i, int i2) {
        c62947SYp.A00 = i;
        return C61Q.A00(c61q, c62947SYp.A01(), i2);
    }

    public final SWk A01() {
        C3U5.A08(AbstractC167007dF.A1W(this.A01), "execute parameter required");
        return new SWk(this, this.A03, this.A00, this.A02);
    }
}
