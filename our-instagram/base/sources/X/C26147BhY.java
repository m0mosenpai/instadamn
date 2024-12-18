package X;

/* renamed from: X.BhY, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26147BhY extends C0T6 implements InterfaceC132245y2 {
    public final C132175xv A00;
    public final String A01;
    public final boolean A02;
    public final C26036BfP A03;

    @Override // X.InterfaceC132245y2
    public final /* synthetic */ C51758Mth CGR() {
        return AbstractC132295y8.A00();
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26147BhY) {
                C26147BhY c26147BhY = (C26147BhY) obj;
                if (!C14360o3.A0K(this.A00, c26147BhY.A00) || !C14360o3.A0K(this.A03, c26147BhY.A03) || !C14360o3.A0K(this.A01, c26147BhY.A01) || this.A02 != c26147BhY.A02) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC132245y2
    public final String BKd() {
        return AbstractC132295y8.A01(this, "replyToContext", this.A00.A03);
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A02, AbstractC166997dE.A0K(this.A01, AbstractC166997dE.A0J(this.A03, AbstractC166987dD.A0G(this.A00))));
    }

    public C26147BhY(C132175xv c132175xv, C26036BfP c26036BfP, String str, boolean z) {
        this.A00 = c132175xv;
        this.A03 = c26036BfP;
        this.A01 = str;
        this.A02 = z;
    }

    @Override // X.InterfaceC132245y2
    public final C132175xv Bet() {
        return this.A00;
    }
}
