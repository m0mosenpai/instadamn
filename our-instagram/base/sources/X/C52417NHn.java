package X;

/* renamed from: X.NHn, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52417NHn extends O28 {
    public final int A00;
    public final boolean A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C52417NHn) {
                C52417NHn c52417NHn = (C52417NHn) obj;
                if (this.A00 != c52417NHn.A00 || this.A01 != c52417NHn.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public C52417NHn(int i, boolean z) {
        super(C05F.A00);
        this.A00 = i;
        this.A01 = z;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A01, this.A00 * 31);
    }
}
