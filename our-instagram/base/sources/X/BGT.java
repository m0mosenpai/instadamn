package X;

/* loaded from: classes5.dex */
public final class BGT extends C0T6 {
    public final C5QE A00;
    public final C5HW A01;
    public final C25258BFw A02;
    public final AbstractC27441C9j A03;
    public final BHZ A04;
    public final InterfaceC31097Dlf A05;
    public final String A06;
    public final boolean A07;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BGT) {
                BGT bgt = (BGT) obj;
                if (!C14360o3.A0K(this.A05, bgt.A05) || !C14360o3.A0K(this.A02, bgt.A02) || !C14360o3.A0K(this.A00, bgt.A00) || !C14360o3.A0K(this.A06, bgt.A06) || !C14360o3.A0K(this.A04, bgt.A04) || !C14360o3.A0K(this.A03, bgt.A03) || this.A07 != bgt.A07 || !C14360o3.A0K(this.A01, bgt.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A01, AbstractC167007dF.A0D(this.A07, AbstractC166997dE.A0J(this.A03, (((((AbstractC166997dE.A0J(this.A02, AbstractC166987dD.A0G(this.A05)) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC167017dG.A0O(this.A06)) * 31) + AbstractC166997dE.A0I(this.A04)) * 31)));
    }

    public BGT(C5QE c5qe, C5HW c5hw, C25258BFw c25258BFw, AbstractC27441C9j abstractC27441C9j, BHZ bhz, InterfaceC31097Dlf interfaceC31097Dlf, String str, boolean z) {
        this.A05 = interfaceC31097Dlf;
        this.A02 = c25258BFw;
        this.A00 = c5qe;
        this.A06 = str;
        this.A04 = bhz;
        this.A03 = abstractC27441C9j;
        this.A07 = z;
        this.A01 = c5hw;
    }
}
