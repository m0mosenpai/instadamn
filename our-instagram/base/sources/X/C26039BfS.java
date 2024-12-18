package X;

/* renamed from: X.BfS, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26039BfS extends C0T6 {
    public final int A00;
    public final C5QE A01;
    public final C6R A02;
    public final EnumC53314Nhq A03;
    public final boolean A04;
    public final boolean A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26039BfS) {
                C26039BfS c26039BfS = (C26039BfS) obj;
                if (this.A03 != c26039BfS.A03 || !C14360o3.A0K(this.A01, c26039BfS.A01) || this.A02 != c26039BfS.A02 || this.A05 != c26039BfS.A05 || this.A04 != c26039BfS.A04 || this.A00 != c26039BfS.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC167007dF.A0D(this.A04, AbstractC167007dF.A0D(this.A05, AbstractC166997dE.A0J(this.A02, AbstractC166997dE.A0J(this.A01, AbstractC166987dD.A0G(this.A03))))) + this.A00;
    }

    public C26039BfS(C5QE c5qe, C6R c6r, EnumC53314Nhq enumC53314Nhq, int i, boolean z, boolean z2) {
        AbstractC167017dG.A1Q(enumC53314Nhq, c6r);
        this.A03 = enumC53314Nhq;
        this.A01 = c5qe;
        this.A02 = c6r;
        this.A05 = z;
        this.A04 = z2;
        this.A00 = i;
    }

    public C26039BfS() {
        this(MVZ.A00(""), C6R.A03, EnumC53314Nhq.NOBODY, 2131975805, true, false);
    }
}
