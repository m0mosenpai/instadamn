package X;

/* loaded from: classes5.dex */
public final class C1U extends AbstractC27443C9l {
    public final int A00;
    public final boolean A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1U) {
                C1U c1u = (C1U) obj;
                if (this.A00 != c1u.A00 || this.A01 != c1u.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A01, this.A00 * 31);
    }

    public C1U(int i, boolean z) {
        this.A00 = i;
        this.A01 = z;
    }
}
