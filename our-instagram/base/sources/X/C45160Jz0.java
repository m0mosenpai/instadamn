package X;

/* renamed from: X.Jz0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45160Jz0 extends C0T6 implements InterfaceC50390MMs {
    public final C5QE A00;
    public final C5QE A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45160Jz0) {
                C45160Jz0 c45160Jz0 = (C45160Jz0) obj;
                if (!C14360o3.A0K(this.A01, c45160Jz0.A01) || !C14360o3.A0K(this.A00, c45160Jz0.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0G(this.A01) + AbstractC167017dG.A0M(this.A00);
    }

    public C45160Jz0(C5QE c5qe, C5QE c5qe2) {
        this.A01 = c5qe;
        this.A00 = c5qe2;
    }
}
