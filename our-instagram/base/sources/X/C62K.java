package X;

/* renamed from: X.62K, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C62K {
    public double A00;
    public double A01;
    public double A02;
    public double A03;
    public float A04;
    public float A05;
    public boolean A06;

    public final long A00(float f, float f2, long j) {
        double exp;
        double d;
        double d2;
        double d3;
        double d4;
        if (!this.A06) {
            if (this.A05 == Float.MAX_VALUE) {
                throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
            }
            float f3 = this.A04;
            double d5 = f3;
            double d6 = d5 * d5;
            if (f3 > 1.0f) {
                double d7 = this.A03;
                double d8 = (-f3) * d7;
                double sqrt = d7 * Math.sqrt(d6 - 1.0d);
                this.A02 = d8 + sqrt;
                this.A01 = d8 - sqrt;
            } else if (f3 >= 0.0f && f3 < 1.0f) {
                this.A00 = this.A03 * Math.sqrt(1.0d - d6);
            }
            this.A06 = true;
        }
        float f4 = this.A05;
        float f5 = f - f4;
        double d9 = j / 1000.0d;
        float f6 = this.A04;
        if (f6 > 1.0f) {
            double d10 = f5;
            double d11 = this.A01;
            double d12 = this.A02;
            double d13 = ((d11 * d10) - f2) / (d11 - d12);
            double d14 = d10 - d13;
            double exp2 = Math.exp(d11 * d9);
            double exp3 = Math.exp(d12 * d9);
            d = (exp2 * d14) + (exp3 * d13);
            d4 = (d14 * d11 * exp2) + (d13 * d12 * exp3);
        } else {
            if (f6 == 1.0f) {
                double d15 = this.A03;
                double d16 = f5;
                exp = f2 + (d15 * d16);
                double d17 = d16 + (exp * d9);
                double d18 = -d15;
                d3 = Math.exp(d18 * d9);
                d = d3 * d17;
                d2 = d * d18;
            } else {
                double d19 = this.A00;
                double d20 = f6;
                double d21 = this.A03;
                double d22 = f5;
                double d23 = (1.0d / d19) * ((d20 * d21 * d22) + f2);
                exp = Math.exp((-f6) * d21 * d9);
                double d24 = d19 * d9;
                double cos = Math.cos(d24);
                double sin = Math.sin(d24);
                d = exp * ((cos * d22) + (sin * d23));
                d2 = (-d21) * d * d20;
                d3 = ((-d19) * d22 * sin) + (d23 * d19 * cos);
            }
            d4 = d2 + (exp * d3);
        }
        return (Float.floatToRawIntBits((float) d4) & 4294967295L) | (Float.floatToRawIntBits((float) (d + f4)) << 32);
    }
}
