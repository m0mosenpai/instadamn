package X;

/* loaded from: classes5.dex */
public final class BH2 extends C0T6 {
    public final int A00;
    public final C5Hc A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;

    public BH2(C5Hc c5Hc, int i, boolean z, boolean z2, boolean z3) {
        C14360o3.A0B(c5Hc, 1);
        this.A01 = c5Hc;
        this.A03 = z;
        this.A00 = i;
        this.A02 = z2;
        this.A04 = z3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BH2) {
                BH2 bh2 = (BH2) obj;
                if (!C14360o3.A0K(this.A01, bh2.A01) || this.A03 != bh2.A03 || this.A00 != bh2.A00 || this.A02 != bh2.A02 || this.A04 != bh2.A04) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A04, AbstractC167007dF.A0D(this.A02, (AbstractC167007dF.A0D(this.A03, AbstractC166987dD.A0G(this.A01)) + this.A00) * 31));
    }

    public BH2() {
        this(C5HZ.A01, Integer.MAX_VALUE, false, false, false);
    }
}
