package X;

/* renamed from: X.2S4, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2S4 {
    public final boolean A00() {
        C04280Ku c04280Ku;
        long j;
        if (C0L6.A04 == null) {
            c04280Ku = null;
        } else {
            c04280Ku = C0L6.A04.A01;
        }
        if (c04280Ku == null) {
            return false;
        }
        synchronized (c04280Ku) {
            j = c04280Ku.A02;
        }
        if (j <= 0) {
            return false;
        }
        return true;
    }
}
