package X;

/* loaded from: classes5.dex */
public final class BHZ extends C0T6 {
    public final Integer A00;
    public final Integer A01;
    public final Integer A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BHZ) {
                BHZ bhz = (BHZ) obj;
                if (!C14360o3.A0K(this.A01, bhz.A01) || !C14360o3.A0K(this.A00, bhz.A00) || !C14360o3.A0K(this.A02, bhz.A02) || this.A04 != bhz.A04 || this.A03 != bhz.A03 || this.A05 != bhz.A05) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A05, AbstractC167007dF.A0D(this.A03, AbstractC167007dF.A0D(this.A04, ((((AbstractC167017dG.A0M(this.A01) * 31) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC166997dE.A0I(this.A02)) * 31)));
    }

    public BHZ(Integer num, Integer num2, Integer num3, boolean z, boolean z2, boolean z3) {
        this.A01 = num;
        this.A00 = num2;
        this.A02 = num3;
        this.A04 = z;
        this.A03 = z2;
        this.A05 = z3;
    }

    public BHZ() {
        this(null, null, null, false, true, true);
    }
}
