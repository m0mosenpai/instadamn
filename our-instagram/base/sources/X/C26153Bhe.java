package X;

/* renamed from: X.Bhe, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26153Bhe extends C0T6 implements InterfaceC132245y2 {
    public final int A00;
    public final int A01;
    public final C132175xv A02;
    public final C26036BfP A03;
    public final InterfaceC132315yA A04;
    public final String A05;
    public final String A06;
    public final boolean A07;
    public final boolean A08;
    public final String A09;

    @Override // X.InterfaceC132245y2
    public final /* synthetic */ C51758Mth CGR() {
        return AbstractC132295y8.A00();
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26153Bhe) {
                C26153Bhe c26153Bhe = (C26153Bhe) obj;
                if (!C14360o3.A0K(this.A02, c26153Bhe.A02) || !C14360o3.A0K(this.A03, c26153Bhe.A03) || this.A08 != c26153Bhe.A08 || this.A07 != c26153Bhe.A07 || !C14360o3.A0K(this.A05, c26153Bhe.A05) || !C14360o3.A0K(this.A06, c26153Bhe.A06) || this.A00 != c26153Bhe.A00 || !C14360o3.A0K(this.A04, c26153Bhe.A04) || this.A01 != c26153Bhe.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((((AbstractC167007dF.A0D(this.A07, AbstractC167007dF.A0D(this.A08, AbstractC166997dE.A0J(this.A03, AbstractC166987dD.A0G(this.A02)))) + AbstractC167017dG.A0O(this.A05)) * 31) + AbstractC167017dG.A0O(this.A06)) * 31) + this.A00) * 31) + AbstractC166997dE.A0I(this.A04)) * 31) + this.A01;
    }

    public C26153Bhe(C132175xv c132175xv, C26036BfP c26036BfP, InterfaceC132315yA interfaceC132315yA, String str, String str2, int i, int i2, boolean z, boolean z2) {
        this.A02 = c132175xv;
        this.A03 = c26036BfP;
        this.A08 = z;
        this.A07 = z2;
        this.A05 = str;
        this.A06 = str2;
        this.A00 = i;
        this.A04 = interfaceC132315yA;
        this.A01 = i2;
        this.A09 = AbstractC132295y8.A01(this, "condensed_quote_post_preview", c132175xv.A03);
    }

    @Override // X.InterfaceC132245y2
    public final String BKd() {
        return this.A09;
    }

    @Override // X.InterfaceC132245y2
    public final C132175xv Bet() {
        return this.A02;
    }
}
