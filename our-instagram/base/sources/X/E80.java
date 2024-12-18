package X;

/* loaded from: classes6.dex */
public final class E80 extends C0T6 implements Gb0 {
    public final int A00;
    public final int A01;
    public final long A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof E80) {
                E80 e80 = (E80) obj;
                if (this.A00 != e80.A00 || this.A02 != e80.A02 || this.A01 != e80.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC25236BEt.A01(this.A02, this.A00 * 31) + this.A01;
    }

    public E80(int i, long j, int i2) {
        this.A00 = i;
        this.A02 = j;
        this.A01 = i2;
    }
}
