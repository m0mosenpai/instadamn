package X;

/* renamed from: X.6C4, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C6C4 {
    public static final void A00(int i, int i2) {
        if (i >= 0 && i < i2) {
        } else {
            throw new IndexOutOfBoundsException(AnonymousClass001.A02(i, i2, "index: ", ", size: "));
        }
    }

    public static final void A01(int i, int i2) {
        if (i >= 0 && i <= i2) {
        } else {
            throw new IndexOutOfBoundsException(AnonymousClass001.A02(i, i2, "index: ", ", size: "));
        }
    }

    public static final void A02(int i, int i2, int i3) {
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
