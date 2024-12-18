package X;

/* renamed from: X.Jwj, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45054Jwj extends C0T6 {
    public final int A00;
    public final int A01;
    public final long A02;
    public final C5QE A03;
    public final String A04;
    public final String A05;
    public final String A06;

    public C45054Jwj(C5QE c5qe, String str, String str2, String str3, int i, int i2, long j) {
        C14360o3.A0B(str, 1);
        this.A06 = str;
        this.A01 = i;
        this.A03 = c5qe;
        this.A00 = i2;
        this.A04 = str2;
        this.A05 = str3;
        this.A02 = j;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45054Jwj) {
                C45054Jwj c45054Jwj = (C45054Jwj) obj;
                if (!C14360o3.A0K(this.A06, c45054Jwj.A06) || this.A01 != c45054Jwj.A01 || !C14360o3.A0K(this.A03, c45054Jwj.A03) || this.A00 != c45054Jwj.A00 || !C14360o3.A0K(this.A04, c45054Jwj.A04) || !C14360o3.A0K(this.A05, c45054Jwj.A05) || this.A02 != c45054Jwj.A02) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166997dE.A0K(this.A05, AbstractC166997dE.A0K(this.A04, (AbstractC166997dE.A0J(this.A03, (AbstractC166987dD.A0J(this.A06) + this.A01) * 31) + this.A00) * 31)) + AbstractC25228BEl.A03(this.A02);
    }
}
