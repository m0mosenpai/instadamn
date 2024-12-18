package X;

/* renamed from: X.07P, reason: invalid class name */
/* loaded from: classes.dex */
public final class C07P {
    public static final C07R A00(C07S c07s) {
        C14360o3.A0B(c07s, 0);
        int ordinal = c07s.ordinal();
        if (ordinal != 2) {
            if (ordinal != 3) {
                if (ordinal != 4) {
                    return null;
                }
                return C07R.ON_PAUSE;
            }
            return C07R.ON_STOP;
        }
        return C07R.ON_DESTROY;
    }

    public static final C07R A01(C07S c07s) {
        C14360o3.A0B(c07s, 0);
        int ordinal = c07s.ordinal();
        if (ordinal != 2) {
            if (ordinal != 3) {
                if (ordinal != 4) {
                    return null;
                }
                return C07R.ON_RESUME;
            }
            return C07R.ON_START;
        }
        return C07R.ON_CREATE;
    }
}
