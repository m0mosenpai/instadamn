package X;

/* renamed from: X.MxX, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51950MxX extends C0T6 implements InterfaceC57889Plt {
    public final BVB A00;
    public final C120985dq A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51950MxX) {
                C51950MxX c51950MxX = (C51950MxX) obj;
                if (!C14360o3.A0K(this.A01, c51950MxX.A01) || !C14360o3.A0K(this.A00, c51950MxX.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A00, AbstractC166987dD.A0G(this.A01));
    }

    public C51950MxX(BVB bvb, C120985dq c120985dq) {
        this.A01 = c120985dq;
        this.A00 = bvb;
    }
}
