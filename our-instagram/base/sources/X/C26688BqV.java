package X;

/* renamed from: X.BqV, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26688BqV extends C9A {
    public final C51733MtG A00;
    public final JWd A01;

    public C26688BqV(C51733MtG c51733MtG, JWd jWd) {
        C14360o3.A0B(jWd, 2);
        this.A00 = c51733MtG;
        this.A01 = jWd;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26688BqV) {
                C26688BqV c26688BqV = (C26688BqV) obj;
                if (!C14360o3.A0K(this.A00, c26688BqV.A00) || !C14360o3.A0K(this.A01, c26688BqV.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A01, AbstractC166987dD.A0G(this.A00));
    }
}
