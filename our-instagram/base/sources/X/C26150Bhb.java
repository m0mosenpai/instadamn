package X;

/* renamed from: X.Bhb, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26150Bhb extends C0T6 implements InterfaceC132245y2 {
    public final C132175xv A00;
    public final String A01;
    public final C5Hc A02;
    public final boolean A03;
    public final C51758Mth A04 = new C51758Mth((C50679MYx) null, 2, true);
    public final C26036BfP A05;
    public final String A06;

    public C26150Bhb(C132175xv c132175xv, C26036BfP c26036BfP, String str, C5Hc c5Hc, boolean z) {
        this.A00 = c132175xv;
        this.A05 = c26036BfP;
        this.A03 = z;
        this.A01 = str;
        this.A02 = c5Hc;
        this.A06 = AbstractC132295y8.A01(this, "overlayview", c132175xv.A03);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26150Bhb) {
                C26150Bhb c26150Bhb = (C26150Bhb) obj;
                if (!C14360o3.A0K(this.A00, c26150Bhb.A00) || !C14360o3.A0K(this.A05, c26150Bhb.A05) || this.A03 != c26150Bhb.A03 || !C14360o3.A0K(this.A01, c26150Bhb.A01) || !C14360o3.A0K(this.A02, c26150Bhb.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((AbstractC167007dF.A0D(this.A03, AbstractC166997dE.A0J(this.A05, AbstractC166987dD.A0G(this.A00))) + AbstractC167017dG.A0O(this.A01)) * 31) + AbstractC166997dE.A0I(this.A02);
    }

    @Override // X.InterfaceC132245y2
    public final String BKd() {
        return this.A06;
    }

    @Override // X.InterfaceC132245y2
    public final C132175xv Bet() {
        return this.A00;
    }

    @Override // X.InterfaceC132245y2
    public final C51758Mth CGR() {
        return this.A04;
    }
}
