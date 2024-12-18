package X;

import sun.misc.Unsafe;

/* loaded from: classes10.dex */
public final class RLS extends SPW {
    @Override // X.SPW
    public final double A00(Object obj, long j) {
        return Double.longBitsToDouble(this.A00.getLong(obj, j));
    }

    @Override // X.SPW
    public final float A01(Object obj, long j) {
        return Float.intBitsToFloat(this.A00.getInt(obj, j));
    }

    public RLS(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // X.SPW
    public final void A02(Object obj, long j, double d) {
        this.A00.putLong(obj, j, Double.doubleToLongBits(d));
    }

    @Override // X.SPW
    public final void A03(Object obj, long j, float f) {
        this.A00.putInt(obj, j, Float.floatToIntBits(f));
    }
}
