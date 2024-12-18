package X;

/* renamed from: X.BjQ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26257BjQ extends C0T6 implements InterfaceC30892Di5 {
    public final C38321qM A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26257BjQ) {
                C26257BjQ c26257BjQ = (C26257BjQ) obj;
                if (!C14360o3.A0K(this.A00, c26257BjQ.A00) || !C14360o3.A0K(this.A01, c26257BjQ.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A01, AbstractC166987dD.A0G(this.A00));
    }

    public C26257BjQ(C38321qM c38321qM, String str) {
        this.A00 = c38321qM;
        this.A01 = str;
    }
}
