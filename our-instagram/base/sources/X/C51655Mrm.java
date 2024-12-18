package X;

/* renamed from: X.Mrm, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51655Mrm extends C0T6 {
    public final double A00;
    public final float A01;
    public final int A02;
    public final Integer A03;
    public final Integer A04;
    public final String A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final boolean A0I;
    public final boolean A0J;
    public final boolean A0K;
    public final boolean A0L;
    public final boolean A0M;
    public final boolean A0N;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51655Mrm) {
                C51655Mrm c51655Mrm = (C51655Mrm) obj;
                if (Double.compare(this.A00, c51655Mrm.A00) != 0 || this.A0M != c51655Mrm.A0M || this.A0L != c51655Mrm.A0L || this.A0C != c51655Mrm.A0C || this.A0B != c51655Mrm.A0B || this.A0E != c51655Mrm.A0E || this.A0D != c51655Mrm.A0D || this.A08 != c51655Mrm.A08 || this.A07 != c51655Mrm.A07 || this.A0K != c51655Mrm.A0K || this.A0J != c51655Mrm.A0J || this.A0I != c51655Mrm.A0I || this.A0H != c51655Mrm.A0H || this.A06 != c51655Mrm.A06 || this.A0N != c51655Mrm.A0N || !C14360o3.A0K(this.A03, c51655Mrm.A03) || this.A02 != c51655Mrm.A02 || this.A09 != c51655Mrm.A09 || this.A0A != c51655Mrm.A0A || this.A0F != c51655Mrm.A0F || this.A0G != c51655Mrm.A0G || !C14360o3.A0K(this.A05, c51655Mrm.A05) || !C14360o3.A0K(this.A04, c51655Mrm.A04) || Float.compare(this.A01, c51655Mrm.A01) != 0) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((AbstractC167007dF.A0D(this.A0G, AbstractC167007dF.A0D(this.A0F, AbstractC167007dF.A0D(this.A0A, AbstractC167007dF.A0D(this.A09, (((AbstractC167007dF.A0D(this.A0N, AbstractC167007dF.A0D(this.A06, AbstractC167007dF.A0D(this.A0H, AbstractC167007dF.A0D(this.A0I, AbstractC167007dF.A0D(this.A0J, AbstractC167007dF.A0D(this.A0K, AbstractC167007dF.A0D(this.A07, AbstractC167007dF.A0D(this.A08, AbstractC167007dF.A0D(this.A0D, AbstractC167007dF.A0D(this.A0E, AbstractC167007dF.A0D(this.A0B, AbstractC167007dF.A0D(this.A0C, AbstractC167007dF.A0D(this.A0L, AbstractC167007dF.A0D(this.A0M, AbstractC28006CWd.A00(this.A00) * 31)))))))))))))) + AbstractC167017dG.A0M(this.A03)) * 31) + this.A02) * 31)))) + AbstractC167017dG.A0O(this.A05)) * 31) + AbstractC166997dE.A0I(this.A04)) * 31) + Float.floatToIntBits(this.A01);
    }

    public C51655Mrm(Integer num, Integer num2, String str, double d, float f, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18) {
        this.A00 = d;
        this.A0M = z;
        this.A0L = z2;
        this.A0C = z3;
        this.A0B = z4;
        this.A0E = z5;
        this.A0D = z6;
        this.A08 = z7;
        this.A07 = z8;
        this.A0K = z9;
        this.A0J = z10;
        this.A0I = z11;
        this.A0H = z12;
        this.A06 = z13;
        this.A0N = z14;
        this.A03 = num;
        this.A02 = i;
        this.A09 = z15;
        this.A0A = z16;
        this.A0F = z17;
        this.A0G = z18;
        this.A05 = str;
        this.A04 = num2;
        this.A01 = f;
    }
}
