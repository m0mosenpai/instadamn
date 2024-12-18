package X;

/* renamed from: X.GyU, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38627GyU extends C0T6 {
    public final double A00;
    public final double A01;
    public final double A02;
    public final double A03;
    public final int A04;
    public final int A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38627GyU) {
                C38627GyU c38627GyU = (C38627GyU) obj;
                if (this.A05 != c38627GyU.A05 || this.A04 != c38627GyU.A04 || Double.compare(this.A00, c38627GyU.A00) != 0 || Double.compare(this.A02, c38627GyU.A02) != 0 || Double.compare(this.A03, c38627GyU.A03) != 0 || Double.compare(this.A01, c38627GyU.A01) != 0) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((((((this.A05 * 31) + this.A04) * 31) + AbstractC28006CWd.A00(this.A00)) * 31) + AbstractC28006CWd.A00(this.A02)) * 31) + AbstractC28006CWd.A00(this.A03)) * 31) + AbstractC28006CWd.A00(this.A01);
    }

    public C38627GyU(double d, double d2, double d3, double d4, int i, int i2) {
        this.A05 = i;
        this.A04 = i2;
        this.A00 = d;
        this.A02 = d2;
        this.A03 = d3;
        this.A01 = d4;
    }
}
