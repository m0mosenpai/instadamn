package X;

/* renamed from: X.NdU, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C53055NdU extends AbstractC53585Nmr {
    public final int A00;
    public final boolean A01;
    public final String A02;
    public final boolean A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53055NdU) {
                C53055NdU c53055NdU = (C53055NdU) obj;
                if (!C14360o3.A0K(this.A02, c53055NdU.A02) || this.A03 != c53055NdU.A03 || this.A01 != c53055NdU.A01 || this.A00 != c53055NdU.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC167007dF.A0D(this.A01, AbstractC167007dF.A0D(this.A03, AbstractC166987dD.A0J(this.A02))) + this.A00;
    }

    public C53055NdU(String str, boolean z, boolean z2, int i) {
        this.A02 = str;
        this.A03 = z;
        this.A01 = z2;
        this.A00 = i;
    }
}
