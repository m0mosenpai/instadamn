package X;

/* renamed from: X.BeU, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25980BeU extends C0T6 {
    public final C26120Bh5 A00;
    public final C26124BhA A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C25980BeU) {
                C25980BeU c25980BeU = (C25980BeU) obj;
                if (!C14360o3.A0K(this.A01, c25980BeU.A01) || !C14360o3.A0K(this.A00, c25980BeU.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (AbstractC167017dG.A0M(this.A01) * 31) + AbstractC166997dE.A0I(this.A00);
    }

    public C25980BeU(C26120Bh5 c26120Bh5, C26124BhA c26124BhA) {
        this.A01 = c26124BhA;
        this.A00 = c26120Bh5;
    }
}
