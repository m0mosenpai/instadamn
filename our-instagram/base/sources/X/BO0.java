package X;

/* loaded from: classes5.dex */
public final class BO0 extends C0T6 {
    public final boolean A00;
    public final boolean A01;
    public final boolean A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BO0) {
                BO0 bo0 = (BO0) obj;
                if (this.A00 != bo0.A00 || this.A02 != bo0.A02 || this.A01 != bo0.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A01, AbstractC167007dF.A0D(this.A02, AbstractC25225BEi.A08(this.A00)));
    }

    public BO0(boolean z, boolean z2, boolean z3) {
        this.A00 = z;
        this.A02 = z2;
        this.A01 = z3;
    }
}
