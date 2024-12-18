package X;

/* renamed from: X.2TB, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2TB {
    public double A00;
    public double A01;
    public double A02;
    public double A03;

    public final boolean A00(double d, double d2) {
        double d3 = this.A01;
        double d4 = this.A02;
        if (d3 > d4) {
            return false;
        }
        double d5 = this.A03;
        double d6 = this.A00;
        if (d5 > d6 || d3 > d || d > d4 || d5 > d2 || d2 > d6) {
            return false;
        }
        return true;
    }

    public final boolean A01(C2TB c2tb) {
        double d = this.A01;
        double d2 = this.A02;
        if (d > d2) {
            return false;
        }
        double d3 = this.A03;
        double d4 = this.A00;
        if (d3 > d4) {
            return false;
        }
        double d5 = c2tb.A01;
        if (d > d5 || d5 > d2) {
            return false;
        }
        double d6 = c2tb.A02;
        if (d > d6 || d6 > d2) {
            return false;
        }
        double d7 = c2tb.A00;
        if (d3 > d7 || d7 > d4) {
            return false;
        }
        double d8 = c2tb.A03;
        if (d3 > d8 || d8 > d4) {
            return false;
        }
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("(");
        sb.append(this.A01);
        sb.append(", ");
        sb.append(this.A03);
        sb.append(", ");
        sb.append(this.A02);
        sb.append(", ");
        sb.append(this.A00);
        sb.append(")");
        return sb.toString();
    }
}
