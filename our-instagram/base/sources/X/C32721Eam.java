package X;

/* renamed from: X.Eam, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32721Eam extends AbstractC33533Es7 {
    public final int A00;
    public final C5QE A01;
    public final String A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C32721Eam) {
                C32721Eam c32721Eam = (C32721Eam) obj;
                if (this.A00 != c32721Eam.A00 || this.A03 != c32721Eam.A03 || this.A05 != c32721Eam.A05 || this.A06 != c32721Eam.A06 || !C14360o3.A0K(this.A01, c32721Eam.A01) || this.A04 != c32721Eam.A04 || !C14360o3.A0K(this.A02, c32721Eam.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A0D = AbstractC167007dF.A0D(this.A03, this.A00 * 31);
        int A00 = AbstractC53644Nnp.A00();
        return AbstractC167007dF.A0D(this.A04, AbstractC166997dE.A0J(this.A01, AbstractC167007dF.A0D(this.A06, (AbstractC167007dF.A0D(this.A05, (A0D + A00) * 31) + A00) * 31))) + AbstractC167017dG.A0O(this.A02);
    }

    public C32721Eam(C5QE c5qe, String str, int i, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A00 = i;
        this.A03 = z;
        this.A05 = z2;
        this.A06 = z3;
        this.A01 = c5qe;
        this.A04 = z4;
        this.A02 = str;
    }
}
