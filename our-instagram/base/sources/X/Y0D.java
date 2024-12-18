package X;

/* loaded from: classes12.dex */
public final class Y0D {
    public final long A00;
    public final long A01;
    public final long A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;

    public Y0D(double d, long j, boolean z, boolean z2, boolean z3) {
        this.A03 = z;
        this.A01 = j;
        this.A04 = z2;
        this.A05 = z3;
        this.A02 = C1H4.A02(d * 1000.0d);
        this.A00 = C1H4.A02((d / (j + 1)) * 1000.0d);
    }

    public Y0D() {
        this(3.0d, 5L, false, true, false);
    }
}
