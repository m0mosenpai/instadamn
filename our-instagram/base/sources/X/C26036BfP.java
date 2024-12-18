package X;

/* renamed from: X.BfP, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26036BfP extends C0T6 {
    public final boolean A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26036BfP) {
                C26036BfP c26036BfP = (C26036BfP) obj;
                if (this.A03 != c26036BfP.A03 || this.A04 != c26036BfP.A04 || this.A02 != c26036BfP.A02 || this.A01 != c26036BfP.A01 || this.A00 != c26036BfP.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A00, AbstractC167007dF.A0D(this.A01, AbstractC167007dF.A0D(this.A02, AbstractC167007dF.A0D(this.A04, AbstractC25225BEi.A08(this.A03)))));
    }

    public C26036BfP(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.A03 = z;
        this.A04 = z2;
        this.A02 = z3;
        this.A01 = z4;
        this.A00 = z5;
    }

    public C26036BfP() {
        this(false, false, false, false, false);
    }
}
