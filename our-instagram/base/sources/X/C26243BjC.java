package X;

/* renamed from: X.BjC, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26243BjC extends C0T6 implements InterfaceC30860DhZ {
    public final C120985dq A00;
    public final C37644Ghd A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26243BjC) {
                C26243BjC c26243BjC = (C26243BjC) obj;
                if (!C14360o3.A0K(this.A00, c26243BjC.A00) || !C14360o3.A0K(this.A01, c26243BjC.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A01, AbstractC166987dD.A0G(this.A00));
    }

    public C26243BjC(C120985dq c120985dq, C37644Ghd c37644Ghd) {
        this.A00 = c120985dq;
        this.A01 = c37644Ghd;
    }
}
