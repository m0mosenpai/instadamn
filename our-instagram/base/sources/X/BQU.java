package X;

/* loaded from: classes5.dex */
public final class BQU extends C0T6 implements InterfaceC30861Dha {
    public final int A00;
    public final BLC A01;
    public final C50559MTq A02;
    public final C120985dq A03;
    public final C37644Ghd A04;
    public final boolean A05;
    public final int A06;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BQU) {
                BQU bqu = (BQU) obj;
                if (!C14360o3.A0K(this.A03, bqu.A03) || !C14360o3.A0K(this.A04, bqu.A04) || this.A00 != bqu.A00 || this.A05 != bqu.A05 || this.A06 != bqu.A06 || !C14360o3.A0K(this.A01, bqu.A01) || !C14360o3.A0K(this.A02, bqu.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A02, AbstractC166997dE.A0J(this.A01, (AbstractC167007dF.A0D(this.A05, (AbstractC166997dE.A0J(this.A04, AbstractC166987dD.A0G(this.A03)) + this.A00) * 31) + this.A06) * 31));
    }

    public BQU(BLC blc, C50559MTq c50559MTq, C120985dq c120985dq, C37644Ghd c37644Ghd, int i, int i2, boolean z) {
        this.A03 = c120985dq;
        this.A04 = c37644Ghd;
        this.A00 = i;
        this.A05 = z;
        this.A06 = i2;
        this.A01 = blc;
        this.A02 = c50559MTq;
    }
}
