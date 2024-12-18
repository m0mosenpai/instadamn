package X;

/* renamed from: X.CdD, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28268CdD {
    public static final C28268CdD A04 = new C28268CdD(0, 0, 0, 0);
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C28268CdD) {
                C28268CdD c28268CdD = (C28268CdD) obj;
                if (this.A01 != c28268CdD.A01 || this.A03 != c28268CdD.A03 || this.A02 != c28268CdD.A02 || this.A00 != c28268CdD.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((this.A01 * 31) + this.A03) * 31) + this.A02) * 31) + this.A00;
    }

    public final String toString() {
        return AnonymousClass001.A0w("IntRect.fromLTRB(", ", ", ", ", ", ", ')', this.A01, this.A03, this.A02, this.A00);
    }

    public C28268CdD(int i, int i2, int i3, int i4) {
        this.A01 = i;
        this.A03 = i2;
        this.A02 = i3;
        this.A00 = i4;
    }
}
