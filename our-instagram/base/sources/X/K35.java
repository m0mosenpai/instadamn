package X;

/* loaded from: classes8.dex */
public final class K35 extends AbstractC46358Kfg {
    public final int A00;
    public final int A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof K35) {
                K35 k35 = (K35) obj;
                if (this.A01 != k35.A01 || this.A00 != k35.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A01 * 31) + this.A00;
    }

    public K35(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
    }
}
