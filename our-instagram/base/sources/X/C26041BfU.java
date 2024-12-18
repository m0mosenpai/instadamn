package X;

/* renamed from: X.BfU, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26041BfU extends C0T6 {
    public final int A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;

    public C26041BfU(int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.A00 = i;
        if (i != 0) {
            this.A05 = z;
            this.A03 = z2;
            this.A02 = z3;
            this.A01 = z4;
            this.A06 = z5;
            this.A04 = z6;
            return;
        }
        this.A02 = z;
        this.A01 = z2;
        this.A04 = z3;
        this.A05 = z4;
        this.A06 = z5;
        this.A03 = z6;
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this.A00 != 0) {
            if (this != obj) {
                if (obj instanceof C26041BfU) {
                    C26041BfU c26041BfU = (C26041BfU) obj;
                    if (c26041BfU.A00 == 1 && this.A05 == c26041BfU.A05 && this.A03 == c26041BfU.A03 && this.A02 == c26041BfU.A02 && this.A01 == c26041BfU.A01 && this.A06 == c26041BfU.A06) {
                        z = this.A04;
                        z2 = c26041BfU.A04;
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else if (this != obj) {
            if (!(obj instanceof C26041BfU)) {
                return false;
            }
            C26041BfU c26041BfU2 = (C26041BfU) obj;
            if (c26041BfU2.A00 != 0 || this.A02 != c26041BfU2.A02 || this.A01 != c26041BfU2.A01 || this.A04 != c26041BfU2.A04 || this.A05 != c26041BfU2.A05 || this.A06 != c26041BfU2.A06) {
                return false;
            }
            z = this.A03;
            z2 = c26041BfU2.A03;
        } else {
            return true;
        }
        if (z != z2) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A0D;
        boolean z;
        if (this.A00 != 0) {
            A0D = AbstractC167007dF.A0D(this.A06, AbstractC167007dF.A0D(this.A01, AbstractC167007dF.A0D(this.A02, AbstractC167007dF.A0D(this.A03, AbstractC25225BEi.A08(this.A05)))));
            z = this.A04;
        } else {
            A0D = AbstractC167007dF.A0D(this.A06, AbstractC167007dF.A0D(this.A05, AbstractC167007dF.A0D(this.A04, AbstractC167007dF.A0D(this.A01, AbstractC25225BEi.A08(this.A02)))));
            z = this.A03;
        }
        return AbstractC166987dD.A0K(z, A0D);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C26041BfU() {
        this(1, true, false, false, false, false, false);
        this.A00 = 1;
    }
}
