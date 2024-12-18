package X;

/* renamed from: X.BhZ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26148BhZ extends C0T6 implements InterfaceC132245y2 {
    public final C132175xv A00;
    public final String A01;
    public final String A02;
    public final boolean A03;
    public final C26036BfP A04;

    @Override // X.InterfaceC132245y2
    public final /* synthetic */ C51758Mth CGR() {
        return AbstractC132295y8.A00();
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26148BhZ) {
                C26148BhZ c26148BhZ = (C26148BhZ) obj;
                if (!C14360o3.A0K(this.A00, c26148BhZ.A00) || !C14360o3.A0K(this.A04, c26148BhZ.A04) || !C14360o3.A0K(this.A01, c26148BhZ.A01) || !C14360o3.A0K(this.A02, c26148BhZ.A02) || this.A03 != c26148BhZ.A03) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC132245y2
    public final String BKd() {
        return AbstractC132295y8.A01(this, "loopsHeader", this.A00.A03);
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A03, AbstractC166997dE.A0K(this.A02, AbstractC166997dE.A0K(this.A01, AbstractC166997dE.A0J(this.A04, AbstractC166987dD.A0G(this.A00)))));
    }

    public C26148BhZ(C132175xv c132175xv, C26036BfP c26036BfP, String str, String str2, boolean z) {
        this.A00 = c132175xv;
        this.A04 = c26036BfP;
        this.A01 = str;
        this.A02 = str2;
        this.A03 = z;
    }

    @Override // X.InterfaceC132245y2
    public final C132175xv Bet() {
        return this.A00;
    }
}
