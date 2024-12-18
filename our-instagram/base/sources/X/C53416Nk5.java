package X;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.Nk5, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C53416Nk5 extends Number implements Serializable {
    public transient AtomicLong A00 = new AtomicLong(Double.doubleToRawLongBits(0.0d));

    public static double A00(C53416Nk5 c53416Nk5) {
        return Double.longBitsToDouble(c53416Nk5.A00.get());
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        return A00(this);
    }

    @Override // java.lang.Number
    public final float floatValue() {
        return (float) A00(this);
    }

    @Override // java.lang.Number
    public final int intValue() {
        return (int) A00(this);
    }

    @Override // java.lang.Number
    public final long longValue() {
        return (long) A00(this);
    }

    public final String toString() {
        return Double.toString(A00(this));
    }
}
