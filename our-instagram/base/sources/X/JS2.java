package X;

/* loaded from: classes8.dex */
public final class JS2 extends C0T6 {
    public final int A00;
    public final AbstractC46441Kh1 A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof JS2) {
                JS2 js2 = (JS2) obj;
                if (!C14360o3.A0K(this.A01, js2.A01) || this.A00 != js2.A00 || this.A05 != js2.A05 || this.A03 != js2.A03 || this.A02 != js2.A02 || this.A04 != js2.A04) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A04, AbstractC167007dF.A0D(this.A02, AbstractC167007dF.A0D(this.A03, AbstractC167007dF.A0D(this.A05, (AbstractC166987dD.A0G(this.A01) + this.A00) * 31))));
    }

    public JS2(AbstractC46441Kh1 abstractC46441Kh1, int i, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A01 = abstractC46441Kh1;
        this.A00 = i;
        this.A05 = z;
        this.A03 = z2;
        this.A02 = z3;
        this.A04 = z4;
    }
}
