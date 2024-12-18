package X;

/* loaded from: classes5.dex */
public final class BHN extends C0T6 {
    public final long A00;
    public final long A01;
    public final C5Hc A02;
    public final C5Hc A03;
    public final String A04;

    public BHN(String str, C5Hc c5Hc, C5Hc c5Hc2, long j, long j2) {
        AbstractC167007dF.A1F(str, 1, c5Hc);
        this.A04 = str;
        this.A01 = j;
        this.A00 = j2;
        this.A03 = c5Hc;
        this.A02 = c5Hc2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BHN) {
                BHN bhn = (BHN) obj;
                if (!C14360o3.A0K(this.A04, bhn.A04) || this.A01 != bhn.A01 || this.A00 != bhn.A00 || !C14360o3.A0K(this.A03, bhn.A03) || !C14360o3.A0K(this.A02, bhn.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166997dE.A0J(this.A03, AbstractC167007dF.A07(this.A00, AbstractC167007dF.A07(this.A01, AbstractC166987dD.A0J(this.A04)))) + AbstractC167017dG.A0M(this.A02);
    }
}
