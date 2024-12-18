package X;

/* loaded from: classes11.dex */
public abstract class WDn {
    public static void A00(Object obj) {
        if (obj != null) {
        } else {
            throw new IllegalStateException();
        }
    }

    public static void A01(boolean z) {
        if (z) {
        } else {
            throw new IllegalArgumentException();
        }
    }

    public static void A02(boolean z) {
        if (z) {
        } else {
            throw new IllegalStateException();
        }
    }

    public static void A03(boolean z, Object obj) {
        if (z) {
        } else {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }
}
