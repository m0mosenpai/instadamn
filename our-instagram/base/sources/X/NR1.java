package X;

/* loaded from: classes9.dex */
public final class NR1 extends NlZ {
    public final int A00;
    public final int A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof NR1) {
                NR1 nr1 = (NR1) obj;
                if (this.A01 != nr1.A01 || this.A00 != nr1.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A01 * 31) + this.A00;
    }

    public NR1(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
    }
}
