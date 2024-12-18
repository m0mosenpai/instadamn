package X;

/* loaded from: classes6.dex */
public final class E7d extends C0T6 implements InterfaceC58219PrP {
    public final int A00;
    public final int A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof E7d) {
                E7d e7d = (E7d) obj;
                if (this.A00 != e7d.A00 || this.A01 != e7d.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A00 * 31) + this.A01;
    }

    public E7d(int i, int i2) {
        this.A00 = i;
        this.A01 = i2;
    }
}
