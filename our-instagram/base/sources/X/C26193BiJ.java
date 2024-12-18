package X;

/* renamed from: X.BiJ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26193BiJ extends C0T6 implements InterfaceC30815Dgq {
    public final C5QE A00;
    public final C5QE A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26193BiJ) {
                C26193BiJ c26193BiJ = (C26193BiJ) obj;
                if (!C14360o3.A0K(this.A01, c26193BiJ.A01) || !C14360o3.A0K(this.A00, c26193BiJ.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0G(this.A01) + AbstractC167017dG.A0M(this.A00);
    }

    public C26193BiJ(C5QE c5qe, C5QE c5qe2) {
        this.A01 = c5qe;
        this.A00 = c5qe2;
    }
}
