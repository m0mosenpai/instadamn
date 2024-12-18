package X;

/* renamed from: X.4B8, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C4B8 {
    public static void A00(int i, int i2) {
        if (i >= 0 && i < i2) {
        } else {
            throw new IndexOutOfBoundsException(String.format("Index: %d. Start: %d. Limit: %d", Integer.valueOf(i), 0, Integer.valueOf(i2)));
        }
    }

    public static void A01(Object obj) {
        if (obj != null) {
        } else {
            throw new IllegalStateException();
        }
    }

    public static void A02(Object obj) {
        if (obj != null) {
        } else {
            throw new IllegalStateException(String.valueOf("The uri must be set."));
        }
    }

    public static void A03(boolean z) {
        if (z) {
        } else {
            throw new IllegalArgumentException();
        }
    }

    public static void A04(boolean z) {
        if (z) {
        } else {
            throw new IllegalStateException();
        }
    }

    public static void A05(boolean z, Object obj) {
        if (z) {
        } else {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }
}
