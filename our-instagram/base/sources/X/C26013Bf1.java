package X;

/* renamed from: X.Bf1, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26013Bf1 extends C0T6 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final long A06;
    public final C5QE A07;
    public final C5QE A08;
    public final Integer A09;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26013Bf1) {
                C26013Bf1 c26013Bf1 = (C26013Bf1) obj;
                if (!C14360o3.A0K(this.A08, c26013Bf1.A08) || this.A06 != c26013Bf1.A06 || this.A01 != c26013Bf1.A01 || this.A00 != c26013Bf1.A00 || !C14360o3.A0K(this.A07, c26013Bf1.A07) || this.A04 != c26013Bf1.A04 || this.A05 != c26013Bf1.A05 || !C14360o3.A0K(this.A09, c26013Bf1.A09) || this.A03 != c26013Bf1.A03 || this.A02 != c26013Bf1.A02) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((((AbstractC166997dE.A0J(this.A07, (((AbstractC25236BEt.A01(this.A06, AbstractC166987dD.A0G(this.A08)) + this.A01) * 31) + this.A00) * 31) + this.A04) * 31) + this.A05) * 31) + AbstractC167017dG.A0M(this.A09)) * 31) + this.A03) * 31) + this.A02;
    }

    public C26013Bf1(C5QE c5qe, C5QE c5qe2, Integer num, int i, int i2, int i3, int i4, int i5, int i6, long j) {
        this.A08 = c5qe;
        this.A06 = j;
        this.A01 = i;
        this.A00 = i2;
        this.A07 = c5qe2;
        this.A04 = i3;
        this.A05 = i4;
        this.A09 = num;
        this.A03 = i5;
        this.A02 = i6;
    }
}
