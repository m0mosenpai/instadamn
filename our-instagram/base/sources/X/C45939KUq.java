package X;

/* renamed from: X.KUq, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45939KUq extends AbstractC46444Kh4 {
    public final int A00;
    public final int A01;
    public final C51753Mtc A02;
    public final AbstractC46443Kh3 A03;
    public final AbstractC46443Kh3 A04;
    public final String A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45939KUq) {
                C45939KUq c45939KUq = (C45939KUq) obj;
                if (!C14360o3.A0K(this.A04, c45939KUq.A04) || !C14360o3.A0K(this.A03, c45939KUq.A03) || !C14360o3.A0K(this.A02, c45939KUq.A02) || !C14360o3.A0K(this.A05, c45939KUq.A05) || this.A01 != c45939KUq.A01 || this.A00 != c45939KUq.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((AbstractC166997dE.A0J(this.A03, AbstractC166987dD.A0G(this.A04)) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC25227BEk.A07(this.A05)) * 31) + this.A01) * 31) + this.A00;
    }

    public C45939KUq(C51753Mtc c51753Mtc, AbstractC46443Kh3 abstractC46443Kh3, AbstractC46443Kh3 abstractC46443Kh32, String str, int i, int i2) {
        this.A04 = abstractC46443Kh3;
        this.A03 = abstractC46443Kh32;
        this.A02 = c51753Mtc;
        this.A05 = str;
        this.A01 = i;
        this.A00 = i2;
    }
}
