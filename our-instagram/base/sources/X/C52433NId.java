package X;

/* renamed from: X.NId, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52433NId extends AbstractC53451Nke {
    public final int A00;
    public final int A01;
    public final C115525Km A02;

    public C52433NId(C115525Km c115525Km, int i, int i2) {
        C14360o3.A0B(c115525Km, 1);
        this.A02 = c115525Km;
        this.A01 = i;
        this.A00 = i2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C52433NId) {
                C52433NId c52433NId = (C52433NId) obj;
                if (!C14360o3.A0K(this.A02, c52433NId.A02) || this.A01 != c52433NId.A01 || this.A00 != c52433NId.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((AbstractC166987dD.A0G(this.A02) + this.A01) * 31) + this.A00;
    }
}
