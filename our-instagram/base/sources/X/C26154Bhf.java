package X;

/* renamed from: X.Bhf, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26154Bhf extends C0T6 implements InterfaceC132245y2 {
    public final int A00;
    public final C132175xv A01;
    public final C26036BfP A02;
    public final InterfaceC132315yA A03;
    public final C26024BfD A04;
    public final Integer A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final C51758Mth A0C;
    public final String A0D;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26154Bhf) {
                C26154Bhf c26154Bhf = (C26154Bhf) obj;
                if (!C14360o3.A0K(this.A01, c26154Bhf.A01) || !C14360o3.A0K(this.A02, c26154Bhf.A02) || this.A08 != c26154Bhf.A08 || !C14360o3.A0K(this.A04, c26154Bhf.A04) || this.A07 != c26154Bhf.A07 || this.A0A != c26154Bhf.A0A || this.A09 != c26154Bhf.A09 || !C14360o3.A0K(this.A03, c26154Bhf.A03) || this.A06 != c26154Bhf.A06 || this.A00 != c26154Bhf.A00 || this.A0B != c26154Bhf.A0B || !C14360o3.A0K(this.A05, c26154Bhf.A05)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC167007dF.A0D(this.A0B, (AbstractC167007dF.A0D(this.A06, (AbstractC167007dF.A0D(this.A09, AbstractC167007dF.A0D(this.A0A, AbstractC167007dF.A0D(this.A07, (AbstractC167007dF.A0D(this.A08, AbstractC166997dE.A0J(this.A02, AbstractC166987dD.A0G(this.A01))) + AbstractC167017dG.A0M(this.A04)) * 31))) + AbstractC167017dG.A0M(this.A03)) * 31) + this.A00) * 31) + AbstractC166997dE.A0I(this.A05);
    }

    public C26154Bhf(C132175xv c132175xv, C26036BfP c26036BfP, InterfaceC132315yA interfaceC132315yA, C26024BfD c26024BfD, Integer num, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        String str;
        String str2;
        C5Hc c5Hc;
        boolean A1V = AbstractC167007dF.A1V(c26036BfP);
        this.A01 = c132175xv;
        this.A02 = c26036BfP;
        this.A08 = z;
        this.A04 = c26024BfD;
        this.A07 = z2;
        this.A0A = z3;
        this.A09 = z4;
        this.A03 = interfaceC132315yA;
        this.A06 = z5;
        this.A00 = i;
        this.A0B = z6;
        this.A05 = num;
        if (c26024BfD != null && (c5Hc = c26024BfD.A0K) != null && AbstractC166987dD.A1b(c5Hc) == A1V) {
            str = "quote_post_media_preview";
        } else {
            str = "quote_post_preview";
        }
        C50679MYx c50679MYx = null;
        this.A0D = AbstractC132295y8.A01(this, str, this.A01.A03);
        if (c26024BfD != null && (str2 = c26024BfD.A0F) != null) {
            c50679MYx = new C50679MYx(AbstractC132295y8.A01(this, str, str2), str2, 17);
        }
        this.A0C = new C51758Mth(c50679MYx, A1V ? 1 : 0, false);
    }

    @Override // X.InterfaceC132245y2
    public final String BKd() {
        return this.A0D;
    }

    @Override // X.InterfaceC132245y2
    public final C132175xv Bet() {
        return this.A01;
    }

    @Override // X.InterfaceC132245y2
    public final C51758Mth CGR() {
        return this.A0C;
    }
}
