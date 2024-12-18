package X;

/* renamed from: X.Bes, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26004Bes extends C0T6 {
    public final int A00;
    public final C2DC A01;
    public final C2DC A02;
    public final String A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26004Bes) {
                C26004Bes c26004Bes = (C26004Bes) obj;
                if (this.A00 != c26004Bes.A00 || !C14360o3.A0K(this.A03, c26004Bes.A03) || !C14360o3.A0K(this.A02, c26004Bes.A02) || !C14360o3.A0K(this.A01, c26004Bes.A01) || this.A06 != c26004Bes.A06 || this.A07 != c26004Bes.A07 || this.A04 != c26004Bes.A04 || this.A05 != c26004Bes.A05) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A05, AbstractC167007dF.A0D(this.A04, AbstractC167007dF.A0D(this.A07, AbstractC167007dF.A0D(this.A06, (((AbstractC166997dE.A0K(this.A03, this.A00 * 31) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC166997dE.A0I(this.A01)) * 31))));
    }

    public C26004Bes(C2DC c2dc, C2DC c2dc2, String str, int i, boolean z, boolean z2, boolean z3) {
        boolean A1V = AbstractC167007dF.A1V(str);
        this.A00 = i;
        this.A03 = str;
        this.A02 = c2dc;
        this.A01 = c2dc2;
        this.A06 = z;
        this.A07 = A1V;
        this.A04 = z2;
        this.A05 = z3;
    }
}
