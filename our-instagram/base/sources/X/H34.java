package X;

/* loaded from: classes7.dex */
public final class H34 extends C0T6 implements JIW {
    public final int A00;
    public final int A01;
    public final int A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof H34) {
                H34 h34 = (H34) obj;
                if (this.A00 != h34.A00 || this.A01 != h34.A01 || this.A02 != h34.A02) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((this.A00 * 31) + this.A01) * 31) + this.A02;
    }

    public H34(int i, int i2, int i3) {
        this.A00 = i;
        this.A01 = i2;
        this.A02 = i3;
    }
}
