package X;

/* renamed from: X.6HX, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6HX extends C0T6 implements InterfaceC132245y2 {
    public final int A00;
    public final int A01;
    public final C132175xv A02;
    public final String A03;
    public final C5Hc A04;
    public final C26036BfP A05;

    public C6HX(C132175xv c132175xv, C26036BfP c26036BfP, String str, C5Hc c5Hc, int i, int i2) {
        C14360o3.A0B(c5Hc, 6);
        this.A02 = c132175xv;
        this.A05 = c26036BfP;
        this.A03 = str;
        this.A00 = i;
        this.A01 = i2;
        this.A04 = c5Hc;
    }

    @Override // X.InterfaceC132245y2
    public final /* synthetic */ C51758Mth CGR() {
        return AbstractC132295y8.A00();
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C6HX) {
                C6HX c6hx = (C6HX) obj;
                if (!C14360o3.A0K(this.A02, c6hx.A02) || !C14360o3.A0K(this.A05, c6hx.A05) || !C14360o3.A0K(this.A03, c6hx.A03) || this.A00 != c6hx.A00 || this.A01 != c6hx.A01 || !C14360o3.A0K(this.A04, c6hx.A04)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((((((this.A02.hashCode() * 31) + this.A05.hashCode()) * 31) + this.A03.hashCode()) * 31) + this.A00) * 31) + this.A01) * 31) + this.A04.hashCode();
    }

    @Override // X.InterfaceC132245y2
    public final String BKd() {
        return AbstractC132295y8.A01(this, "post_fediverse_replies_row", this.A02.A03);
    }

    @Override // X.InterfaceC132245y2
    public final C132175xv Bet() {
        return this.A02;
    }
}
