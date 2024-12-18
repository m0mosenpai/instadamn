package X;

/* renamed from: X.UPp, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66627UPp extends C0T6 {
    public final boolean A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C66627UPp) {
                C66627UPp c66627UPp = (C66627UPp) obj;
                if (this.A01 != c66627UPp.A01 || this.A04 != c66627UPp.A04 || this.A02 != c66627UPp.A02 || this.A00 != c66627UPp.A00 || this.A03 != c66627UPp.A03) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 1237;
        if (this.A01) {
            i = 1231;
        }
        int A0D = (AbstractC167007dF.A0D(this.A00, AbstractC167007dF.A0D(this.A02, AbstractC167007dF.A0D(this.A04, i * 31))) + AbstractC53644Nnp.A00()) * 31;
        int i2 = 1237;
        if (this.A03) {
            i2 = 1231;
        }
        return A0D + i2;
    }

    public C66627UPp(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.A01 = z;
        this.A04 = z2;
        this.A02 = z3;
        this.A00 = z4;
        this.A03 = z5;
    }

    public C66627UPp() {
        this(false, false, false, false, false);
    }
}
