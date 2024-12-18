package X;

/* renamed from: X.BfY, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26045BfY extends C0T6 {
    public final int A00;
    public final int A01;
    public final C6R A02;
    public final Integer A03;
    public final Integer A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26045BfY) {
                C26045BfY c26045BfY = (C26045BfY) obj;
                if (this.A02 != c26045BfY.A02 || this.A07 != c26045BfY.A07 || this.A05 != c26045BfY.A05 || !C14360o3.A0K(this.A04, c26045BfY.A04) || this.A01 != c26045BfY.A01 || this.A00 != c26045BfY.A00 || !C14360o3.A0K(this.A03, c26045BfY.A03) || this.A06 != c26045BfY.A06) {
                }
            }
            return false;
        }
        return true;
    }

    public static boolean A00(C6R c6r, C26045BfY c26045BfY, Object obj, C05A c05a) {
        boolean z = c26045BfY.A07;
        boolean z2 = c26045BfY.A05;
        return c05a.AIi(obj, new C26045BfY(c6r, c26045BfY.A04, c26045BfY.A03, c26045BfY.A01, c26045BfY.A00, z, z2, c26045BfY.A06));
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A06, (((((((AbstractC167007dF.A0D(this.A05, AbstractC167007dF.A0D(this.A07, AbstractC167017dG.A0M(this.A02) * 31)) + AbstractC167017dG.A0M(this.A04)) * 31) + this.A01) * 31) + this.A00) * 31) + AbstractC166997dE.A0I(this.A03)) * 31);
    }

    public C26045BfY(C6R c6r, Integer num, Integer num2, int i, int i2, boolean z, boolean z2, boolean z3) {
        this.A02 = c6r;
        this.A07 = z;
        this.A05 = z2;
        this.A04 = num;
        this.A01 = i;
        this.A00 = i2;
        this.A03 = num2;
        this.A06 = z3;
    }
}
