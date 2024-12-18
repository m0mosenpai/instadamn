package X;

/* renamed from: X.07S, reason: invalid class name */
/* loaded from: classes.dex */
public enum C07S {
    DESTROYED,
    INITIALIZED,
    CREATED,
    STARTED,
    RESUMED;

    public final boolean A00(C07S c07s) {
        if (compareTo(c07s) < 0) {
            return false;
        }
        return true;
    }
}
