package X;

/* renamed from: X.GyL, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38618GyL extends C0T6 {
    public final int A00;
    public final int A01;
    public final boolean A02;
    public final boolean A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38618GyL) {
                C38618GyL c38618GyL = (C38618GyL) obj;
                if (this.A00 != c38618GyL.A00 || this.A02 != c38618GyL.A02 || this.A03 != c38618GyL.A03 || this.A01 != c38618GyL.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC167007dF.A0D(this.A03, AbstractC167007dF.A0D(this.A02, this.A00 * 31)) + this.A01;
    }

    public C38618GyL(int i, int i2, boolean z, boolean z2) {
        this.A00 = i;
        this.A02 = z;
        this.A03 = z2;
        this.A01 = i2;
    }
}
