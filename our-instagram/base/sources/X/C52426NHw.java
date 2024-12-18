package X;

/* renamed from: X.NHw, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52426NHw extends O29 {
    public final float A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final C9ZU A05;
    public final Float A06;
    public final Integer A07;
    public final InterfaceC16610sE A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final float A0E;
    public final String A0F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C52426NHw(C9ZU c9zu, Float f, Integer num, String str, InterfaceC16610sE interfaceC16610sE, float f2, float f3, int i, int i2, int i3, int i4, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        super(C05F.A01);
        C14360o3.A0B(str, 1);
        this.A0F = str;
        this.A0C = z;
        this.A09 = z2;
        this.A04 = i;
        this.A03 = i2;
        this.A01 = i3;
        this.A02 = i4;
        this.A0E = f2;
        this.A00 = f3;
        this.A0A = z3;
        this.A05 = c9zu;
        this.A07 = num;
        this.A0B = z4;
        this.A0D = z5;
        this.A06 = f;
        this.A08 = interfaceC16610sE;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C52426NHw) {
                C52426NHw c52426NHw = (C52426NHw) obj;
                if (!C14360o3.A0K(this.A0F, c52426NHw.A0F) || this.A0C != c52426NHw.A0C || this.A09 != c52426NHw.A09 || this.A04 != c52426NHw.A04 || this.A03 != c52426NHw.A03 || this.A01 != c52426NHw.A01 || this.A02 != c52426NHw.A02 || Float.compare(this.A0E, c52426NHw.A0E) != 0 || Float.compare(this.A00, c52426NHw.A00) != 0 || this.A0A != c52426NHw.A0A || !C14360o3.A0K(this.A05, c52426NHw.A05) || !C14360o3.A0K(this.A07, c52426NHw.A07) || this.A0B != c52426NHw.A0B || this.A0D != c52426NHw.A0D || !C14360o3.A0K(this.A06, c52426NHw.A06) || !C14360o3.A0K(this.A08, c52426NHw.A08)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A08, (AbstractC167007dF.A0D(this.A0D, AbstractC167007dF.A0D(this.A0B, (((AbstractC167007dF.A0D(this.A0A, AbstractC166997dE.A00(AbstractC166997dE.A00((((((((AbstractC167007dF.A0D(this.A09, AbstractC167007dF.A0D(this.A0C, AbstractC166987dD.A0J(this.A0F))) + this.A04) * 31) + this.A03) * 31) + this.A01) * 31) + this.A02) * 31, this.A0E), this.A00)) + AbstractC167017dG.A0M(this.A05)) * 31) + AbstractC167017dG.A0M(this.A07)) * 31)) + AbstractC167017dG.A0M(this.A06)) * 31);
    }
}
