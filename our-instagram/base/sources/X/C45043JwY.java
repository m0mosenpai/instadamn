package X;

/* renamed from: X.JwY, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45043JwY extends C0T6 {
    public final int A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45043JwY) {
                C45043JwY c45043JwY = (C45043JwY) obj;
                if (this.A02 != c45043JwY.A02 || this.A01 != c45043JwY.A01 || this.A04 != c45043JwY.A04 || this.A03 != c45043JwY.A03 || this.A00 != c45043JwY.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC167007dF.A0D(this.A03, AbstractC167007dF.A0D(this.A04, AbstractC167007dF.A0D(this.A01, AbstractC25225BEi.A08(this.A02)))) + this.A00;
    }

    public C45043JwY(boolean z, int i, boolean z2, boolean z3, boolean z4) {
        this.A02 = z;
        this.A01 = z2;
        this.A04 = z3;
        this.A03 = z4;
        this.A00 = i;
    }
}
