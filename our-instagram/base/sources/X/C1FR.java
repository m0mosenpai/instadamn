package X;

/* renamed from: X.1FR, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1FR {
    public boolean A01;
    public int A02;
    public final int A03 = (int) Math.ceil(1.0d / 0.18181818181818182d);
    public double A00 = -1.0d;

    public final void A00(double d) {
        double d2;
        this.A01 = true;
        double d3 = 1.0d - 0.18181818181818182d;
        int i = this.A02;
        int i2 = this.A03;
        double d4 = this.A00;
        if (i > i2) {
            d2 = (d4 * d3) + (0.18181818181818182d * d);
        } else {
            double d5 = i;
            d2 = (((d4 * d5) * d3) + d) / ((d5 * d3) + 1.0d);
        }
        this.A00 = d2;
        this.A02 = i + 1;
    }
}
