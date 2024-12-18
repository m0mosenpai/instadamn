package X;

/* renamed from: X.BjR, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26258BjR extends C0T6 implements InterfaceC30892Di5 {
    public final C116875Qr A00;
    public final C38321qM A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26258BjR) {
                C26258BjR c26258BjR = (C26258BjR) obj;
                if (!C14360o3.A0K(this.A00, c26258BjR.A00) || !C14360o3.A0K(this.A01, c26258BjR.A01) || !C14360o3.A0K(this.A02, c26258BjR.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A02, AbstractC166997dE.A0J(this.A01, AbstractC166987dD.A0G(this.A00)));
    }

    public C26258BjR(C116875Qr c116875Qr, C38321qM c38321qM, String str) {
        this.A00 = c116875Qr;
        this.A01 = c38321qM;
        this.A02 = str;
    }
}
