package X;

/* renamed from: X.1BW, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1BW {
    public final C1BR A00;

    public final Integer A00(double d) {
        double d2 = (d * 8.0d) / 1000.0d;
        if (d2 < 0.0d) {
            return C05F.A00;
        }
        if (d2 < 3.0d) {
            return C05F.A01;
        }
        if (d2 < 8.0d) {
            return C05F.A0C;
        }
        if (d2 < 20.0d) {
            return C05F.A0N;
        }
        return C05F.A0Y;
    }

    public C1BW(C1BR c1br) {
        this.A00 = c1br;
    }
}
