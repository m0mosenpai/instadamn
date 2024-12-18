package X;

/* renamed from: X.5aZ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC119175aZ {
    public static final long A00 = AbstractC119165aY.A00(Float.NaN, Float.NaN);

    public static final float A00(long j) {
        if (j != A00) {
            return Float.intBitsToFloat((int) (j >> 32));
        }
        AbstractC28290Cdc.A01("ScaleFactor is unspecified");
        throw C00O.createAndThrow();
    }

    public static final float A01(long j) {
        if (j != A00) {
            return Float.intBitsToFloat((int) (j & 4294967295L));
        }
        AbstractC28290Cdc.A01("ScaleFactor is unspecified");
        throw C00O.createAndThrow();
    }
}
