package X;

/* renamed from: X.BhX, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26146BhX extends C0T6 implements InterfaceC132245y2 {
    public final C132175xv A00;
    public final C26036BfP A01;
    public final boolean A02;
    public final String A03;

    @Override // X.InterfaceC132245y2
    public final /* synthetic */ C51758Mth CGR() {
        return AbstractC132295y8.A00();
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26146BhX) {
                C26146BhX c26146BhX = (C26146BhX) obj;
                if (!C14360o3.A0K(this.A00, c26146BhX.A00) || !C14360o3.A0K(this.A01, c26146BhX.A01) || this.A02 != c26146BhX.A02) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A02, AbstractC166997dE.A0J(this.A01, AbstractC166987dD.A0G(this.A00)));
    }

    public C26146BhX(C132175xv c132175xv, C26036BfP c26036BfP, boolean z) {
        this.A00 = c132175xv;
        this.A01 = c26036BfP;
        this.A02 = z;
        this.A03 = AbstractC132295y8.A01(this, "hushcontrol", c132175xv.A03);
    }

    @Override // X.InterfaceC132245y2
    public final String BKd() {
        return this.A03;
    }

    @Override // X.InterfaceC132245y2
    public final C132175xv Bet() {
        return this.A00;
    }
}
