package X;

/* renamed from: X.SNq, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62726SNq {
    public final boolean A00;
    public final boolean A01;
    public final boolean A02;

    public C62726SNq(boolean z, boolean z2, boolean z3) {
        this.A00 = z;
        this.A01 = z2;
        this.A02 = z3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C62726SNq) {
                C62726SNq c62726SNq = (C62726SNq) obj;
                if (this.A00 != c62726SNq.A00 || this.A01 != c62726SNq.A01 || this.A02 != c62726SNq.A02) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((AbstractC58322PtE.A02(this.A00 ? 1 : 0) + 31) * 31) + AbstractC58322PtE.A02(this.A01 ? 1 : 0)) * 31) + AbstractC58322PtE.A02(this.A02 ? 1 : 0);
    }
}
