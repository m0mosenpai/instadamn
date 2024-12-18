package X;

/* loaded from: classes7.dex */
public final class H38 extends C0T6 implements InterfaceC43464JIc {
    public final int A00;
    public final int A01;
    public final int A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof H38) {
                H38 h38 = (H38) obj;
                if (this.A00 != h38.A00 || this.A01 != h38.A01 || this.A02 != h38.A02) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((this.A00 * 31) + this.A01) * 31) + this.A02;
    }

    public H38(int i, int i2, int i3) {
        this.A00 = i;
        this.A01 = i2;
        this.A02 = i3;
    }
}
