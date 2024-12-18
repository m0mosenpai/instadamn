package X;

/* renamed from: X.4Ir, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4Ir {
    public final double A00;
    public final double A01;
    public final double A02;
    public final double A03;

    public final String toString() {
        return AnonymousClass001.A0t("{avg=", MSV.A00(70), "%}", Math.round(this.A03), Math.round(this.A02 * 100.0d));
    }

    public C4Ir(double d, double d2, double d3) {
        double d4;
        this.A03 = d;
        this.A00 = d2;
        this.A01 = d3;
        if (d > 0.0d) {
            d4 = d2 / d;
        } else {
            d4 = -1.0d;
        }
        this.A02 = d4;
    }
}
