package X;

/* loaded from: classes5.dex */
public final class BLC extends C0T6 {
    public final int A00;
    public final long A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public BLC(EnumC37731Gj6 enumC37731Gj6, Long l, Long l2, int i, long j) {
        this.A00 = i;
        this.A01 = j;
        this.A02 = l;
        this.A04 = l2;
        this.A03 = enumC37731Gj6;
    }

    public final boolean equals(Object obj) {
        int i;
        if (this.A00 != 0) {
            if (this != obj) {
                i = 1;
            } else {
                return true;
            }
        } else if (this != obj) {
            i = 0;
        } else {
            return true;
        }
        if (obj instanceof BLC) {
            BLC blc = (BLC) obj;
            if (blc.A00 != i || this.A01 != blc.A01 || !C14360o3.A0K(this.A02, blc.A02) || !C14360o3.A0K(this.A04, blc.A04) || this.A03 != blc.A03) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((AbstractC25235BEs.A03(this.A01) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC167017dG.A0M(this.A04)) * 31) + AbstractC166997dE.A0I(this.A03);
    }
}
