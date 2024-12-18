package X;

/* renamed from: X.8wo, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public class C202088wo {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Double A03;
    public final Double A04;

    public static double A00(int i) {
        double d = i;
        if (!Double.isNaN(d) && i >= -2592000 && i <= 2592000) {
            return d / 14400.0d;
        }
        throw new IllegalArgumentException(AnonymousClass001.A0O("Invalid coordiante value:", i));
    }

    public C202088wo(Double d, Double d2, int i, int i2, int i3) {
        this.A01 = i;
        this.A02 = i2;
        this.A00 = i3;
        this.A03 = d;
        this.A04 = d2;
    }
}
