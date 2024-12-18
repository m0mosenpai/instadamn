package X;

/* renamed from: X.62P, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C62P {
    public double A00;
    public double A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C62P) {
                C62P c62p = (C62P) obj;
                if (Double.compare(this.A01, c62p.A01) != 0 || Double.compare(this.A00, c62p.A00) != 0) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (AbstractC28006CWd.A00(this.A01) * 31) + AbstractC28006CWd.A00(this.A00);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ComplexDouble(_real=");
        sb.append(this.A01);
        sb.append(", _imaginary=");
        sb.append(this.A00);
        sb.append(')');
        return sb.toString();
    }
}
