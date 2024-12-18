package X;

/* renamed from: X.3Hz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C71383Hz extends C0T6 {
    public final double A00;
    public final double A01;
    public final int A02;
    public final int A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C71383Hz) {
                C71383Hz c71383Hz = (C71383Hz) obj;
                if (Double.compare(this.A01, c71383Hz.A01) != 0 || Double.compare(this.A00, c71383Hz.A00) != 0 || this.A02 != c71383Hz.A02 || this.A03 != c71383Hz.A03) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((AbstractC28006CWd.A00(this.A01) * 31) + AbstractC28006CWd.A00(this.A00)) * 31) + this.A02) * 31) + this.A03;
    }

    public C71383Hz(double d, double d2, int i, int i2) {
        this.A01 = d;
        this.A00 = d2;
        this.A02 = i;
        this.A03 = i2;
    }
}
