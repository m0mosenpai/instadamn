package X;

/* renamed from: X.NHt, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52423NHt extends O29 {
    public final int A00;
    public final Boolean A01;
    public final boolean A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C52423NHt) {
                C52423NHt c52423NHt = (C52423NHt) obj;
                if (this.A00 != c52423NHt.A00 || this.A02 != c52423NHt.A02 || !C14360o3.A0K(this.A01, c52423NHt.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public C52423NHt(Boolean bool, int i, boolean z) {
        super(C05F.A00);
        this.A00 = i;
        this.A02 = z;
        this.A01 = bool;
    }

    public final int hashCode() {
        return AbstractC167007dF.A0D(this.A02, this.A00 * 31) + AbstractC167017dG.A0M(this.A01);
    }
}
