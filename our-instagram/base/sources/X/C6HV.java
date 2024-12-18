package X;

/* renamed from: X.6HV, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6HV extends C0T6 implements InterfaceC132245y2 {
    public final C132175xv A00;
    public final C5Hc A01;
    public final C26036BfP A02;

    public C6HV(C132175xv c132175xv, C26036BfP c26036BfP, C5Hc c5Hc) {
        C14360o3.A0B(c5Hc, 3);
        this.A00 = c132175xv;
        this.A02 = c26036BfP;
        this.A01 = c5Hc;
    }

    @Override // X.InterfaceC132245y2
    public final /* synthetic */ C51758Mth CGR() {
        return AbstractC132295y8.A00();
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C6HV) {
                C6HV c6hv = (C6HV) obj;
                if (!C14360o3.A0K(this.A00, c6hv.A00) || !C14360o3.A0K(this.A02, c6hv.A02) || !C14360o3.A0K(this.A01, c6hv.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((this.A00.hashCode() * 31) + this.A02.hashCode()) * 31) + this.A01.hashCode();
    }

    @Override // X.InterfaceC132245y2
    public final String BKd() {
        return AbstractC132295y8.A01(this, "relevant_tags", this.A00.A03);
    }

    @Override // X.InterfaceC132245y2
    public final C132175xv Bet() {
        return this.A00;
    }
}
