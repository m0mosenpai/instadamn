package X;

/* renamed from: X.UPm, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66624UPm extends C0T6 {
    public final double A00;
    public final int A01;
    public final int A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C66624UPm) {
                C66624UPm c66624UPm = (C66624UPm) obj;
                if (this.A02 != c66624UPm.A02 || Double.compare(this.A00, c66624UPm.A00) != 0 || this.A01 != c66624UPm.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((this.A02 * 31) + AbstractC28006CWd.A00(this.A00)) * 31) + this.A01;
    }

    public C66624UPm(double d, int i, int i2) {
        this.A02 = i;
        this.A00 = d;
        this.A01 = i2;
    }

    public C66624UPm() {
        this(0.0d, 10, 0);
    }
}
