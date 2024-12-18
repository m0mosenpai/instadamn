package X;

/* renamed from: X.Dof, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31257Dof extends C0T6 {
    public final int A00;
    public final AbstractC46972Dl A01;
    public final String A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08 = true;
    public final boolean A09;

    public C31257Dof(AbstractC46972Dl abstractC46972Dl, String str, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.A02 = str;
        this.A05 = z;
        this.A01 = abstractC46972Dl;
        this.A06 = z2;
        this.A04 = z3;
        this.A00 = i;
        this.A07 = z4;
        this.A03 = z5;
        this.A09 = z6;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C31257Dof) {
                C31257Dof c31257Dof = (C31257Dof) obj;
                if (!C14360o3.A0K(this.A02, c31257Dof.A02) || this.A05 != c31257Dof.A05 || !C14360o3.A0K(this.A01, c31257Dof.A01) || this.A06 != c31257Dof.A06 || this.A04 != c31257Dof.A04 || this.A00 != c31257Dof.A00 || this.A07 != c31257Dof.A07 || this.A08 != c31257Dof.A08 || this.A03 != c31257Dof.A03 || this.A09 != c31257Dof.A09) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A09, AbstractC167007dF.A0D(this.A03, AbstractC167007dF.A0D(this.A08, AbstractC167007dF.A0D(this.A07, (AbstractC167007dF.A0D(this.A04, AbstractC167007dF.A0D(this.A06, (AbstractC167007dF.A0D(this.A05, AbstractC166987dD.A0J(this.A02)) + AbstractC167017dG.A0M(this.A01)) * 31)) + this.A00) * 31))));
    }
}
