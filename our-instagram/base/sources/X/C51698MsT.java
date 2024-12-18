package X;

/* renamed from: X.MsT, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51698MsT extends C0T6 {
    public final int A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C51698MsT(int i, boolean z, boolean z2, boolean z3) {
        this(0, false, false, AbstractC25226BEj.A1U(i & 4, z), AbstractC25226BEj.A1U(i & 8, z2), AbstractC25226BEj.A1U(i & 16, z3));
        this.A00 = 0;
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this.A00 != 0) {
            if (this != obj) {
                if (obj instanceof C51698MsT) {
                    C51698MsT c51698MsT = (C51698MsT) obj;
                    if (c51698MsT.A00 == 1 && this.A02 == c51698MsT.A02 && this.A05 == c51698MsT.A05 && this.A03 == c51698MsT.A03 && this.A04 == c51698MsT.A04) {
                        z = this.A01;
                        z2 = c51698MsT.A01;
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
            if (!(obj instanceof C51698MsT)) {
                return false;
            }
            C51698MsT c51698MsT2 = (C51698MsT) obj;
            if (c51698MsT2.A00 != 0 || this.A03 != c51698MsT2.A03 || this.A01 != c51698MsT2.A01 || this.A04 != c51698MsT2.A04 || this.A05 != c51698MsT2.A05) {
                return false;
            }
            z = this.A02;
            z2 = c51698MsT2.A02;
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
            A0D = AbstractC167007dF.A0D(this.A04, AbstractC167007dF.A0D(this.A03, AbstractC167007dF.A0D(this.A05, AbstractC25225BEi.A08(this.A02))));
            z = this.A01;
        } else {
            A0D = AbstractC167007dF.A0D(this.A05, AbstractC167007dF.A0D(this.A04, AbstractC167007dF.A0D(this.A01, AbstractC25225BEi.A08(this.A03))));
            z = this.A02;
        }
        return AbstractC166987dD.A0K(z, A0D);
    }

    public C51698MsT(int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.A00 = i;
        if (i != 0) {
            this.A02 = z;
            this.A05 = z2;
            this.A03 = z3;
            this.A04 = z4;
            this.A01 = z5;
            return;
        }
        this.A03 = z;
        this.A01 = z2;
        this.A04 = z3;
        this.A05 = z4;
        this.A02 = z5;
    }
}
