package X;

/* renamed from: X.6HU, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6HU extends C0T6 implements InterfaceC132245y2 {
    public final int A00;
    public final C132175xv A01;
    public final C5Hc A02;
    public final boolean A03;
    public final C26036BfP A04;

    public C6HU(C132175xv c132175xv, C26036BfP c26036BfP, C5Hc c5Hc, int i, boolean z) {
        C14360o3.A0B(c5Hc, 4);
        this.A01 = c132175xv;
        this.A04 = c26036BfP;
        this.A00 = i;
        this.A02 = c5Hc;
        this.A03 = z;
    }

    @Override // X.InterfaceC132245y2
    public final /* synthetic */ C51758Mth CGR() {
        return AbstractC132295y8.A00();
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C6HU) {
                C6HU c6hu = (C6HU) obj;
                if (!C14360o3.A0K(this.A01, c6hu.A01) || !C14360o3.A0K(this.A04, c6hu.A04) || this.A00 != c6hu.A00 || !C14360o3.A0K(this.A02, c6hu.A02) || this.A03 != c6hu.A03) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC132245y2
    public final String BKd() {
        return AbstractC132295y8.A01(this, "inline_reply_expansion", this.A01.A03);
    }

    @Override // X.InterfaceC132245y2
    public final C132175xv Bet() {
        return this.A01;
    }

    public final int hashCode() {
        int hashCode = ((((((this.A01.hashCode() * 31) + this.A04.hashCode()) * 31) + this.A00) * 31) + this.A02.hashCode()) * 31;
        int i = 1237;
        if (this.A03) {
            i = 1231;
        }
        return hashCode + i;
    }
}
