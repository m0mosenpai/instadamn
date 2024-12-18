package X;

/* renamed from: X.GyZ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38632GyZ extends C0T6 {
    public final float A00;
    public final C41630IbL A01;
    public final boolean A02;
    public final boolean A03;
    public final Integer A04;
    public final String A05;
    public final boolean A06;

    public C38632GyZ(C41630IbL c41630IbL, Integer num, String str, float f, boolean z, boolean z2, boolean z3) {
        C14360o3.A0B(num, 1);
        this.A04 = num;
        this.A05 = str;
        this.A00 = f;
        this.A01 = c41630IbL;
        this.A02 = z;
        this.A06 = z2;
        this.A03 = z3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38632GyZ) {
                C38632GyZ c38632GyZ = (C38632GyZ) obj;
                if (this.A04 != c38632GyZ.A04 || !C14360o3.A0K(this.A05, c38632GyZ.A05) || Float.compare(this.A00, c38632GyZ.A00) != 0 || !C14360o3.A0K(this.A01, c38632GyZ.A01) || this.A02 != c38632GyZ.A02 || this.A06 != c38632GyZ.A06 || this.A03 != c38632GyZ.A03) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Integer num = this.A04;
        return AbstractC166987dD.A0K(this.A03, AbstractC167007dF.A0D(this.A06, AbstractC167007dF.A0D(this.A02, (AbstractC166997dE.A00(AbstractC166997dE.A0K(this.A05, AbstractC25230BEn.A0C(num, AbstractC41360ISn.A01(num)) * 31), this.A00) + AbstractC167017dG.A0M(this.A01)) * 31)));
    }
}
