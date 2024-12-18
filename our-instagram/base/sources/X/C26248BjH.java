package X;

/* renamed from: X.BjH, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26248BjH extends C0T6 implements InterfaceC30878Dhr {
    public final C5QE A00;
    public final C5QE A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26248BjH) {
                C26248BjH c26248BjH = (C26248BjH) obj;
                if (!C14360o3.A0K(this.A01, c26248BjH.A01) || !C14360o3.A0K(this.A00, c26248BjH.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A00, AbstractC166987dD.A0G(this.A01));
    }

    public C26248BjH(C5QE c5qe, C5QE c5qe2) {
        this.A01 = c5qe;
        this.A00 = c5qe2;
    }
}
