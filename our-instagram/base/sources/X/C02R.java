package X;

import java.util.Locale;

/* renamed from: X.02R, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C02R {
    public static void A00(int i) {
        if (i >= 0) {
        } else {
            throw new IllegalArgumentException();
        }
    }

    public static void A01(int i, int i2, String str, int i3) {
        if (i >= i2) {
            if (i <= i3) {
                return;
            } else {
                throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too high)", str, Integer.valueOf(i2), Integer.valueOf(i3)));
            }
        }
        throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too low)", str, Integer.valueOf(i2), Integer.valueOf(i3)));
    }

    public static void A02(int i, String str) {
        if (i >= 0) {
        } else {
            throw new IllegalArgumentException(str);
        }
    }

    public static void A03(Object obj, Object obj2) {
        if (obj != null) {
        } else {
            throw new NullPointerException(String.valueOf(obj2));
        }
    }

    public static void A05(boolean z) {
        if (z) {
        } else {
            throw new IllegalArgumentException();
        }
    }

    public static void A06(boolean z, Object obj) {
        if (z) {
        } else {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static void A07(boolean z, String str) {
        if (z) {
        } else {
            throw new IllegalStateException(str);
        }
    }

    public static void A04(String str, float f) {
        if (!Float.isNaN(f)) {
            if (!Float.isInfinite(f)) {
                return;
            } else {
                throw new IllegalArgumentException(AnonymousClass001.A0R(str, " must not be infinite"));
            }
        }
        throw new IllegalArgumentException(AnonymousClass001.A0R(str, " must not be NaN"));
    }
}
