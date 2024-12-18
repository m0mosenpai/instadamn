package X;

/* renamed from: X.Ben, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25999Ben extends C0T6 {
    public final int A00;
    public final Integer A01;
    public final String A02;
    public final C5Hc A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;

    public C25999Ben(Integer num, String str, C5Hc c5Hc, int i, boolean z, boolean z2, boolean z3) {
        C14360o3.A0B(c5Hc, 3);
        this.A02 = str;
        this.A01 = num;
        this.A03 = c5Hc;
        this.A06 = z;
        this.A04 = z2;
        this.A00 = i;
        this.A05 = z3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C25999Ben) {
                C25999Ben c25999Ben = (C25999Ben) obj;
                if (!C14360o3.A0K(this.A02, c25999Ben.A02) || !C14360o3.A0K(this.A01, c25999Ben.A01) || !C14360o3.A0K(this.A03, c25999Ben.A03) || this.A06 != c25999Ben.A06 || this.A04 != c25999Ben.A04 || this.A00 != c25999Ben.A00 || this.A05 != c25999Ben.A05) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A05, (AbstractC167007dF.A0D(this.A04, AbstractC167007dF.A0D(this.A06, AbstractC166997dE.A0J(this.A03, (AbstractC166987dD.A0J(this.A02) + AbstractC167017dG.A0M(this.A01)) * 31))) + this.A00) * 31);
    }
}
