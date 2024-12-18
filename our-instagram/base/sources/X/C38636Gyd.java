package X;

/* renamed from: X.Gyd, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38636Gyd extends C0T6 {
    public final C38643Gyk A00;
    public final C38643Gyk A01;
    public final CharSequence A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38636Gyd) {
                C38636Gyd c38636Gyd = (C38636Gyd) obj;
                if (!C14360o3.A0K(this.A00, c38636Gyd.A00) || !C14360o3.A0K(this.A01, c38636Gyd.A01) || this.A06 != c38636Gyd.A06 || this.A03 != c38636Gyd.A03 || this.A04 != c38636Gyd.A04 || this.A05 != c38636Gyd.A05 || !C14360o3.A0K(this.A02, c38636Gyd.A02) || this.A07 != c38636Gyd.A07) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A07, (AbstractC167007dF.A0D(this.A05, AbstractC167007dF.A0D(this.A04, AbstractC167007dF.A0D(this.A03, AbstractC167007dF.A0D(this.A06, (AbstractC166987dD.A0G(this.A00) + AbstractC167017dG.A0M(this.A01)) * 31)))) + AbstractC166997dE.A0I(this.A02)) * 31);
    }

    public C38636Gyd(C38643Gyk c38643Gyk, C38643Gyk c38643Gyk2, CharSequence charSequence, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.A00 = c38643Gyk;
        this.A01 = c38643Gyk2;
        this.A06 = z;
        this.A03 = z2;
        this.A04 = z3;
        this.A05 = z4;
        this.A02 = charSequence;
        this.A07 = z5;
    }
}
