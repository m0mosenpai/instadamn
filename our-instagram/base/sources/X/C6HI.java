package X;

/* renamed from: X.6HI, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6HI extends C0T6 implements InterfaceC132245y2 {
    public final C45123Jxs A00;
    public final C132175xv A01;
    public final C26036BfP A02;
    public final boolean A03;
    public final boolean A04;
    public final String A05;

    @Override // X.InterfaceC132245y2
    public final /* synthetic */ C51758Mth CGR() {
        return AbstractC132295y8.A00();
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C6HI) {
                C6HI c6hi = (C6HI) obj;
                if (!C14360o3.A0K(this.A01, c6hi.A01) || !C14360o3.A0K(this.A02, c6hi.A02) || this.A03 != c6hi.A03 || !C14360o3.A0K(this.A00, c6hi.A00) || this.A04 != c6hi.A04) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC132245y2
    public final String BKd() {
        return this.A05;
    }

    @Override // X.InterfaceC132245y2
    public final C132175xv Bet() {
        return this.A01;
    }

    public final int hashCode() {
        int hashCode = ((this.A01.hashCode() * 31) + this.A02.hashCode()) * 31;
        int i = 1237;
        if (this.A03) {
            i = 1231;
        }
        int hashCode2 = (((hashCode + i) * 31) + this.A00.hashCode()) * 31;
        int i2 = 1237;
        if (this.A04) {
            i2 = 1231;
        }
        return hashCode2 + i2;
    }

    public C6HI(C45123Jxs c45123Jxs, C132175xv c132175xv, C26036BfP c26036BfP, boolean z, boolean z2) {
        this.A01 = c132175xv;
        this.A02 = c26036BfP;
        this.A03 = z;
        this.A00 = c45123Jxs;
        this.A04 = z2;
        this.A05 = AbstractC132295y8.A01(this, "link_preview", c132175xv.A03);
    }
}
