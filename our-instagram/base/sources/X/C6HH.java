package X;

/* renamed from: X.6HH, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6HH extends C0T6 implements InterfaceC132245y2 {
    public final C25999Ben A00;
    public final C132175xv A01;
    public final C26036BfP A02;
    public final String A03;

    @Override // X.InterfaceC132245y2
    public final /* synthetic */ C51758Mth CGR() {
        return AbstractC132295y8.A00();
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C6HH) {
                C6HH c6hh = (C6HH) obj;
                if (!C14360o3.A0K(this.A01, c6hh.A01) || !C14360o3.A0K(this.A02, c6hh.A02) || !C14360o3.A0K(this.A00, c6hh.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((this.A01.hashCode() * 31) + this.A02.hashCode()) * 31) + this.A00.hashCode();
    }

    @Override // X.InterfaceC132245y2
    public final String BKd() {
        return this.A03;
    }

    @Override // X.InterfaceC132245y2
    public final C132175xv Bet() {
        return this.A01;
    }

    public C6HH(C25999Ben c25999Ben, C132175xv c132175xv, C26036BfP c26036BfP) {
        this.A01 = c132175xv;
        this.A02 = c26036BfP;
        this.A00 = c25999Ben;
        this.A03 = AbstractC132295y8.A01(this, "poll", c132175xv.A03);
    }
}
