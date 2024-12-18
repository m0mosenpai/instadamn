package X;

/* loaded from: classes10.dex */
public final class SM6 {
    public static SM6 A03;
    public int A00;
    public long A01;
    public long A02;

    public final void A00(long j, double d, double d2) {
        double d3 = (0.01720197f * (((float) (j - 946728000000L)) / 8.64E7f)) + 6.24006f;
        double sin = Math.sin(d3);
        double sin2 = (sin * 0.03341960161924362d) + d3 + (Math.sin(2.0f * r4) * 3.4906598739326E-4d) + (Math.sin(r4 * 3.0f) * 5.236000106378924E-6d) + 1.796593063d + 3.141592653589793d;
        double round = ((float) Math.round((r6 - 9.0E-4f) - r1)) + 9.0E-4f + ((-d2) / 360.0d) + (sin * 0.0053d) + (Math.sin(2.0d * sin2) * (-0.0069d));
        double asin = Math.asin(Math.sin(sin2) * Math.sin(0.4092797040939331d));
        double d4 = 0.01745329238474369d * d;
        double sin3 = (Math.sin(-0.10471975803375244d) - (Math.sin(d4) * Math.sin(asin))) / (Math.cos(d4) * Math.cos(asin));
        if (sin3 >= 1.0d) {
            this.A00 = 1;
        } else if (sin3 <= -1.0d) {
            this.A00 = 0;
        } else {
            double acos = (float) (Math.acos(sin3) / 6.283185307179586d);
            long round2 = Math.round((round + acos) * 8.64E7d) + 946728000000L;
            this.A02 = round2;
            long round3 = Math.round((round - acos) * 8.64E7d) + 946728000000L;
            this.A01 = round3;
            if (round3 < j && round2 > j) {
                this.A00 = 0;
                return;
            } else {
                this.A00 = 1;
                return;
            }
        }
        this.A02 = -1L;
        this.A01 = -1L;
    }
}
