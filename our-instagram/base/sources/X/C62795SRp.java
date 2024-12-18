package X;

/* renamed from: X.SRp, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62795SRp {
    public static final boolean A00(float f, float f2) {
        boolean isNaN = Float.isNaN(f);
        boolean isNaN2 = Float.isNaN(f2);
        if (!isNaN) {
            if (!isNaN2 && Math.abs(f2 - f) < 1.0E-5f) {
                return true;
            }
            return false;
        }
        if (isNaN2) {
            return true;
        }
        return false;
    }
}
