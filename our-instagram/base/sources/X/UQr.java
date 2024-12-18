package X;

/* loaded from: classes11.dex */
public final class UQr extends C0T6 implements XFG {
    public final int A00;
    public final int A01;
    public final int A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UQr) {
                UQr uQr = (UQr) obj;
                if (this.A00 != uQr.A00 || this.A01 != uQr.A01 || this.A02 != uQr.A02) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((this.A00 * 31) + this.A01) * 31) + this.A02;
    }

    public UQr(int i, int i2, int i3) {
        this.A00 = i;
        this.A01 = i2;
        this.A02 = i3;
    }
}
