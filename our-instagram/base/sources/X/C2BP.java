package X;

/* renamed from: X.2BP, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2BP extends C0T6 {
    public final double A00;
    public final double A01;
    public final double A02;
    public final boolean A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C2BP) {
                C2BP c2bp = (C2BP) obj;
                if (Double.compare(this.A01, c2bp.A01) != 0 || Double.compare(this.A02, c2bp.A02) != 0 || Double.compare(this.A00, c2bp.A00) != 0 || this.A03 != c2bp.A03) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A00 = ((((AbstractC28006CWd.A00(this.A01) * 31) + AbstractC28006CWd.A00(this.A02)) * 31) + AbstractC28006CWd.A00(this.A00)) * 31;
        int i = 1237;
        if (this.A03) {
            i = 1231;
        }
        return A00 + i;
    }

    public C2BP(double d, double d2, double d3, boolean z) {
        this.A01 = d;
        this.A02 = d2;
        this.A00 = d3;
        this.A03 = z;
    }
}
