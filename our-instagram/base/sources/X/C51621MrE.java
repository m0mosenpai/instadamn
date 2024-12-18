package X;

/* renamed from: X.MrE, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51621MrE extends C0T6 {
    public final int A00;
    public final int A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51621MrE) {
                C51621MrE c51621MrE = (C51621MrE) obj;
                if (this.A05 != c51621MrE.A05 || this.A03 != c51621MrE.A03 || this.A02 != c51621MrE.A02 || this.A01 != c51621MrE.A01 || this.A00 != c51621MrE.A00 || this.A04 != c51621MrE.A04) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A04, (((AbstractC167007dF.A0D(this.A02, AbstractC167007dF.A0D(this.A03, AbstractC25225BEi.A08(this.A05))) + this.A01) * 31) + this.A00) * 31);
    }

    public C51621MrE(int i, int i2, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A05 = z;
        this.A03 = z2;
        this.A02 = z3;
        this.A01 = i;
        this.A00 = i2;
        this.A04 = z4;
    }
}
