package X;

/* renamed from: X.Gyv, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38654Gyv extends C0T6 {
    public final int A00;
    public final IBY A01;
    public final C006802i A02;
    public final Integer A03;
    public final Integer A04;
    public final Integer A05;
    public final java.util.Set A06;
    public final java.util.Set A07;
    public final java.util.Set A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;

    public C38654Gyv(IBY iby, C006802i c006802i, Integer num, Integer num2, Integer num3, java.util.Set set, java.util.Set set2, java.util.Set set3, int i, boolean z, boolean z2, boolean z3, boolean z4) {
        AbstractC25233BEq.A0x(3, set, set2, set3);
        this.A09 = z;
        this.A02 = c006802i;
        this.A06 = set;
        this.A08 = set2;
        this.A07 = set3;
        this.A0C = z2;
        this.A00 = i;
        this.A0B = z3;
        this.A0A = z4;
        this.A01 = iby;
        this.A04 = num;
        this.A03 = num2;
        this.A05 = num3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38654Gyv) {
                C38654Gyv c38654Gyv = (C38654Gyv) obj;
                if (this.A09 != c38654Gyv.A09 || !C14360o3.A0K(this.A02, c38654Gyv.A02) || !C14360o3.A0K(this.A06, c38654Gyv.A06) || !C14360o3.A0K(this.A08, c38654Gyv.A08) || !C14360o3.A0K(this.A07, c38654Gyv.A07) || this.A0C != c38654Gyv.A0C || this.A00 != c38654Gyv.A00 || this.A0B != c38654Gyv.A0B || this.A0A != c38654Gyv.A0A || !C14360o3.A0K(this.A01, c38654Gyv.A01) || !C14360o3.A0K(this.A04, c38654Gyv.A04) || !C14360o3.A0K(this.A03, c38654Gyv.A03) || !C14360o3.A0K(this.A05, c38654Gyv.A05)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((AbstractC167007dF.A0D(this.A0A, AbstractC167007dF.A0D(this.A0B, (AbstractC167007dF.A0D(this.A0C, AbstractC166997dE.A0J(this.A07, AbstractC166997dE.A0J(this.A08, AbstractC166997dE.A0J(this.A06, (AbstractC25225BEi.A08(this.A09) + AbstractC167017dG.A0M(this.A02)) * 31)))) + this.A00) * 31)) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC167017dG.A0M(this.A04)) * 31) + AbstractC167017dG.A0M(this.A03)) * 31) + AbstractC166997dE.A0I(this.A05);
    }
}
