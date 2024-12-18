package X;

/* renamed from: X.E6p, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32063E6p extends C0T6 {
    public final int A00;
    public final int A01;
    public final String A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C32063E6p) {
                C32063E6p c32063E6p = (C32063E6p) obj;
                if (this.A05 != c32063E6p.A05 || this.A03 != c32063E6p.A03 || this.A00 != c32063E6p.A00 || this.A01 != c32063E6p.A01 || !C14360o3.A0K(this.A02, c32063E6p.A02) || this.A04 != c32063E6p.A04) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A04, AbstractC166997dE.A0K(this.A02, (((AbstractC167007dF.A0D(this.A03, AbstractC25225BEi.A08(this.A05)) + this.A00) * 31) + this.A01) * 31));
    }

    public C32063E6p(String str, int i, int i2, boolean z, boolean z2, boolean z3) {
        this.A05 = z;
        this.A03 = z2;
        this.A00 = i;
        this.A01 = i2;
        this.A02 = str;
        this.A04 = z3;
    }

    public C32063E6p() {
        this("", 0, 0, true, false, false);
    }
}
