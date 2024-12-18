package X;

/* renamed from: X.HaV, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39389HaV extends AbstractC39674Hj3 {
    public final int A00;
    public final C5QE A01;
    public final C5QE A02;
    public final Integer A03;
    public final String A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C39389HaV) {
                C39389HaV c39389HaV = (C39389HaV) obj;
                if (!C14360o3.A0K(this.A01, c39389HaV.A01) || !C14360o3.A0K(this.A02, c39389HaV.A02) || this.A00 != c39389HaV.A00 || !C14360o3.A0K(this.A03, c39389HaV.A03) || !C14360o3.A0K(this.A04, c39389HaV.A04)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((AbstractC166987dD.A0G(this.A01) + AbstractC167017dG.A0M(this.A02)) * 31) + this.A00) * 31) + AbstractC167017dG.A0M(this.A03)) * 31) + AbstractC25227BEk.A07(this.A04);
    }

    public C39389HaV(C5QE c5qe, C5QE c5qe2, Integer num, String str, int i) {
        this.A01 = c5qe;
        this.A02 = c5qe2;
        this.A00 = i;
        this.A03 = num;
        this.A04 = str;
    }
}
