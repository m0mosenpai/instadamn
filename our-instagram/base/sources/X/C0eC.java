package X;

/* renamed from: X.0eC, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C0eC {
    public static final int A00(int i, int i2) {
        int i3 = i + (i >> 1);
        if (i3 - i2 < 0) {
            i3 = i2;
        }
        return i3 - 2147483639 > 0 ? i2 > 2147483639 ? Integer.MAX_VALUE : 2147483639 : i3;
    }

    public static final void A01(int i, int i2) {
        if (i <= i2) {
            if (0 <= i) {
                return;
            } else {
                throw new IllegalArgumentException(AnonymousClass001.A02(0, i, "startIndex: ", " > endIndex: "));
            }
        }
        throw new IndexOutOfBoundsException(AnonymousClass001.A0p("startIndex: ", ", endIndex: ", ", size: ", 0, i, i2));
    }

    public static final void A02(int i, int i2) {
        if (i >= 0 && i < i2) {
        } else {
            throw new IndexOutOfBoundsException(AnonymousClass001.A02(i, i2, "index: ", ", size: "));
        }
    }

    public static final void A03(int i, int i2) {
        if (i >= 0 && i <= i2) {
        } else {
            throw new IndexOutOfBoundsException(AnonymousClass001.A02(i, i2, "index: ", ", size: "));
        }
    }

    public static final void A04(int i, int i2, int i3) {
        if (i >= 0 && i2 <= i3) {
            if (i <= i2) {
                return;
            } else {
                throw new IllegalArgumentException(AnonymousClass001.A02(i, i2, "fromIndex: ", " > toIndex: "));
            }
        }
        throw new IndexOutOfBoundsException(AnonymousClass001.A0p("fromIndex: ", ", toIndex: ", ", size: ", i, i2, i3));
    }
}
