package X;

/* renamed from: X.CVf, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27983CVf {
    public final C27982CVe A00;
    public final C27982CVe A01;
    public final boolean A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C27983CVf) {
                C27983CVf c27983CVf = (C27983CVf) obj;
                if (!C14360o3.A0K(this.A01, c27983CVf.A01) || !C14360o3.A0K(this.A00, c27983CVf.A00) || this.A02 != c27983CVf.A02) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A02, AbstractC166997dE.A0J(this.A00, AbstractC166987dD.A0G(this.A01)));
    }

    public C27983CVf(C27982CVe c27982CVe, C27982CVe c27982CVe2, boolean z) {
        this.A01 = c27982CVe;
        this.A00 = c27982CVe2;
        this.A02 = z;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("Selection(start=");
        A1C.append(this.A01);
        A1C.append(", end=");
        A1C.append(this.A00);
        A1C.append(", handlesCrossed=");
        return AbstractC25236BEt.A0a(A1C, this.A02);
    }
}
