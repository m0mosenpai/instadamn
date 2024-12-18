package X;

/* renamed from: X.BjB, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26242BjB extends C0T6 implements InterfaceC30858DhX {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final boolean A03;

    public C26242BjB(C120985dq c120985dq, C75113Zb c75113Zb, int i, boolean z) {
        this.A00 = i;
        this.A01 = c120985dq;
        this.A02 = c75113Zb;
        this.A03 = z;
    }

    public final boolean equals(Object obj) {
        int i;
        if (this.A00 != 0) {
            if (this != obj) {
                i = 1;
            } else {
                return true;
            }
        } else if (this != obj) {
            i = 0;
        } else {
            return true;
        }
        if (obj instanceof C26242BjB) {
            C26242BjB c26242BjB = (C26242BjB) obj;
            if (c26242BjB.A00 != i || !C14360o3.A0K(this.A01, c26242BjB.A01) || !C14360o3.A0K(this.A02, c26242BjB.A02) || this.A03 != c26242BjB.A03) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A03, AbstractC166997dE.A0J(this.A02, AbstractC166987dD.A0G(this.A01)));
    }
}
